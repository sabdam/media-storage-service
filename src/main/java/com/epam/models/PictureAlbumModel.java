package com.epam.models;

import java.time.LocalDateTime;

public class PictureAlbumModel extends MediaProductModel {
    private Integer order;

    public PictureAlbumModel(Integer id, String name, String description, Integer order, LocalDateTime createDateTime) {
        super(id, name, description, createDateTime);
        this.order = order;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
}
