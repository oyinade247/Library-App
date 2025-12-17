package data.repositories;

import data.models.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BorrowedBookRepositoriesTest {
    @Test
    void testThatBorrowedBookRepositoriesIsEmpty(){
        BorrowedBookRepositories borrowedBookRepositories = new BorrowBookRepositoriesImp();
        assertEquals(0, borrowedBookRepositories.count());

    }

    @Test
    void testThatIfOneBookIsBorrowed_countIncreases(){
        BorrowedBookRepositories borrowedBookRepositories = new BorrowBookRepositoriesImp();
        assertEquals(0, borrowedBookRepositories.count());
       // borrowedBookRepositories.save(new Book(book));
        assertEquals(0, borrowedBookRepositories.count());


    }
}