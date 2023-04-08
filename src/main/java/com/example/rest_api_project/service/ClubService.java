package com.example.rest_api_project.service;

import com.example.rest_api_project.entity.Club;
import java.util.List;

public interface ClubService {

    public Club getById(int id);

    public List<Club> getAll();

    public void save(Club club);

    public void deleteById(int id);

}
