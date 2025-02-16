package com.project.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Movie;
import com.project.entity.Review;
import com.project.service.IReviewService;

@RestController
@RequestMapping("/movies")
public class ReviewController {

    @Autowired
    private IReviewService reviewService;

    @PostMapping("/{movieId}/reviews")
    public Review createReview(@PathVariable int movieId, @RequestBody Review review) {
        return reviewService.saveReview(movieId, review);
    }
    
	@PutMapping("/reviews/{reviewId}")
	public Review updateReview(@PathVariable int reviewId, @RequestBody Review review) {
		return reviewService.updateReview(reviewId, review);
		
		
	}
	
}
