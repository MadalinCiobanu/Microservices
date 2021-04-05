package com.codecool.videoservice.repositories;

import com.codecool.videoservice.models.VideoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<VideoItem, Long> {



}
