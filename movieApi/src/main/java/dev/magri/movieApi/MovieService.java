package dev.magri.movieApi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
	@Autowired
	private MovieRepository movieRepo;
	
	public List<Movie> getAllMovies(){
		return movieRepo.findAll();
	}
	
	public Optional<Movie> getMovieById(String imdbId) {
		return movieRepo.findMovieByImdbId(imdbId);
	}
}
