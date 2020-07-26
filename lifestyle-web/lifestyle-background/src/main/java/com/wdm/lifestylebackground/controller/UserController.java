package com.wdm.lifestylebackground.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import com.wdm.api.user.IUserService;
import com.wdm.entity.TUser;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wdm
 * @create 2020-07-26 16:48
 **/
@RestController
@RequestMapping("user")
public class UserController {
    @Reference
    private IUserService userService;

    @GetMapping("list")
    public List<TUser> list(){
        return userService.list();
    }

    @GetMapping("page")
    public PageInfo page(@RequestParam Integer pageIndex,
                       @RequestParam Integer pageSize){
        PageInfo pageInfo =userService.page(pageIndex, pageSize);
        return pageInfo;
    }

}