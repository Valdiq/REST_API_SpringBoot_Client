package com.example.rest_api_project.service.impl;

import com.example.rest_api_project.dto.PlayerDTO;
import com.example.rest_api_project.entity.Club;
import com.example.rest_api_project.entity.Player;
import com.example.rest_api_project.repository.ClubRepo;
import com.example.rest_api_project.repository.PlayerRepo;
import com.example.rest_api_project.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService {


    @Autowired
    private PlayerRepo playerRepo;

    @Autowired
    private ClubRepo clubRepo;


    @Override
    public Player getById(int id) {

        Player player = null;

        Optional<Player> optional = playerRepo.findById(id);

        if (optional.isPresent()) {
            player = optional.get();
        }

        return player;

    }

    @Override
    public List<Player> getAll() {

        List<Player> players = playerRepo.findAll();

        return players;
    }

/*    @Override
    public void save(Player player, int clubId) {

        Club club = null;

        Optional<Club> optional = clubRepo.findById(clubId);

        if (optional.isPresent()) {
            club = optional.get();
        }

        player.setClub(club);

        playerRepo.save(player);
    }*/

/*
    @Override
    public void save(PlayerDTO playerDTO) {

*/
/*        Club club = Club.builder()
                .name(playerDTO.getClubDTO().getName())
                .country(playerDTO.getClubDTO().getCountry())
                .league(playerDTO.getClubDTO().getLeague())
                .director(playerDTO.getClubDTO().getDirector())
                .netWorth(playerDTO.getClubDTO().getNetworth())
                .build();*//*


        Club club = clubRepo.findById(playerDTO.getClubId()).orElseThrow(() -> new RuntimeException("Club not Found!"));


        playerRepo.save(Player.builder()
                .name(playerDTO.getName())
                .surname(playerDTO.getSurname())
                .age(playerDTO.getAge())
                .nationality(playerDTO.getNationality())
                .clubId(club)
                .salary(playerDTO.getSalary())
                .build());
    }
*/

    @Override
    public void save(PlayerDTO playerDTO) {

        Club club = null;

        Optional<Club> optional = clubRepo.findById(playerDTO.getClub());

        if (optional.isPresent()) {
            club = optional.get();
        }

        Player player = new Player();
        player.setName(playerDTO.getName());
        player.setSurname(playerDTO.getSurname());
        player.setAge(playerDTO.getAge());
        player.setNationality(playerDTO.getNationality());
        player.setSalary(playerDTO.getSalary());
        player.setClub(club);

        playerRepo.save(player);
    }

    @Override
    public void update(PlayerDTO playerDTO) {
        Club club = null;

        Optional<Club> optional = clubRepo.findById(playerDTO.getClub());

        if (optional.isPresent()) {
            club = optional.get();
        }

        Player player = new Player();
        player.setId(playerDTO.getId());
        player.setName(playerDTO.getName());
        player.setSurname(playerDTO.getSurname());
        player.setAge(playerDTO.getAge());
        player.setNationality(playerDTO.getNationality());
        player.setSalary(playerDTO.getSalary());
        player.setClub(club);

        playerRepo.save(player);
    }

    @Override
    public void deleteById(int id) {
        playerRepo.deleteById(id);
    }

/*    @Override
    public List<Player> findByClubId(int id) {
        List<Player> players = playerRepo.findByClubId(id);

        return players;
    }*/
}
