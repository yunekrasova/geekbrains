create table task (
      ID number(15),
      CAPTION varchar2(255),
      OWNER varchar2(255),
      STATUS varchar2(32),
      ASSIGNED varchar2(255),
      DESCRIPTION varchar2(255),
      primary key(id));

insert into TASK(CAPTION, OWNER, STATUS, ASSIGNED, DESCRIPTION) values
('Task 1', 'Somebody', 'CREATED', 'Executor', 'Description 1'),
('Task 2', 'Somebody', 'CREATED', 'Executor', 'Description 2'),
('Task 3', 'Somebody', 'CREATED', 'Executor', 'Description 3');