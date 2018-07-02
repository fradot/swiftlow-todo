package com.swiftlow.component.todo.swiftlowtodo.model;

import org.apache.catalina.User;

import java.util.Date;

public class Todo {

    private long id;
    private String description;
    private Date dueDate;
    private Date createDate;
    private String raw;
    private String assignee; // TODO: this should be a User object
    private boolean closed = false;
    private long tcompId = 1; // TODO: do I need this here?
    private String type = "TODO"; // TODO: extract constant - re-think on the component handling

    public Todo(long id, String description, Date dueDate, String raw, String assignee) {
        this.id = id;
        this.description = description;
        this.dueDate = dueDate;
        this.raw = raw;
        this.assignee = assignee;
        this.createDate = new Date();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public long getTcompId() {
        return tcompId;
    }

    public void setTcompId(long tcompId) {
        this.tcompId = tcompId;
    }
}
