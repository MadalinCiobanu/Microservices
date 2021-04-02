package com.codecool.videorecommendationservice.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter @Setter
@NoArgsConstructor
@Entity
public class VideoRecommendationItem {

    public VideoRecommendationItem(int rating, String comment, long videoId) {
        if (rating < 1) {
            this.rating = 1;
        } else this.rating = Math.min(rating, 5);

        this.comment = comment;
        this.videoId = videoId;
    }

    @Id @GeneratedValue
    private long id;

    private int rating;

    private String comment;

    private long videoId;

}
