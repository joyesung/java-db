package kr.green.spring.service;

import kr.green.spring.vo.Membervo;


public interface Memberservice {
	public boolean signup(Membervo mvo);

	public Membervo signin(Membervo mvo);//메소드 정의 새로만든거
	
	public boolean modify(Membervo mvo,String oldPw);

	
	
	
}
