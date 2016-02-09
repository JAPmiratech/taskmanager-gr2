package com.miratech.training;

import java.util.Date;
import java.util.Queue;

/**
 * Created by vsytnyk on 17.12.2015.
 */
public interface Task<T> {
    Integer getTaskID();
    void setTaskID(Integer taskID);
    //Status getStatus();
    //void setStatus(Status status);
    public <T> T getAssignee();
    //void setAssignee(Person assignee);
    //Type getType();
    //void setType(Type type);
    //Priority getPriority();
    //void setPriority(Priority priority);
    String getDescription();
    void setDescription(String description);
    String getSummary();
    void setSummary(String summary);
    //Queue<Comment> getComments();
    //void addComment(Comment comment);
    Date getDeadline();
    void setDeadline(Date deadline);
    Date getCreteDate();
    void setCreateDate(Date creationDate);
    public <T> T getReporter();
    void setReporter(T reporter);
    
}
