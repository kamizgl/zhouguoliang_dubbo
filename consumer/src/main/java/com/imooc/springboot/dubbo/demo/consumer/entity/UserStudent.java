package com.imooc.springboot.dubbo.demo.consumer.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-10-20
 */
@Data
//@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("USER_STUDENT")
public class UserStudent{

    private static final long serialVersionUID = 1L;

    @TableField("NAME")
    private String name;

    @TableField("AGE")
    private Integer age;

    @TableId("ID")
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
