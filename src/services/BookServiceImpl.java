package services;

import data.models.Book;
import data.repositories.BookRepositories;
import data.repositories.BookRepositoriesImp;
import dtos.requests.AddBookRequest;
import dtos.responses.AddBookResponse;

import static utils.Mapper.map;

public class BookServiceImpl implements BookService {

    private BookRepositories bookRepositories;

    public BookServiceImpl(BookRepositories bookRepositories) {
        this.bookRepositories =  bookRepositories;
    }


    @Override
    public AddBookResponse addBook(AddBookRequest addBookRequest) {
       Book book =  map( addBookRequest );
        bookRepositories.save(book);
        return map(book);
    }




}
