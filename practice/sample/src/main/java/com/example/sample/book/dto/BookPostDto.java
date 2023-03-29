package com.example.sample.book.dto;

import lombok.Getter;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
public class BookPostDto {

    private Long bookId;
    @Size(max=255, message ="제목은 한글자 이상이거나 혹은255글자까지 됩니다.")
    private String Title;

    @Pattern(regexp = "^[a-zA-Z]+(\\\\s{1,2}[a-zA-Z]+)*$",message = "다시 작성해주세요.")
    @Size(max=30, message = "작가 이름은 한글자 이상이거나, 30글자 까지 됩니다.")
    @NotBlank
    private String Author;

    @Max(200000)
    private int Price;

    private int quantity;
}

/*
* 정규 표현식 설명
* ^: 문자열의 시작
[a-zA-Z]+: 영문 대소문자 중 1개 이상의 문자 (첫 번째 단어)
(\\s{1,2}[a-zA-Z]+)*: 1~2개의 공백과 함께 1개 이상의 영문 대소문자를 0번 이상 반복하는 그룹 (두 번째 단어 이후)
( ): 그룹화
\\s{1,2}: 공백 문자 1~2개
[a-zA-Z]+: 영문 대소문자 중 1개 이상의 문자
*: 그룹이 0번 이상 반복됨
$: 문자열의 끝
* */