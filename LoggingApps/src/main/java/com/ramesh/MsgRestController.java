package com.ramesh;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	private static Logger logger = LoggerFactory.getLogger(MsgRestController.class);

	@GetMapping("/welcome")
	public String getMsg() {

		logger.info("getMsg() - execution stated..");

		String msg = "Welcome to Ashok IT..!!";

		try {
			int i = 10 / 0;
		} catch (Exception e) {
			logger.error("Exception : " + e.getMessage());
		}

		logger.info("getMsg() - execution ended..");

		return msg;
	}
}
