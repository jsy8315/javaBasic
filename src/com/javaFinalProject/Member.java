package com.javaFinalProject;
// 회원 정보 입력
// 가입한 날짜, 이름, 주소, 연락처, 생일 등을 저장
public class Member {
    private String name;
    private String address;
    private String phoneNumber;
    private String birthday;
    private String memberDay;

    public Member(String name, String address, String phoneNumber, String birthday, String memberDay) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
        this.memberDay = memberDay;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "이름: " + name + ", 주소: " + address + ", 전화번호: " + phoneNumber +
                ", 생년월일: " + birthday + ", 가입일: " + memberDay;
    }

}
