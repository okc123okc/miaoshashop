package com.okc.miaosha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.okc.miaosha.domain.MiaoshaUser;
import com.okc.miaosha.redis.RedisService;
import com.okc.miaosha.result.Result;
import com.okc.miaosha.service.MiaoshaUserService;

/**
 * @author okc
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	MiaoshaUserService userService;
	
	@Autowired
	RedisService redisService;
	
    @RequestMapping("/info")
    @ResponseBody
    public Result<MiaoshaUser> info(Model model,MiaoshaUser user) {
        return Result.success(user);
    }
    
}
