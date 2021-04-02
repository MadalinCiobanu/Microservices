package com.codecool.videorecommendationservice.controllers;

import com.codecool.videorecommendationservice.models.VideoRecommendationCollection;
import com.codecool.videorecommendationservice.repositories.VideoRecRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
@RequestMapping("/")
public class VideoRecommendationController {

    VideoRecRepository videoRecRepository;

    @RequestMapping("/video/{videoId}")
    public VideoRecommendationCollection getVideoRecList (@PathVariable("videoId") long videoId) {
        return new VideoRecommendationCollection(videoRecRepository.findAllByVideoId(videoId));
    }

}
