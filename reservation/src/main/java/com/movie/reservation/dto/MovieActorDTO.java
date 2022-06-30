package com.movie.reservation.dto;

public class MovieActorDTO{
	int actor_idx;
	int list_idx;
	String actor_engname;
	String actor_korname;
	String actor_char;
	
	public int getActor_idx() {
		return actor_idx;
	}
	public void setActor_idx(int actor_idx) {
		this.actor_idx = actor_idx;
	}
	public int getList_idx() {
		return list_idx;
	}
	public void setList_idx(int list_idx) {
		this.list_idx = list_idx;
	}
	public String getActor_engname() {
		return actor_engname;
	}
	public void setActor_engname(String actor_engname) {
		this.actor_engname = actor_engname;
	}
	public String getActor_korname() {
		return actor_korname;
	}
	public void setActor_korname(String actor_korname) {
		this.actor_korname = actor_korname;
	}
	public String getActor_char() {
		return actor_char;
	}
	public void setActor_char(String actor_char) {
		this.actor_char = actor_char;
	}
	
}