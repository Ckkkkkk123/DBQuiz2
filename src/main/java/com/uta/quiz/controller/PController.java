package com.uta.quiz.controller;

import com.alibaba.druid.stat.TableStat;
import com.alibaba.druid.support.json.JSONUtils;
import com.uta.quiz.service.PService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Jianxiang Wang
 * @create 2022-10-26-9:29
 */
@Controller
@RequestMapping("/P")
public class PController {

    @Autowired
    private PService pService;

    @GetMapping("/question11")
    public String getAll(Model model) {
        List<Map<String, Object>> all = pService.getAll();
        model.addAttribute("all", all);
        return "question_11";
    }

    @GetMapping("/getById")
    @ResponseBody
    public String getById(@RequestParam("id") Integer id) {
        Map<String, Object> map = pService.getById(id);
        return JSONUtils.toJSONString(map);
    }
    @GetMapping("/updateById")
    @ResponseBody
    public void updateById(
            @RequestParam("id") Integer id,
            @RequestParam("x") Integer x,
            @RequestParam("y") Integer y,
            @RequestParam("color") String color
    ) {
        pService.updateById(id, x, y , color);
    }

    @GetMapping("/draw")
    @ResponseBody
    public String draw() {
        List<Map<String,Object>> redList = pService.selectByColor("r");
        List<Map<String,Object>> greenList = pService.selectByColor("g");
        Map<String, Object> map = new HashMap<>();
        map.put("red",redList);
        map.put("green",greenList);
        return JSONUtils.toJSONString(map);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public String getAll() {
        List<Map<String, Object>> all = pService.getAll();
        return JSONUtils.toJSONString(all);
    }

    @GetMapping("/add")
    @ResponseBody
    public void add(
            @RequestParam("x") Integer x,
            @RequestParam("y") Integer y,
            @RequestParam("color") String color
    ) {
        pService.add(x,y,color);
    }
}
