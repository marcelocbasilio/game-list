package com.mar.game_list.dtos;

import com.mar.game_list.entities.Game;

import java.io.Serializable;
import java.util.Objects;

public class GameMinDto implements Serializable {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDto() {
    }

    public GameMinDto(Game game) {
        id = game.getId();
        title = game.getTitle();
        year = game.getYear();
        imgUrl = game.getImgUrl();
        shortDescription = game.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameMinDto entity = (GameMinDto) o;
        return Objects.equals(this.id, entity.id) &&
               Objects.equals(this.title, entity.title) &&
               Objects.equals(this.year, entity.year) &&
               Objects.equals(this.imgUrl, entity.imgUrl) &&
               Objects.equals(this.shortDescription, entity.shortDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, year, imgUrl, shortDescription);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
               "id = " + id + ", " +
               "title = " + title + ", " +
               "year = " + year + ", " +
               "imgUrl = " + imgUrl + ", " +
               "shortDescription = " + shortDescription + ")";
    }
}