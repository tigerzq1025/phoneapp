package com.jbit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Informations {

    @Id @KeySql(useGeneratedKeys = true)
    private Long id;

    private String title;

    private String content;

    private Integer replycount;

    private Integer viewcount;

    private Date reporttime;

    private Date lastposttime;


}