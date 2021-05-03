package com.example.mysql_connection.models;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private boolean isUrgent;
    private boolean isDone;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime creationDate;
    private static final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    @Temporal(TemporalType.DATE)
    private Date dueDate;


    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getDueDate() {
        return dueDate;
    }


    @ManyToOne
    private Assignee assignee;

    public Todo(){
    }

    public Todo(String title, boolean isUrgent, boolean isDone, Date dueDate){
        this.title = title;
        this.isUrgent = isUrgent;
        this.isDone = isDone;
        this.dueDate = dueDate;
    }

    private String fixedTime(LocalDateTime localDateTime) {
        if (localDateTime != null) {
            return localDateTime.format(timeFormatter);
        }
        return "";
    }

    public Todo(String title){
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isUrgent() {
        return isUrgent;
    }

    public void setUrgent(boolean isUrgent) {
        this.isUrgent = isUrgent;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setIsDone(boolean done) {
        this.isDone = done;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    @PrePersist
    private void setCreateTime() {
        this.creationDate = LocalDateTime.now();
    }

    public String getFixedCreationDate(){
       return fixedTime(creationDate);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }
}
