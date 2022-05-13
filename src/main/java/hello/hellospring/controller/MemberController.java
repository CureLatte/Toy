package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;

    // memeberSerivice을 부를 때마다 new 하지 않는다.
    // Spring 이 memberSerivice 를 가져와 연결한다.
    // @Autowired - @Service -> @Autowired - @Repository : 컴포넌트 스캔 방식
    // 싱글 턴방식으로 공유 함

    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }
}
