package com.irsa.web.allpay.model.util;

public enum PaymentStatus {
	CREATE("create"), OPEN("open"), TIME_OUT("time out"), COMPLETE("complete"), EMPTY(
			"empty");

	private String value;

	private PaymentStatus(String value) {
		setValue(value);
	}

	public String getValue() {
		return value;
	}

	private void setValue(String value) {
		this.value = value;
	}

	public String toString() {
		return getValue();
	}

	public static PaymentStatus parse(String value) {
		for (PaymentStatus type : PaymentStatus.values()) {
			if (type.getValue().equals(value)) {
				return type;
			}
		}
		return EMPTY;
	}
}
