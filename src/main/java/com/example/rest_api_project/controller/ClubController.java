package com.example.rest_api_project.controller;

import com.example.rest_api_project.entity.Club;
import com.example.rest_api_project.exception.NotFoundException;
import com.example.rest_api_project.service.impl.ClubServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clubs")
public class ClubController {

    @Autowired
    private ClubServiceImpl clubService;


    @GetMapping("/{id}")
    public Club getById(@PathVariable int id) {

        if (clubService.getById(id) == null) {
            throw new NotFoundException("Club with ID: " + id + " not found!");
        }

        return clubService.getById(id);
    }

    @GetMapping("/")
    public List<Club> getAll() {
        return clubService.getAll();
    }

    @PostMapping("/")
    public void save(@RequestBody Club club) {
        clubService.save(club);
    }

    @PutMapping("/")
    public void update(@RequestBody Club club) {
        clubService.save(club);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        clubService.deleteById(id);
    }

}
