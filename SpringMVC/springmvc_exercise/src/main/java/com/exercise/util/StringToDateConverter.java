package com.exercise.util;

import org.springframework.core.convert.converter.Converter;

import java.text.*;
import java.util.Date;

/**
 * @Author: Xiao(Amanda) Wang
 * @Date: 2021/2/5 11:02
 * @GitHub: https://github.com/Amanda-WangXiao
 */
public class StringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {

        if(s == "") System.out.println("Please input String");
        DateFormat df = new SimpleDateFormat("YYYY-MM-DD");
        try {
            return df.parse(s);
        } catch (ParseException e) {
             throw new RuntimeException(e);
        }

    }
}
