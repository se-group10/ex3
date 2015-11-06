package com.hostname.segroupten.movievisualization.client;

import java.util.Comparator;

import com.hostname.segroupten.movievisualization.shared.Movie;

public class GenreSort implements Comparator<Movie> {

	@Override
	public int compare(Movie m1, Movie m2){
		if (m1 == m2) {return 0;}

		// Compare the name columns.
		if (m1 != null) {
		return (m2 != null) ? m1.getGenres().compareToIgnoreCase(m2.getGenres()) : 1;
		}
	return -1;
	}

}
