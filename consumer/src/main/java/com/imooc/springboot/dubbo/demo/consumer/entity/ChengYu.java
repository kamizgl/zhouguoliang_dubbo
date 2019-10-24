package com.imooc.springboot.dubbo.demo.consumer.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.UUID;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-10-21
 */
@Data
@Accessors(chain = true)
@TableName("CHENG_YU")
public class ChengYu   {

    private static final long serialVersionUID = 1L;



    @TableField("PINYIN")
    private String pinyin;

    @TableField("DERIVATION")
    private String derivation;

    @TableField("EXPLANATION")
    private String explanation;

    @TableField("ABBREVIATION")
    private String abbreviation;

    @TableField("WORD")
    private String word;

    private String example;


    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getDerivation() {
        return derivation;
    }

    public void setDerivation(String derivation) {
        this.derivation = derivation;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }
}
