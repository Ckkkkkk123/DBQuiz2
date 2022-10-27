package com.uta.quiz.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.uta.quiz.service.FService;
import com.uta.quiz.util.RedisUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Jianxiang Wang
 * @create 2022-10-26-9:29
 */
@Controller
@RequestMapping("/F")
public class FController {

    @Autowired
    private FService fService;

    @Autowired
    private RedisUtil redisUtil;

    @GetMapping("/question_10")
    @ResponseBody
    public String question10(@RequestParam("min") Integer min, @RequestParam("max") Integer max) {
        List<Object> list = new ArrayList<>();
        List<Map<String, Integer>> list2 = fService.question10b(min, max);
        List<Map<String, Object>> list1 = fService.question10a(min, max);
        list.add(list1);
        list.add(list2);
        return JSONUtils.toJSONString(list);
    }
    @GetMapping("/question_12")
    @ResponseBody
    public String question12(@RequestParam("min") Integer min, @RequestParam("max") Integer max) {
        List<Map<String, Integer>> list = fService.question10b(min, max);
        return JSONUtils.toJSONString(list);
    }
}
