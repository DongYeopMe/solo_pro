package com.example.sample.member.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Member {
    private Long memberId;
    private String memberName;
    private String NickName;
    private Date Birthdate;
    private String Email;
    private String Phone;
}