package com.codecool.videoservice.controllers;

import com.codecool.videoservice.models.VideoCollection;
import com.codecool.videoservice.models.VideoInfo;
import com.codecool.videoservice.models.VideoItem;
import com.codecool.videoservice.models.VideoRecommendationCollection;
import com.codecool.videoservice.repositories.VideoRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@AllArgsConstructor
@RequestMapping("/")
public class VideoController {

    private final RestTemplate restTemplate;

    private final VideoRepository videoRepository;

    @RequestMapping("/list")
    public VideoCollection getVideoList() {
        return new VideoCollection(videoRepository.findAll());
    }

    @RequestMapping("/video/{videoId}")
    public VideoInfo getVideoById (@PathVariable("videoId") long videoId) {

        VideoRecommendationCollection videoRecs = restTemplate.getForObject("http://video-recommendation-service/video/" + videoId, VideoRecommendationCollection.class);

        VideoItem videoItem = videoRepository.findById(videoId).orElseThrow(IllegalArgumentException::new);

        return new VideoInfo(videoItem.getName(), videoItem.getUrl(), videoRecs);
    }

}
