package com.yash.lms;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.yash.lms.service.BookService;
import com.yash.lms.service.BookServiceFactory;
import com.yash.lms.service.BookServiceImpl;
import com.yash.lms.vo.Book;

public class LMSEntryPoint {

	public static void main(String[] args) {
		
		Book bookRequest = new Book();
		Scanner getInput = new Scanner(System.in);
		System.out.println("Please enter category: ");
		bookRequest.setBookCategory(getInput.next());

		try{
			BookServiceFactory bookServiceFactory = new BookServiceFactory();
			BookService service = bookServiceFactory.getBookType(bookRequest);
			Optional<BookService> serviceCheckNull = Optional.ofNullable(service);
			if(!serviceCheckNull.isPresent()){
				System.out.println("Invalid Category!");
			} else{
				List<Book> responseBookList = service.searchBook(bookRequest);
				checkNull(responseBookList);
			}
			
			System.out.println("Please Enter Book ID: ");
			bookRequest = new Book();
			bookRequest.setBookId(getInput.nextInt());
			BookService bookService = new BookServiceImpl();
			List<Book> responseList = bookService.searchBook(bookRequest);
			checkNull(responseList);
			
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			getInput.close();
		}

	}
	
	public int sum(Integer a, Integer b){
		return a+b;
	}
	
	private static void checkNull(List<Book> responseList){
		Optional<List<Book>> responseListCheckNull = Optional.ofNullable(responseList);
		if(responseListCheckNull.isPresent())
			responseList.forEach(System.out::println);
 		else
			System.out.println("Book Not found!");
	}

}
