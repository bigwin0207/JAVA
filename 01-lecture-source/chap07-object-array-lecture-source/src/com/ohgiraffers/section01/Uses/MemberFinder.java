package com.ohgiraffers.section01.Uses;

public class MemberFinder {

    public Member[] findAllMembers(){

        return MemberRepository.findAllMembers();
    }
}
