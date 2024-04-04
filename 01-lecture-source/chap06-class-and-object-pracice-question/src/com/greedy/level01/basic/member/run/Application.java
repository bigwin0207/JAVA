package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.vo.MemberVO;

public class Application {
    public static void main(String[] args) {
        //getter를 이용해서 필드의 초기값 확인
        //setter를 이용해서 필드 값 변경
        //getter를 이용해서 변경된 필드값 확인


        MemberVO memberVO = new MemberVO();
        System.out.println("MemberVO.id :" + memberVO.getId());
        System.out.println("MemberVO.pwd :" + memberVO.getPwd());
        System.out.println("MemberVO.name : " + memberVO.getName());
        System.out.println("MemberVO.age :" + memberVO.getAge());
        System.out.println("MemberVO.gender :" + memberVO.getGender());
        System.out.println("MemberVO.phone :" + memberVO.getPhone());
        System.out.println("MemberVO.email :" + memberVO.getEmail());

        memberVO.setId("user01");
        memberVO.setPwd("pass01");
        memberVO.setName("홍길동");
        memberVO.setAge(20);
        memberVO.setGender('M');
        memberVO.setPhone("010-1234-5678");
        memberVO.setEmail("hong123greedy.com");

        System.out.println("MemberVO.id :" + memberVO.getId());
        System.out.println("MemberVO.pwd :" + memberVO.getPwd());
        System.out.println("MemberVO.name : " + memberVO.getName());
        System.out.println("MemberVO.age :" + memberVO.getAge());
        System.out.println("MemberVO.gender :" + memberVO.getGender());
        System.out.println("MemberVO.phone :" + memberVO.getPhone());
        System.out.println("MemberVO.email :" + memberVO.getEmail());




    }
}
