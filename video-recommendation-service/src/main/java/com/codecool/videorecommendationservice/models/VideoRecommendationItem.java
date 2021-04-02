package com.codecool.videorecommendationservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class VideoRecommendationItem {

    private long id;
    private int rating;
    private String comment;
    private long videoId;

}
