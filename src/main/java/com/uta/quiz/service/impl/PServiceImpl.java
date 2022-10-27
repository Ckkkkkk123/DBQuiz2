package com.uta.quiz.service.impl;

import com.uta.quiz.mapper.PMapper;
import com.uta.quiz.service.PService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author Jianxiang Wang
 * @create 2022-10-26-9:31
 */
@Service
public class PServiceImpl implements PService {

    @Autowired
    private PMapper pMapper;
    @Override
    public List<Map<String, Object>> getAll() {
        return pMapper.getAll();
    }

    @Override
    public List<Map<String, Object>> selectByColor(String color) {
        return pMapper.selectByColor(color);
    }

    @Override
    public Map<String, Object> getById(Integer id) {
        return pMapper.getById(id);
    }

    @Override
    public void updateById(Integer id, Integer x, Integer y, String color) {
        pMapper.updateById(id, x, y, color);
    }

    @Override
    public void add(Integer x, Integer y, String color) {
        pMapper.add(x,y,color);
    }
}
