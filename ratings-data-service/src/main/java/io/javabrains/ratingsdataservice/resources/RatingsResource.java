package io.javabrains.ratingsdataservice.resources;

import io.javabrains.ratingsdataservice.model.Rating;
import io.javabrains.ratingsdataservice.model.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RatingsResource {

    @RequestMapping("/")
    public String getServiceInfo(){
        return "Ratings service is up!\n" +
        "Ratings by movie can be requested on the path /ratingsdata/movies/{movieId}\n" +
        "Ratings by user can be requested on the path /ratingsdata/user/{userId}";
    }

    @RequestMapping("/ratingsdata/movies/{movieId}")
    public Rating getMovieRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
    }

    @RequestMapping("/ratingsdata/user/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId) {
        UserRating userRating = new UserRating();
        userRating.initData(userId);
        return userRating;

    }

}
