package com.movie.reservation.dto;

public class MovieScoreDTO{
	int score_idx;
	int movie_idx;
	String member_id;
	String score_comment;
	String score_star;
	String score_date;
	
	public int getScore_idx() {
		return score_idx;
	}
	public void setScore_idx(int score_idx) {
		this.score_idx = score_idx;
	}
	public int getMovie_idx() {
		return movie_idx;
	}
	public void setMovie_idx(int movie_idx) {
		this.movie_idx = movie_idx;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getScore_comment() {
		return score_comment;
	}
	public void setScore_comment(String score_comment) {
		this.score_comment = score_comment;
	}
	public String getScore_star() {
		return score_star;
	}
	public void setScore_star(String score_star) {
		this.score_star = score_star;
	}
	public String getScore_date() {
		return score_date;
	}
	public void setScore_date(String score_date) {
		this.score_date = score_date;
	}
	
}