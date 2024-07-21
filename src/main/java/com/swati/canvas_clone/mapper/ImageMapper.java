package com.swati.canvas_clone.mapper;

import com.swati.canvas_clone.dto.ImageDto;
import com.swati.canvas_clone.model.Image;

public class ImageMapper {
	public static Image mapToImage(ImageDto imageDto) {
		Image image=new Image(
				imageDto.getId(),
				imageDto.getImageUrl()		
		);
		
		return image;				
	}
	
	public static ImageDto mapToIamgeDto(Image image) {
		ImageDto imageDto=new ImageDto(
				image.getId(),
				image.getImageUrl()				
				);
		return imageDto;
	}
	

}
