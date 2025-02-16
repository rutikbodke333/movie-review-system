package com.project.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Movie;
import com.project.entity.Review;
import com.project.repository.MovieRepository;
import com.project.repository.ReviewRepository;

@Service
public class ReviewService implements IReviewService{

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private MovieRepository movieRepository;

   

	@Override
	public Review saveReview(int movieId, Review review) {
		Optional<Movie> movie = movieRepository.findById(movieId);
        if (movie.isPresent()) {
            review.setMovie(movie.get()); // Set the movie reference
            return reviewRepository.save(review);
        }
        return null;
	}


	@Override
	public Review updateReview(int id, Review updatedReview) {
		Optional<Review> updateReview = reviewRepository.findById(id);
		if (updateReview.isPresent()) {
          Review existingReview = updateReview.get();
          existingReview.setName(updatedReview.getName());
          existingReview.setComment(updatedReview.getComment());
          existingReview.setRating(updatedReview.getRating());
          
          return reviewRepository.save(existingReview);
          
		}
		else {
          return null; 
      }

	}


	
	

}
