package com.mock.summary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mock.summary.model.Summary;
import com.mock.summary.repository.SummaryRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/summary")
public class SummaryController {
    

    @Autowired
    private SummaryRepository summaryRepo;

    @PostMapping("/add")
    public void addInSummary(@RequestBody Summary summary){
       summaryRepo.save(summary);
    }

    @GetMapping("")
    public List<Summary> getSummary(){
        return summaryRepo.findAll();
    }

    @DeleteMapping("/delete")
    public void deleteSummary(){
        summaryRepo.deleteAll();
    }
}
