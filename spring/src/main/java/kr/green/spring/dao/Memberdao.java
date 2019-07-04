package kr.green.spring.dao;

import kr.green.spring.vo.Membervo;

public interface Memberdao {

	Membervo getMember(String id);

	void signup(Membervo mvo);
	
}
