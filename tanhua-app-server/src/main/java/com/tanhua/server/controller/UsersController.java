package com.tanhua.server.controller;

import com.tanhua.model.domain.UserInfo;
import com.tanhua.model.vo.UserInfoVo;
import com.tanhua.server.interceptor.UserHolder;
import com.tanhua.server.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserInfoService userInfoService;

    /**
     * 查询用户资料
     */
    @GetMapping
    public ResponseEntity users(@RequestHeader("Authorization") String token,Long userID) {

        if(userID == null){
            userID = Long.valueOf(UserHolder.getUserId());
        }
        UserInfoVo userInfo = userInfoService.findById(userID);
        return ResponseEntity.ok(userInfo);
    }

    @PutMapping
    public ResponseEntity updateUserInfo(@RequestBody UserInfo userInfo, @RequestHeader("Authorization") String token) {
        userInfo.setId(UserHolder.getUserId());
        userInfoService.update(userInfo);
        return ResponseEntity.ok(null);
    }
}
