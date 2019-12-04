package com.geekbrains.training.homework2NY.controllers;

import com.geekbrains.training.homework2NY.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MainController {
    TaskService taskService;

    @Autowired
    public void setTaskService(TaskService taskService) {
        this.taskService = taskService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showHomePage(Model model) {
        model.addAttribute("tasksByStatus", taskService.countOfAllStatus());
        return "index";
    }
}