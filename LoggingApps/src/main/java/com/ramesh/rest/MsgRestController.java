package com.ramesh.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramesh.service.MsgService;

@RestController
@RequestMapping("/api")
public class MsgRestController {

	@Autowired
	private MsgService msgService;

	@GetMapping("/welcome")
	public String getMsg() {
		int i = 10;
		int j = 20;
		int age = 16;
		int k = 30;
		return msgService.getWelcomeMsg();
	}

	/*
	 * private static Logger logger =
	 * LoggerFactory.getLogger(MsgRestController.class);
	 * 
	 * @GetMapping("/welcome") public String getMsg() {
	 * 
	 * logger.info("getMsg() - execution stated..");
	 * 
	 * String msg = "Welcome to Java..!!";
	 * 
	 * try { int i = 10 / 0; } catch (Exception e) { logger.error("Exception : " +
	 * e.getMessage()); }
	 * 
	 * logger.info("getMsg() - execution ended..");
	 * 
	 * return msg;
	 */
}
