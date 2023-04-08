package com.example.rest_api_project.service.impl;


import com.example.rest_api_project.entity.Club;
import com.example.rest_api_project.repository.ClubRepo;
import com.example.rest_api_project.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClubServiceImpl implements ClubService {

    @Autowired
    private ClubRepo clubRepo;


    @Override
    public Club getById(int id) {

/*        Club club = null;

        Optional<Club> optional = clubRepo.findById(id);

        if (optional.isPresent()) {
            club = optional.get();
        }
        return club;
*/

        return clubRepo.findById(id).orElseThrow(() -> new RuntimeException("Club not found!"));
    }

    @Override
    public List<Club> getAll() {

        List<Club> clubs = clubRepo.findAll();

        return clubs;

    }

    @Override
    public void save(Club club) {
        clubRepo.save(club);
    }

    @Override
    public void deleteById(int id) {
        clubRepo.deleteById(id);
    }
}
