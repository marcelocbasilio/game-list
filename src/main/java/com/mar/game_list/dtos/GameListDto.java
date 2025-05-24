package com.mar.game_list.dtos;

import com.mar.game_list.entities.GameList;

import java.util.Objects;

public class GameListDto {

    private Long id;
    private String name;

    public GameListDto() {}

    public GameListDto(GameList list)  {
        id = list.getId();
        name = list.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GameListDto that = (GameListDto) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
