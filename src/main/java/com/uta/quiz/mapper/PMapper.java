package com.uta.quiz.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author Jianxiang Wang
 * @create 2022-10-26-9:30
 */
public interface PMapper {
    List<Map<String, Object>> getAll();

    List<Map<String, Object>> selectByColor(@Param("color") String color);

    /**
     * 根据id查询数据
     * @param id
     * @return
     */
    Map<String, Object> getById(@Param("id") Integer id);

    /**
     * 根据id更新数据
     * @param id
     * @param x
     * @param y
     * @param color
     */
    void updateById(@Param("id") Integer id, @Param("x") Integer x, @Param("y") Integer y, @Param("color") String color);

    void add(@Param("x") Integer x, @Param("y") Integer y,@Param("color") String color);
}
