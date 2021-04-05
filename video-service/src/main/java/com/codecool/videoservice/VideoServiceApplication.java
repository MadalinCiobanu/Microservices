package com.codecool.videoservice;

import com.codecool.videoservice.models.VideoItem;
import com.codecool.videoservice.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;


@SpringBootApplication
public class VideoServiceApplication {

    @Bean
    public RestTemplate getRestTemplate () {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(VideoServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner (VideoRepository videoRepository) {
        return args -> {
            videoRepository.saveAll(Arrays.asList(new VideoItem("Click", "https://www.youtube.com/watch?v=zZNC5emNyEQ"),
                    new VideoItem("The Blind Side", "https://www.youtube.com/watch?v=gvqj_Tk_kuM"),
                    new VideoItem("Goal", "https://www.youtube.com/watch?v=JC5oaVR9QYA"),
                    new VideoItem("Law Abiding Citizen", "https://www.youtube.com/watch?v=LX6kVRsdXW4")));
        };
    }

}
