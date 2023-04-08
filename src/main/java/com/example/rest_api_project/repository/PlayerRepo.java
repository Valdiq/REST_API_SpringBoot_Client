package com.example.rest_api_project.repository;

import com.example.rest_api_project.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepo extends JpaRepository<Player, Integer> {

}
