package com.example.generator.controller;

import com.example.generator.po.CheckItem;
import com.example.generator.service.CheckItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: generator->CheckItemController
 * @description:
 * @author: hunyiha
 * @create: 2020-05-06 22:58
 **/

@RestController
@RequestMapping("/checkitem")
public class CheckItemController {

    @Autowired
    private CheckItemService checkItemService;

    @GetMapping("/list")
    public List<CheckItem> listCheckItem(){
        return checkItemService.listCheckItem();
    }
}
