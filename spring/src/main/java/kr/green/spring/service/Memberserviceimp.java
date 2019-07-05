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
	@Override
	public boolean signin(Membervo mvo) {
		if(mvo == null)//예외처리
			return false;
		Membervo ovo = memberdao.getMember(mvo.getId());//아이디 값을 저장
		if(ovo == null)
			return false;
		if(ovo.getPw().equals(mvo.getPw()))//equals를통해 값을 비교해 같은지 다른지 확인한다
			return true;
		return false;
	}
	@Override
	public boolean modify(Membervo mvo, String oldPw) {
		if(mvo == null)//예외처리
			return false;
		if(memberdao.getMember(mvo.getId()).getPw().equals(oldPw)) {
			memberdao.modify(mvo);
			return true;
		}
		return false;
	}
	
}


