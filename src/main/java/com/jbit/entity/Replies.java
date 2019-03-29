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
public class Replies {
    @Id @KeySql(useGeneratedKeys = true)
    private Long id;

    private String content;

    private Date replytime;

    private Integer infoid;


}