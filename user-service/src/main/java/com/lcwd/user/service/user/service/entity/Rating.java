package com.lcwd.user.service.user.service.entity;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor 
@NoArgsConstructor
@Builder
public class Rating {
	
	private String ratingId;
	private String userId;
	private String hotelId;
	private int rating;
	private String feedBack;
	private Hotel hotel;
	

}
