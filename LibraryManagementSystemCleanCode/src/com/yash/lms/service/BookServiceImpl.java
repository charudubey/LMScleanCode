package com.yash.lms.service;

import java.util.List;

import com.yash.lms.dao.BookDao;
import com.yash.lms.vo.Book;

public class BookServiceImpl implements BookService{

	@Override
	public List<Book> searchBook(Book input) {
		BookDao bookDao = new BookDao();
		List<Book> bookList = bookDao.searchBook(input);
		return bookList;
	}

}
