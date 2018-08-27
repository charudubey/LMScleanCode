package com.yash.lms.service;

import java.util.List;
import com.yash.lms.vo.Book;

public interface BookService {

	List<Book> searchBook(Book input);
}
