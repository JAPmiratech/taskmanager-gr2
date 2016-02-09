package com.miratech.training;

import java.util.Date;
import java.util.List;

/**
 * Created by vsytnyk on 17.12.2015.
 */
public interface Employee {
    /**
     * TODO Getter and setter to parameters
     *
     */

    boolean isEmployeeActive();


    void addTaskToUser(Task task);
    void deleteTaskFromUser(Task task);

    /**
    (by emloyeee id);
     */
    Task getCurrentTask();

    /**
     *  (by emloyeee id);
     */
    List<Task>  getTasksList();



    boolean startTaskProgress(int taskId);
    boolean completeTask(int taskId);
    boolean openTask(int taskId);

    void addTaskToEmployee(Employee emp, Task task);

    void reportTime(Task taskId, Date time);

    //TaskReport getWorkingTimeByTask(Date startDate, Date endDate, int taskId);

    //TaskReport getWorkingTime(Date startDate, Date endDate);
    
}
