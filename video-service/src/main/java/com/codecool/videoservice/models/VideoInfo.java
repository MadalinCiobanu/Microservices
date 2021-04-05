package com.codecool.videoservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VideoInfo {

    private String name;

    private String url;

    private VideoRecommendationCollection videoRecs;

}
