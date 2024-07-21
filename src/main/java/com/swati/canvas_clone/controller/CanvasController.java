package com.swati.canvas_clone.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swati.canvas_clone.dto.ImageDto;
import com.swati.canvas_clone.model.Image;
import com.swati.canvas_clone.service.CanvaService;
import lombok.AllArgsConstructor;


@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
@AllArgsConstructor
public class CanvasController {
	private CanvaService canvaService;
	
	
	//create image Rest API
	@PostMapping("/createImage")
	public ResponseEntity<ImageDto> createImage(@RequestBody ImageDto imageDto) {
		return new ResponseEntity<>(canvaService.createImage(imageDto),HttpStatus.CREATED);
	}
	
	
	@GetMapping("/images")
	public List<Image> getTask(){
		return canvaService.allImages();
	}	
	
	@GetMapping("/task/{id}")
	public Optional<Image> getTask(@PathVariable Long id){
		return canvaService.findById(id);
	}

}
