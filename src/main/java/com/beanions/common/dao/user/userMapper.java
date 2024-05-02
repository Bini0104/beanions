package com.beanions.common.dao.user;

import com.beanions.common.dto.PostDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface userMapper {
    List<PostDTO> noticeSelectAll();
}
