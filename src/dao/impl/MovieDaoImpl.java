package dao.impl;

import dao.MovieDao;
import model.Movie;

import java.util.List;

public class MovieDaoImpl implements MovieDao {
    // TODO: 14.09.2023 положить фильм в указанной JSON файл
    @Override
    public void writeToFile(String path, Movie movie) {

    }

    // TODO: 14.09.2023 вернуть список фильмов из JSON файла (путь указан в параметре метода)
    @Override
    public List<Movie> readFromFile(String path) {
        return null;
    }
}
