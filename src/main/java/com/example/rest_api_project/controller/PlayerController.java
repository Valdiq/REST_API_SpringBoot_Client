package com.example.rest_api_project.controller;

import com.example.rest_api_project.dto.PlayerDTO;
import com.example.rest_api_project.entity.Club;
import com.example.rest_api_project.entity.Player;
import com.example.rest_api_project.service.impl.ClubServiceImpl;
import com.example.rest_api_project.service.impl.PlayerServiceImpl;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

    @Autowired
    private PlayerServiceImpl playerService;

    @Autowired
    private ClubServiceImpl clubService;


    @GetMapping("/{id}")
    public Player getById(@PathVariable int id) {
        return playerService.getById(id);
    }

    @GetMapping("/")
    public List<Player> getAll() {
        return playerService.getAll();
    }

    @PostMapping("/")
    public void save(@RequestBody PlayerDTO playerDTO) {

        playerService.save(playerDTO);

       // playerService.save(player);

    }

    @PutMapping("/")
    public void update(@RequestBody PlayerDTO playerDTO) {

        playerService.update(playerDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        playerService.deleteById(id);
    }

}