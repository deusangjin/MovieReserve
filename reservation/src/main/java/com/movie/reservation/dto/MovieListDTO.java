package com.movie.reservation.dto;

public class MovieListDTO{
	int movie_idx;
	String movie_title;
	String movie_comment;
	
	public int getMovie_idx() {
		return movie_idx;
	}
	public void setMovie_idx(int movie_idx) {
		this.movie_idx = movie_idx;
	}
	public String getMovie_title() {
		return movie_title;
	}
	public void setMovie_title(String movie_title) {
		this.movie_title = movie_title;
	}
	public String getMovie_comment() {
		return movie_comment;
	}
	public void setMovie_comment(String movie_comment) {
		this.movie_comment = movie_comment;
	}
	
}