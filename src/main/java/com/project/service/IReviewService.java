package com.project.service;

import com.project.entity.Movie;
import com.project.entity.Review;

public interface IReviewService  {
	
	Review saveReview(int movieId, Review review);
	Review updateReview(int id, Review updatedReview);




}
