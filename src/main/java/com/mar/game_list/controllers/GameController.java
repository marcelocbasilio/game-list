package com.mar.game_list.controllers;

import com.mar.game_list.dtos.GameDto;
import com.mar.game_list.dtos.GameMinDto;
import com.mar.game_list.services.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping(value = "/{id}")
    public GameDto findById(@PathVariable Long id) {
        return gameService.findById(id);
    }

    @GetMapping
    public List<GameMinDto> findAll() {
        return gameService.findAll();
    }
}
