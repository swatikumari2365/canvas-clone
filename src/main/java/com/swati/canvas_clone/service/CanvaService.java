package com.swati.canvas_clone.service;
import java.util.List;
import java.util.Optional;

import com.swati.canvas_clone.dto.ImageDto;
import com.swati.canvas_clone.model.Image;

public interface CanvaService {
	
	
	public List<Image> allImages();
	public Optional<Image> findById(Long id);
	public ImageDto createImage(ImageDto imageDto);
	
}
