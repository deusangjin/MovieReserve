package com.movie.reservation.dao;

import org.apache.ibatis.annotations.Mapper;

import com.movie.reservation.dto.MemberDTO;

@Mapper
public interface MemberDAO{
	public void JoinMember(MemberDTO member);
	public int IdCheck(String member_id);
}