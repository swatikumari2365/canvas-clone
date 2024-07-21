package com.swati.canvas_clone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swati.canvas_clone.model.Image;

public interface ImageRepository extends JpaRepository<Image,Long> {

}
