package com.yash.lms.service;

import com.yash.lms.vo.Book;

public class BookServiceFactory{

	public BookService getBookType(Book input) {
		
		if(input.getBookCategory().equalsIgnoreCase("HORROR"))
			return new HorrorBookImpl();
		else if(input.getBookCategory().equalsIgnoreCase("SUSPENSE"))
			return new SuspenseBookImpl();
		
		return null;
	}

	
}
