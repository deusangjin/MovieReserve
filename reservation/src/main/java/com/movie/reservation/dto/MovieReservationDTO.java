package com.movie.reservation.dto;

public class MovieReservationDTO{
	int re_idx;
	int list_idx;
	String member_id;
	String member_name;
	String re_email;
	String re_time;
	
	public int getRe_idx() {
		return re_idx;
	}
	public void setRe_idx(int re_idx) {
		this.re_idx = re_idx;
	}
	public int getList_idx() {
		return list_idx;
	}
	public void setList_idx(int list_idx) {
		this.list_idx = list_idx;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getRe_email() {
		return re_email;
	}
	public void setRe_email(String re_email) {
		this.re_email = re_email;
	}
	public String getRe_time() {
		return re_time;
	}
	public void setRe_time(String re_time) {
		this.re_time = re_time;
	}
}