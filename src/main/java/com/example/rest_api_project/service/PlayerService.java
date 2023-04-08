package com.example.rest_api_project.service;

import com.example.rest_api_project.dto.PlayerDTO;
import com.example.rest_api_project.entity.Club;
import com.example.rest_api_project.entity.Player;

import java.util.List;

public interface PlayerService {

    public Player getById(int id);

    public List<Player> getAll();

    // public void save(Player player, int clubId);

    public void save(PlayerDTO playerDTO);

    public List<Player> findAllByClub(Club club);

    public void update(PlayerDTO playerDTO);

    public void deleteById(int id);


}
