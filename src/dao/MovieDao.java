package dao;

import model.Movie;

import java.util.List;

public interface MovieDao {
    void writeToFile(String path, Movie movie);

    List<Movie> readFromFile(String path);
}
