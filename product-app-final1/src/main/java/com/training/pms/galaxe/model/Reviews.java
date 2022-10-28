package com.training.pms.galaxe.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
//instead of these 4, we can directly give, @data


public class Reviews {

	private int reviewId;
	private String comments;
	private int rating;
}