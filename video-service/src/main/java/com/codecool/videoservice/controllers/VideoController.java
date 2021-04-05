package com.codecool.videoservice.controllers;

import com.codecool.videoservice.models.VideoCollection;
import com.codecool.videoservice.repositories.VideoRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
@RequestMapping("/")
public class VideoController {

    VideoRepository videoRepository;

    @RequestMapping("/list")
    public VideoCollection getVideoList() {
        return new VideoCollection(videoRepository.findAll());
    }

}
