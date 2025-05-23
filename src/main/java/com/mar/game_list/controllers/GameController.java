package com.mar.game_list.controllers;

import com.mar.game_list.dtos.GameMinDto;
import com.mar.game_list.services.GameService;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping
    public List<GameMinDto> findAll() {
        return gameService.findAll();
    }
}
