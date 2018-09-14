package com.mybatis.mybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClassRoom {
    private  Integer id;
    private  String name;
    /** 一对多 */
    private List<User> users;
}
