package com.lazaro.course.entities.enums;

public enum OrderStatus {
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	private int code;
	
	OrderStatus(int i) {
		code = i;
	}

	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for(OrderStatus i : OrderStatus.values()) {
			if(code == i.getCode()) {
				return i;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}
