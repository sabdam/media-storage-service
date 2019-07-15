package com.epam.models;

import java.time.LocalDateTime;

public class AudioBooksAlbumModel extends MediaProductModel {
    private Integer order;
    private String artist;
    private String writer;

    public AudioBooksAlbumModel(Integer id, String name, String artist, String writer, String description, Integer order, LocalDateTime createDateTime) {
        super(id, name, artist, description, createDateTime);
        this.order = order;
        this.writer = writer;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
