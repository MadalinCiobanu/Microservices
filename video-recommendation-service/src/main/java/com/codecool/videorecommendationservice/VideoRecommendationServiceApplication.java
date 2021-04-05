package com.codecool.videorecommendationservice;

import com.codecool.videorecommendationservice.models.VideoRecommendationItem;
import com.codecool.videorecommendationservice.repositories.VideoRecRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
@EnableEurekaClient
public class VideoRecommendationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideoRecommendationServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner (VideoRecRepository videoRecRepository) {
        return args -> {
            videoRecRepository.saveAll(Arrays.asList(new VideoRecommendationItem(3, "nice", 1),
                    new VideoRecommendationItem(4 , "good", 1)));
        };
    }

}
