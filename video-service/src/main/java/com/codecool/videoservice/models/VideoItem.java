package com.codecool.videoservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
public class VideoItem {

    public VideoItem(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Id @GeneratedValue
    private long id;

    private String name;

    private String url;

}
