package com.itwill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * SpringWebApplicationBootTemplate1Application 클래스를 기준으로
 * 하위 모든 디렉토리에 있는 클래스들의 annotation을 읽어서 bean을 생성
 * 
 */
@SpringBootApplication
public class SpringWebApplicationBootTemplate1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebApplicationBootTemplate1Application.class, args);
	}

}
