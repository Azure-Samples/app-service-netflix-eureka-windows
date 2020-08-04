package io.javabrains.movieinfoservice.resources;

import io.javabrains.movieinfoservice.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class MovieResource {

    @RequestMapping("/")
    public String getServiceInfo(){
        return "Movie info service is up!\n" +
        "Movie info can be requested on the path /movies/{movieId}";
    }

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/movies/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
        return new Movie(movieId, "Some Movie Title", "Some movie description");

    }

}
