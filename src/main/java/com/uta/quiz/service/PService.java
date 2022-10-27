package com.uta.quiz.service;

import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.List;
import java.util.Map;

/**
 * @author Jianxiang Wang
 * @create 2022-10-26-9:30
 */
public interface PService {
    List<Map<String, Object>> getAll();

    List<Map<String, Object>> selectByColor(String color);

    Map<String, Object> getById(Integer id);

    void updateById(Integer id, Integer x, Integer y, String color);

    void add(Integer x, Integer y, String color);
}
