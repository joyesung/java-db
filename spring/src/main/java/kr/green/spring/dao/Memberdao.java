package kr.green.spring.dao;

import kr.green.spring.vo.Membervo;

public interface Memberdao {

	Membervo getMember(String id);

	void signup(Membervo mvo);
	
	void signin(Membervo mvo);//signin을 추가

	void modify(Membervo mvo);
}
