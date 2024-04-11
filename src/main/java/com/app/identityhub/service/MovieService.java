package com.app.identityhub.service;

import com.app.identityhub.model.Movie;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class MovieService {

    private List<Movie> movieList;
    @PostConstruct
    public void generateMovieList() {
        movieList = IntStream.range(0,100)
                .mapToObj(i -> Movie.builder()
                        .id(i)
                        .name("Movie : " + i)
                        .description("Description : " + i)
                        .build())
                .collect(Collectors.toList());
    }

    public List<Movie> getMovieList() {
        return movieList;
    }
}
