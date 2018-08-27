package com.yash.lms.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.yash.lms.vo.Book;


public class BookDao{

	public List<Book> searchBook(Book requestBook){
		List<Book> allBooksList = getBooks();
		List<Book> responseBookList = allBooksList.stream().filter(b -> b.equals(requestBook)).collect(Collectors.toList());
		return responseBookList;
	}

	public List<Book> getBooks() {
		List<Book> bookList = new ArrayList<>();
		bookList.add(new Book(1, "House of Leaves", "Mark Daniel", "Horror Genre", 10, 8));
		bookList.add(new Book(2, "Rosemary's Baby", "Ira Levin", "Horror Genre", 6, 4));
		bookList.add(new Book(3, "The Haunting of Hill House", "Shirley Jackson", "Horror Genre", 7, 3));
		bookList.add(new Book(4, "Lord of the Flies", "William Golding", "Horror Genre", 5, 4));
		bookList.add(new Book(5, "Night Film", "Marisha Pessi", "Horror Genre", 5, 5));
		bookList.add(new Book(6, "The Girl on the Train", "Paula Hawkins", "Suspense Genre", 4, 2));
		bookList.add(new Book(7, "Before I Go to sleep", "S.J.Watson", "Suspense Genre", 5, 1));
		bookList.add(new Book(8, "Bird Box", "Josh Malerman", "Suspense Genre", 5, 0));
		bookList.add(new Book(9, "Core Java", "Black Book", "Computer Science", 4, 4));
		bookList.add(new Book(10, "Java Enterprise Edition", "Black Book", "Computer Science", 5, 4));
		bookList.add(new Book(11, "Android", "Black Book", "Computer Science", 5, 4));
		bookList.add(new Book(12, "ASP .net", "Black Book", "Computer Science", 5, 4));
		return bookList;
	}

	
	
}
