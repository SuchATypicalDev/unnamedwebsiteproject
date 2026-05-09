package com.elhackarz.fehu2026.models;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Assignments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String assignmentName; 
    
    @Column(length = 500) 
    private String driveUrl; 

    @ManyToOne 
    @JoinColumn(name = "subject_id") 
    @JsonIgnore 
    private Subjects subject;

    public Assignments() {}

    
    public Long getId() { return id; }
    public String getassignmentName() { return assignmentName; }
    public void setassignmentName(String assignmentName) { this.assignmentName = assignmentName; }
    public String getDriveUrl() { return driveUrl; }
    public void setDriveUrl(String driveUrl) { this.driveUrl = driveUrl; }
    public Subjects getSubject() { return subject; }
    public void setSubject(Subjects subject) { this.subject = subject; }
}