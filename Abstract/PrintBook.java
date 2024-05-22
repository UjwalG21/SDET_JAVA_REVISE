package com.sdet.java.Abstract;

public class PrintBook extends Book {

	@Override
	void getDetails(String name, String author, Double price) {
		// TODO Auto-generated method stub
		System.out.println("Name:" + name + "Author:" + author + "Price:" + price);
	}

}
