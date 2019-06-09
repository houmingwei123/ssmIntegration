package com.mingwei.controller;

import com.mingwei.domain.Items;
import com.mingwei.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private ItemService itemService;
    @RequestMapping("/findOne")
    public String findById(Model model){
        System.out.println(111);
        Items item = itemService.findById(1);
        model.addAttribute("item",item);
        return "itemDetail";
    }
}
