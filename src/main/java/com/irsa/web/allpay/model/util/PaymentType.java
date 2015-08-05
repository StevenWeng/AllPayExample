package com.irsa.web.allpay.model.util;

public enum PaymentType {
	CREDIT("Credit"), WEB_ATM("WebATM"), ATM("ATM"), CVS("CVS"), BARCODE(
			"BARCODE"),EMPTY("empty");

	private String value;

	private PaymentType(String value) {
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

	public static PaymentType parse(String value) {
		for (PaymentType type : PaymentType.values()) {
			if(type.getValue().equals(value)){
				return type;
			}
		}
		return EMPTY;
	}
}
