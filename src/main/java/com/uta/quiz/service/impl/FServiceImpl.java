package com.uta.quiz.service.impl;

import com.uta.quiz.mapper.FMapper;
import com.uta.quiz.service.FService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Jianxiang Wang
 * @create 2022-10-26-9:31
 */
@Service
public class FServiceImpl implements FService {
    @Autowired
    private FMapper fMapper;
    @Override
    public List<Map<String, Integer>> question10b(Integer min, Integer max) {
        return fMapper.question10b(min, max);
    }

    @Override
    public List<Map<String, Object>> question10a(Integer min, Integer max) {

        return fMapper.question10a(min, max);
    }
}
