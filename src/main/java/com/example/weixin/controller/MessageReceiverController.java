package com.example.weixin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//controller（控制器）其实就相当于servlet，但是spring MVC把所有的serviet相关的api都屏蔽了
@RestController
@RequestMapping("/kemao_3/weixin/reciver")//访问哪个路径的时候，被此处控制器处理 textwx:表示包路径
public class MessageReceiverController {
	//必须要有handler方法才不会出404
	@GetMapping
	public String echo(
			@RequestParam("signature")String signature,//
			@RequestParam("timestamp")String timestamp ,//
			@RequestParam("nonce")String nonce, //
			@RequestParam("echostr")String echostr//
			) {
		return echostr;
	}
	
	
	
}
