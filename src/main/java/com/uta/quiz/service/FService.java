package com.uta.quiz.service;

import java.util.List;
import java.util.Map;

/**
 * @author Jianxiang Wang
 * @create 2022-10-26-9:30
 */
public interface FService {
    List<Map<String, Integer>> question10b(Integer min, Integer max);

    List<Map<String, Object>> question10a(Integer min, Integer max);
}
