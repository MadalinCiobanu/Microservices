package com.codecool.videorecommendationservice.controllers;

import com.codecool.videorecommendationservice.models.VideoRecommendationCollection;
import com.codecool.videorecommendationservice.models.VideoRecommendationItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/")
public class VideoRecommendationController {

    @RequestMapping("/video/{videoId}")
    public VideoRecommendationCollection getVideoRecList (@PathVariable("videoId") long videoId) {
        return new VideoRecommendationCollection(Arrays.asList(new VideoRecommendationItem(1, 4, "bla bla", videoId),
                new VideoRecommendationItem(2, 3, "bla", videoId)));
    }

}
