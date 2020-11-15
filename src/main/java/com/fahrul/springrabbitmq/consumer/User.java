package com.fahrul.springrabbitmq.consumer;

import org.springframework.stereotype.Component;

import com.fahrul.springrabbitmq.dto.OrderStatus;

@Component
public class User {
	
	public void consumeMessageFromQueue(OrderStatus orderStatus) {
		System.out.println("Message recieved from queue : "+orderStatus);
	}

}
