package com.geekbrains.training.homework2NY.controllers;

import com.geekbrains.training.homework2NY.service.TaskService;
import com.geekbrains.training.homework2NY.object.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/task")
public class TaskController {
    TaskService taskService;

    @Autowired
    public void setTaskService(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(path = "/")
    public String showTasks(
            Model model,
            @RequestParam(value = "id", required = false) Long id,
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "executer", required = false) String executer,
            @RequestParam(value = "status", required = false) Task.StatusTask status,
            @RequestParam(value = "owner", required = false) String owner,
            @RequestParam(value = "desc", required = false) String desc
    ) {
        if (id != null | name != null | executer != null | status != null | owner != null | desc != null)
        {
            Task  example = new Task();
            example.setIdTask(id);
            example.setNameTask(name);
            example.setExecuterTask(executer);
            example.setStatusTask(status);
            example.setOwnerTask(owner);
            example.setDescTask(desc);

            model.addAttribute("id",id);
            model.addAttribute("name",name);
            model.addAttribute("executer",executer);
            model.addAttribute("status", status);
            model.addAttribute("owner", owner);
            model.addAttribute("desc", desc);

            model.addAttribute("task",taskService.getTaskByExample(example));
        } else
        {model.addAttribute("tasks", taskService.sortByStatusTaskList());}

        return "tasks";
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String showTaskByStatus(Model model, @PathVariable Task.StatusTask status) {
        model.addAttribute("tasks", taskService.taskListByStatus(status));
        return "tasks";
    }

    @RequestMapping(path = "/add", method = RequestMethod.GET)
    public String taskAddForm(@ModelAttribute("task") Task task) {
        return "tasks_form";
    }

    @RequestMapping(path = "/task_form_processing", method = RequestMethod.POST)
    public String taskAddFormProc(@ModelAttribute("task") Task task) {
        taskService.addTask(task);
        return "redirect:/tasks/";
      }
}
