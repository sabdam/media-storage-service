package com.epam.models;

import java.time.LocalDateTime;

public class MusicAlbumModel extends MediaProductModel {
    private Integer order;

    public MusicAlbumModel(Integer id, String name, String artist, String description, Integer order, LocalDateTime createDateTime) {
        super(id, name, artist, description, createDateTime);
        this.order = order;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

}
