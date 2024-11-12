package com.javagames.dslist.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javagames.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
