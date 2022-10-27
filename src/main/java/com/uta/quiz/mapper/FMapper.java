package com.uta.quiz.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author Jianxiang Wang
 * @create 2022-10-26-9:30
 */
public interface FMapper {
    /**
     * 查询范围内店铺中的食物总量
     * @param min
     * @param max
     * @return
     */
    List<Map<String, Integer>> question10b(@Param("min") Integer min, @Param("max") Integer max);

    List<Map<String, Object>> question10a(@Param("min") Integer min,@Param("max") Integer max);
}
