package com.elhackarz.fehu2026.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.elhackarz.fehu2026.models.Assignments;
import com.elhackarz.fehu2026.models.Lectures;
import com.elhackarz.fehu2026.models.Subjects;
import com.elhackarz.fehu2026.repositories.AssignmentsRepo;
import com.elhackarz.fehu2026.repositories.LecturesRepo;
import com.elhackarz.fehu2026.repositories.SubjectsRepo;
@RestController
@RequestMapping("/api")
public class GetApi {
    private final LecturesRepo lecturesrepo;
    private final SubjectsRepo subjectsrepo;
 private final AssignmentsRepo AssignmentsRepo;
    public GetApi(LecturesRepo lecturesrepo, SubjectsRepo subjectsrepo,AssignmentsRepo AssignmentsRepo) {
        this.lecturesrepo = lecturesrepo;
        this.subjectsrepo = subjectsrepo;
        this.AssignmentsRepo = AssignmentsRepo;
    }
   
    @PostMapping("/addsubject")
    public Subjects addSubject(@RequestBody Subjects subject) {
        return subjectsrepo.save(subject);
    }

    @PostMapping("/addlecture")
    public Lectures addLecture(@RequestBody Lectures lecture) {
        return lecturesrepo.save(lecture);
    }

    @GetMapping("/lecturesbysubject")
    public List<Lectures> getBySubject(@RequestParam String name) {
        return lecturesrepo.findBySubject(name);
    }

    @GetMapping("/getlectures")
    public List<Lectures> getLectures() {
        return lecturesrepo.findAll();
    }

    @GetMapping("/getsubjects")
    public List<Subjects> getSubjects() {
        return subjectsrepo.findAll();
    }

    @GetMapping("/Assignments/{subjectId}")
    public List<Assignments> getExamsBySubject(@PathVariable Long subjectId) {
    return AssignmentsRepo.findBySubjectId(subjectId);
    }


}

 

 

    
