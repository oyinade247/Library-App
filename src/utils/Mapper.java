package utils;

import data.models.Book;
import dtos.requests.AddBookRequest;
import dtos.responses.AddBookResponse;

public class Mapper {
    public static Book map(AddBookRequest addBookRequest){
        Book book = new Book();
        book.setQuantity(addBookRequest.getQuantity());
        book.setName(addBookRequest.getAuthorName());
        book.setEdition(addBookRequest.getEdition());
        book.setPages(addBookRequest.getPages());
        book.setAuthorName(addBookRequest.getAuthorName());
        return  book;

    }
    public static AddBookResponse map(Book book){
        AddBookResponse addBookResponse = new AddBookResponse();
       addBookResponse.setAuthorName(book.getAuthorName());
       addBookResponse.setEdition(book.getEdition());
        return addBookResponse;


    }


}
