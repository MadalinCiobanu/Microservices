package com.codecool.videorecommendationservice.repositories;

import com.codecool.videorecommendationservice.models.VideoRecommendationItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VideoRecRepository extends JpaRepository<VideoRecommendationItem, Long> {

    List<VideoRecommendationItem> findAllByVideoId (long videoId);

}
