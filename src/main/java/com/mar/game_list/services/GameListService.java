package com.mar.game_list.services;

import com.mar.game_list.dtos.GameListDto;
import com.mar.game_list.entities.GameList;
import com.mar.game_list.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDto> findAll() {
        List<GameList> list = gameListRepository.findAll();
        return list.stream().map(x -> new GameListDto(x)).toList();
    }
}
