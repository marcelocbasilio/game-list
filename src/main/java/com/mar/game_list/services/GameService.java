package com.mar.game_list.services;

import com.mar.game_list.dtos.GameMinDto;
import com.mar.game_list.entities.Game;
import com.mar.game_list.repositories.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<GameMinDto> findAll() {
        List<Game> games = gameRepository.findAll();
        return games.stream().map(GameMinDto::new).toList();
    }
}
