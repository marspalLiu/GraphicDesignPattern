package com.gdp.factory_method.exercise;

import com.gdp.factory_method.framework.Product;

public class IDCard extends Product {
	
	private String owner;
	private int serial;
	
	IDCard(String owner, int serial) {
		System.out.println("����" + owner + "(" + serial + ")" + "��ID����");
		this.owner = owner;
		this.serial = serial;
	}

	@Override
	public void use() {
		System.out.println("ʹ��" + owner + "(" + serial + ")" + "��ID����");
	}

	public String getOwner() {
		return owner;
	}
	
	public int getSerial() {
		return serial;
	}
}