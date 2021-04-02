package com.codecool.videoservice.controllers;

import com.codecool.videoservice.models.VideoCollection;
import com.codecool.videoservice.models.VideoItem;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/")
public class VideoController {

    @RequestMapping("/list")
    public VideoCollection getVideoList() {
        return new VideoCollection(Arrays.asList(new VideoItem(1, "bla", "bla bla"),
                new VideoItem(2, "blaa", "blaa blaa")));
    }

}
