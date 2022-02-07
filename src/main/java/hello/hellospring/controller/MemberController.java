package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService; // 스프링컨테이너에 등록

    @Autowired
    public MemberController(MemberService memberService) {
            this.memberService = memberService;
    }
}
