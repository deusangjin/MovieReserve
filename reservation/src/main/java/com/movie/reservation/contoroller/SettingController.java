package com.movie.reservation.contoroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Spring 주석 템플릿 설정 참고 https://ifuwanna.tistory.com/257
/**
* @packageName    : com.movie.reservation.contoroller
* @fileName        : SettingController.java
* @author        : Taeyoung kwon
* @date            : 2022.06.30
* @description            :
* ===========================================================
* 1. 헤더, 상단, 하단 분리를 위한 컨트롤러
* 2. 현재는 단순 html페이지 호출 
* 3. 관리자 모드 생기면 변경해야함
* ===========================================================
* DATE              AUTHOR             NOTE
* -----------------------------------------------------------
* 2022.06.30        Taeyoung kwon       최초 생성
*/
@Controller
public class SettingController {

	
	/**
	* @methodName    : main_header
	* @author        : Taeyoung Kwon
	* @date        : 2022.06.30
	* ===========================================================
	* 1. 메인페이지 헤더
	* ===========================================================
	* @return
	*/
	@GetMapping("/settion/main_header")
	public String main_header() {return "/settion/main_header";}
	
	/**
	* @methodName    : main_top
	* @author        : Taeyoung Kwon
	* @date        : 2022.06.30
	* ===========================================================
	* 1. 메인페이지 상단
	* ===========================================================
	* @return
	*/
	@GetMapping("/settion/main_top")
	public String main_top() {return "/settion/main_top";}
	
	/**
	* @methodName    : main_footer
	* @author        : Taeyoung Kwon
	* @date        : 2022.06.30
	* ===========================================================
	* 1. 메인페이지 하단
	* ===========================================================
	* @return
	*/
	@GetMapping("/settion/main_footer")
	public String main_footer() {return "/settion/main_footer";}
}
