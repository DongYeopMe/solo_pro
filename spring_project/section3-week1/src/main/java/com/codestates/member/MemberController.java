package com.codestates.member;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

//@RestController
//@RequestMapping(path ="/v1/members")
//public class MemberController {
//    @PostMapping
//    public ResponseEntity postMember(@RequestHeader Map<String, String> headers,
//                                     @RequestParam("email") String email,
//                             @RequestParam("name") String name,
//                             @RequestParam("phone") String phone){
////        // (2)JSON 문자열 수작업을 Map 객체로 대체
////        Map<String, String> map = new HashMap<>();
////        map.put("email", email);
////        map.put("name", name);
////        map.put("phone", phone);
////
////        // (3)리턴 값을 ResponseEntity 객체로 변경
////        return new ResponseEntity<>(map, HttpStatus.CREATED);
//        for(Map.Entry<String,String> entry: headers.entrySet()){
//            System.out.println("key: " + entry.getKey() +
//                    ", value: " + entry.getValue());
//        }
//        return new ResponseEntity<>(new Member(email, name, phone),
//                HttpStatus.CREATED);
//    }

//    @GetMapping("/{member-id}")
//    public ResponseEntity getMember(@PathVariable("member-id")long memberId){
//        System.out.println("# memberId: "+ memberId);
//
//        //not implementation
//        // (4) 리턴 값을 ResponseEntity 객체로 변경
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
//    @GetMapping
//    public ResponseEntity getMembers(){
//        System.out.println("# get Members");
//
//        //not implementation
//        // (5) 리턴 값을 ResponseEntity 객체로 변경
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//}
@RestController
@RequestMapping("/v1/members")
public class MemberController {
    // 회원 정보 등록
    @PostMapping
    public ResponseEntity postMember(@RequestParam("email") String email,
                                     @RequestParam("name") String name,
                                     @RequestParam("phone") String phone) {
        Map<String, String> body = new HashMap<>();
        body.put("email", email);
        body.put("name", name);
        body.put("phone", phone);

        return new ResponseEntity<Map>(body, HttpStatus.CREATED);
    }

    // 회원 정보 수정
    @PatchMapping("/{member-id}")
    public ResponseEntity patchMember(@PathVariable("member-id") long memberId,
                                      @RequestParam String phone) {
        Map<String, Object> body = new HashMap<>();
        body.put("memberId", memberId);
        body.put("email", "hgd@gmail.com");
        body.put("name", "홍길동");
        body.put("phone", phone);

        // No need Business logic

        return new ResponseEntity<Map>(body, HttpStatus.OK);
    }

    // 한명의 회원 정보 조회
    @GetMapping("/{member-id}")
    public ResponseEntity getMember(@PathVariable("member-id") long memberId) {
        System.out.println("# memberId: " + memberId);

        // not implementation
        return new ResponseEntity<Map>(HttpStatus.OK);
    }

    // 모든 회원 정보 조회
    @GetMapping
    public ResponseEntity getMembers() {
        System.out.println("# get Members");

        // not implementation

        return new ResponseEntity<Map>(HttpStatus.OK);
    }

    // 회원 정보 삭제
    @DeleteMapping("/{member-id}")
    public ResponseEntity deleteMember(@PathVariable("member-id") long memberId) {
        // No need business logic

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}