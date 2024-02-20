package org.poseidon.controller;

import javax.inject.Inject;

import org.poseidon.human.Human;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//2024-02-13
//새로운 controller 만든다.
/*
 * @Controller	= 객체 생성 = 컨트롤러로 만들기
 * @Service		= 객체 생성 = 서비스로 만들기
 * @Repository	= 객체 생성 = DAO
 * @Component	= 객체 생성 = 그 외 객체로 만들기
 */

@Controller
public class IndexController {
	//주입
	//@autoWired = 스프링 제공 = 객체 타입으로 검사
	//		@Qualifier("")  
	//@Inject	 = 자바 제공 = 객체의 타입이 일치하면 자동 주입
	//		@named("")
	//@resources = 자바 제공 = id가 일치하는 것 주입
	//		@Resources(name="") 이렇게 적기도 한다.
	
	@Inject
	private Human human;
	
	//각각 들어오는 요청을 잡아서 실행함.
	//@RequestMapping(value = "/", method = RequestMethod.POST)
	//@RequestMapping(value = "/", method = RequestMethod.GET)
	//@RequestMapping(value = "/") //GET, POST 구분 없이 다
	//@RequestMapping("/") //어차피 다 같이 들어올테니까 더 축약해둔 형태.
	@GetMapping("/") //Spring 버전을 높여야 나온다. //@RequestMapping(value = "/", method = RequestMethod.GET) 얘랑 같은 의미. GetMapping으로 쓰는 거 추천
	public String home() {
		//Human h = new Human();
		//h.setAge(10);
		//h.setName("바나나");
		
		System.out.println(human.getAge());//0
		System.out.println(human.getName());//null
		
		return "index";			//	/WEB-INF/views/index.jsp <- 진짜 경로. xml에서 prefix suffix로 붙여준다.
	}
	
	//스프링 레거시 = jsp
	//스프링 부트 = jsp, 타임리프
	//spa...
	//aws
	//docker
	//linux
	
	//POJO = 
	//DI = 의존성 주입 = 객체를 생성하지 않고 객체를 사용하는 것
	//AOP = 관점 지향 프로그래밍
	//IoC = 제어 역전 = 객체 생명주기 = 스프링에게 제어 권한이 있는 것.
	//					Life Cycle = (객체 생성 -> 사용 -> 종료)
	
	//MyBatis - ResultSet 대신해주는 애
	
	
	
	//Controller -> Service -> Repository -> Mybatis -> DB
	//							DAO						mariadb
	// MVC -> 
	// M 데이터   = 데이터베이스 값 , DAO/DTO/mybatis/DB
	// V 화면     = Model값을 붙여 사용자에게 보여준다.
	// C 흐름제어 = 사용자의 요청이 들어오면 먼저 동작 
	
	
	
	
}
