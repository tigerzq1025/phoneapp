package com.jbit.dao;

import com.jbit.entity.Replies;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface RepliesDao extends Mapper<Replies> {
    List<Replies> findThisRpl();
}