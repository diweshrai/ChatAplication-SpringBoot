package com.example.demo.Controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Message.Messa;

@RestController
public class MessaContr {

	
	
	@MessageMapping("/message")
	@SendTo("/topic/return-to")
	public Messa getContent(@RequestBody Messa mess) {

		try {
//			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return mess;
	}

}
