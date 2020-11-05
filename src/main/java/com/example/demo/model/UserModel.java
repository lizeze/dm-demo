package com.example.demo.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author ：lzz
 * @BelongsProject: com.example.demo.Model
 * @date ：Created in 2020/11/5
 * @description ：
 * @modified By：
 */

@Data
@TableName("user_test")
public class UserModel {
    private String id;
    private String name;

}

