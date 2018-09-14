package com.mybatis.mybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private  String id;
    private  String name;
    private  String password;
    /** 一对一 */
    private Teacher teacher;
}
