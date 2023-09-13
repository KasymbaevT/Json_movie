package service.impl;

import dao.MovieDao;
import model.Movie;
import model.enums.Genre;
import service.MovieService;

import java.util.List;

public class MovieServiceImpl implements MovieService {
    private static final String PATH = "movie.json";
    private MovieDao movieDao;
    private final List<Movie> movies = movieDao.readFromFile(PATH);

    @Override
    // TODO: 14.09.2023 вернуть фильм по ID
    public Movie findById(int movieId) {
        return null;
    }

    @Override
    // TODO: 14.09.2023 вернуть фильм по названию
    public Movie findByName(String name) {
        return null;
    }

    @Override
    // TODO: 14.09.2023 вернуть отсортированный лист по дате создание
    public List<Movie> sortByDate() {
        return null;
    }

    @Override
    // TODO: 14.09.2023 отфилтрововать все фильмы по жанру
    public List<Movie> filterByGenre(Genre genre) {
        return null;
    }

    @Override
    // TODO: 14.09.2023 найти обьект по ID и изменить его состояние
    public void updateById(int movieId, Movie movie) {

    }
}
