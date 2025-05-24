package com.mar.game_list.repositories;

import com.mar.game_list.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
