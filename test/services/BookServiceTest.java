package services;

import data.models.Book;
import data.models.Genre;
import data.repositories.BookRepositories;
import data.repositories.BookRepositoriesImp;
import dtos.requests.AddBookRequest;
import dtos.responses.AddBookResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {
    @Test
    void testThatAddBookCanAddABookAndCountWillBeOne(){
       BookRepositories bookRepositories = new BookRepositoriesImp();
        BookService bookService = new BookServiceImpl(bookRepositories);
        AddBookRequest request = new AddBookRequest();
        request.setAuthorName("Oyin");
        request.setEdition(1);
        request.setGenre(Genre.SCIFI);
        AddBookResponse response = bookService.addBook(request);
        assertEquals(response.getAuthorName(), request.getAuthorName());
        assertEquals(1, bookRepositories.count());
    }

}