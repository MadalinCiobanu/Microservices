package com.codecool.videoservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class VideoRecommendationCollection {

    List<VideoRecommendationItem> videoRecommendationList;

}
