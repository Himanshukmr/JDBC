package client;

import java.util.ArrayList;
import java.util.List;

import service.BookStoreService;


import domain.Book;
import domain.Chapter;
import domain.Publisher;

public class BookStoreClient {
	public static void main(String[] args) {
		BookStoreService bookStoreService = new BookStoreService();

		//persisting object graph
		/*
		 * Publisher publisher = new Publisher("Edu", "Education Publications Co.");
		 * 
		 * Book book = new Book("9781617290458", "Hibernate, First Edition", publisher);
		 * 
		 * List<Chapter> chapters = new ArrayList<Chapter>(); Chapter chapter1 = new
		 * Chapter("Introduction to Hibernate", 1); chapters.add(chapter1); Chapter
		 * chapter2 = new Chapter("Connection to database", 2); chapters.add(chapter2);
		 * 
		 * book.setChapters(chapters);
		 * 
		 * bookStoreService.persistObjectGraph(book);
		 */

		//retrieving object graph
		Book book = bookStoreService.retrieveObjectGraph("9781617290459");
		System.out.println(book);
		
		System.out.println();
		
		Book book2 = bookStoreService.retrieveObjectGraph("9781617290458");
		System.out.println(book2);

	}
}





