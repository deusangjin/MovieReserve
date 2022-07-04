package com.movie.reservation.contoroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.movie.reservation.dao.MemberDAO;
import com.movie.reservation.dto.MemberDTO;


@Controller
public class HomeConterller {

	@Autowired
	MemberDAO memDao;
    
    @GetMapping("/")
    public String getIndexPage(HttpServletRequest request, Model model) {
    	model.addAttribute("hello","서버에서 보내준 값입니다");
    	return "index";
    }
    
    @GetMapping("/member_sign_up")
    public String getMember_join(HttpServletRequest request, Model modem) {
    	return "/member_sign_up";
    }
    @GetMapping("/login")
    public String getMember_login(HttpServletRequest request, Model modem) {
    	return "/login";
    }
    //회원가입 insert 부분
    @PostMapping("/signUp")
    public String SignUpMember(HttpServletRequest request, Model model) {
    	String member_id = request.getParameter("member_id");
    	String member_name = request.getParameter("member_name");
    	String member_pw = request.getParameter("member_pw");
    	String member_phone = request.getParameter("member_phone");
    	String member_email1 = request.getParameter("member_email");
    	String member_email2 = request.getParameter("member_email2");
    	String member_email = member_email1+"@"+member_email2;
    	String member_gender = request.getParameter("member_gender");
    	
    	MemberDTO member = new MemberDTO();
    	member.setMember_id(member_id);
    	member.setMember_name(member_name);
    	member.setMember_pw(member_pw);
    	member.setMember_phone(member_phone);
    	member.setMember_email(member_email);
    	member.setMember_gender(member_gender);
    	
    	memDao.JoinMember(member);
    	return "/login";
    }
    
    //ID 중복체크 ajax
    @PostMapping("/IdCheck")
    @ResponseBody
    public int IdCheck(HttpServletRequest request, Model model) {
    	String member_id = request.getParameter("member_id");
    	int result = memDao.IdCheck(member_id);
    	return result;
    }
}