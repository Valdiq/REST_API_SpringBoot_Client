package com.example.rest_api_project.dto;

import com.example.rest_api_project.entity.Player;
import lombok.Data;

import java.util.List;

@Data
public class ClubDTO {
    private String name;
    private String country;
    private String league;
    private String director;
    private int netWorth;
    private List<Player> players;
}
