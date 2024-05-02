package com.beanions.user.controller;

import com.beanions.common.dto.PostDTO;
import com.beanions.user.service.UserNoticeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/board")
public class UserNoticeController {

    private final UserNoticeService userNoticeService;

    public UserNoticeController(UserNoticeService userNoticeService){
        this.userNoticeService = userNoticeService;
    }

    @GetMapping("/noticeboard")
    public String noticeboard(Model model){

        List<PostDTO> noticeAllList = userNoticeService.noticeSelectAll();

        model.addAttribute("noticeAllList", noticeAllList);

        return "board/noticeboard";
    }
}
