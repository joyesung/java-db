package kr.green.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.spring.dao.Memberdao;
import kr.green.spring.vo.Membervo;

@Service
public class Memberserviceimp implements Memberservice {

	@Autowired
	Memberdao memberdao;
	
	
	@Override
	public boolean signup(Membervo mvo) {
		// 기존에 해당 아이디가 있는지 체크
		// 있으면 false 반환하고 종료
		// 없으면 회원가입 진행
		if(mvo == null)
			return false;
		mvo.setName("");
		if(memberdao.getMember(mvo.getId()) !=null)
			return false;
		memberdao.signup(mvo);
		return true;
	}
	
}
