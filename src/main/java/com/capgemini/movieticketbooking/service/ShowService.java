package com.capgemini.movieticketbooking.service;

import com.capgemini.movieticketbooking.model.Show;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public interface ShowService {
    public Show addShow(Show show);
    public Show updateShow(Show show);
    public Show removeShow(Show show);
    public Show viewShow(Show show);
    public List<Show> viewShowList(int theatreid);
    public List<Show> viewShowList(LocalDate date);
    public List<Show> viewAllShows();
}
