package com.beanions.user.service;

import com.beanions.common.dao.user.userMapper;
import com.beanions.common.dto.PostDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserNoticeService {

    private final userMapper UserMapper;

    public UserNoticeService(userMapper UserMapper){
        this.UserMapper = UserMapper;
    }

    public List<PostDTO> noticeSelectAll() {

        return UserMapper.noticeSelectAll();
    }
}
