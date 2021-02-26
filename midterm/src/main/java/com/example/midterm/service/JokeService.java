package com.example.midterm.service;

import com.example.midterm.Entity.RandomJokes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeService {

    @Autowired
    public RandomJokes rj;

    public String getJoke(){
        return rj.getRandomJokes();
    }

}
