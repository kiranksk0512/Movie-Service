package com.app.identityhub.controller;

import com.app.identityhub.model.Movie;
import com.app.identityhub.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/get")
    public ModelAndView getMovieList() {
        List<Movie> movieList = movieService.getMovieList();
        ModelAndView modelAndView = new ModelAndView("moviesPage");
        modelAndView.addObject("movieList", movieList);
        return modelAndView;
    }
}

//
//@RestController
//@RequestMapping("/movies")
//public class MovieController {
//
//    @Autowired
//    MovieService movieService;
//
//    @GetMapping("/get")
//    public List<Movie> getMovieList() {
//        List<Movie> movieList = movieService.getMovieList();
//        return movieList;
//    }
//}

