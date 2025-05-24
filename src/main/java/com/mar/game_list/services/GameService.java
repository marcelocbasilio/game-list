package com.mar.game_list.services;

import com.mar.game_list.dtos.GameDto;
import com.mar.game_list.dtos.GameMinDto;
import com.mar.game_list.entities.Game;
import com.mar.game_list.projections.GameMinProjection;
import com.mar.game_list.repositories.GameRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Transactional(readOnly = true)
    public GameDto findById(Long id) {
        Game game = gameRepository.findById(id).get();
        return new GameDto(game);
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findAll() {
        List<Game> games = gameRepository.findAll();
        return games.stream().map(GameMinDto::new).toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findByList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDto(x)).toList();
    }
}
