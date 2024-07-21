package com.swati.canvas_clone.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.swati.canvas_clone.dto.ImageDto;
import com.swati.canvas_clone.mapper.ImageMapper;
import com.swati.canvas_clone.model.Image;
import com.swati.canvas_clone.repository.ImageRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CanvaServiceImpl implements CanvaService {
	
	private ImageRepository imageRepository;

	@Override
	public ImageDto createImage(ImageDto imageDto) {
		Image image=ImageMapper.mapToImage(imageDto);
		Image savedImage= imageRepository.save(image);
		return ImageMapper.mapToIamgeDto(savedImage);
	}

	@Override
	public List<Image> allImages() {
		return imageRepository.findAll();
	}

	@Override
	public Optional<Image> findById(Long id) {
		return imageRepository.findById(id);
	}

}
