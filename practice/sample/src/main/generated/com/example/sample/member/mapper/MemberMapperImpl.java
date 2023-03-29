package com.example.sample.member.mapper;

import com.example.sample.member.dto.MemberPatchDto;
import com.example.sample.member.dto.MemberPostDto;
import com.example.sample.member.dto.MemberResponseDto;
import com.example.sample.member.entity.Member.Member;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-14T00:20:46+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.17 (Azul Systems, Inc.)"
)
@Component
public class MemberMapperImpl implements MemberMapper {

    @Override
    public Member memberPostDtoTOMember(MemberPostDto memberPostDto) {
        if ( memberPostDto == null ) {
            return null;
        }

        String email = null;
        String name = null;
        String phone = null;

        email = memberPostDto.getEmail();
        name = memberPostDto.getName();
        phone = memberPostDto.getPhone();

        long memberId = 0L;

        Member member = new Member( memberId, email, name, phone );

        return member;
    }

    @Override
    public Member memberPatchDtoToMember(MemberPatchDto memberPatchDto) {
        if ( memberPatchDto == null ) {
            return null;
        }

        long memberId = 0L;
        String email = null;
        String name = null;
        String phone = null;

        Member member = new Member( memberId, email, name, phone );

        return member;
    }

    @Override
    public MemberResponseDto memberToMemberResponseDto(Member member) {
        if ( member == null ) {
            return null;
        }

        MemberResponseDto memberResponseDto = new MemberResponseDto();

        return memberResponseDto;
    }
}
