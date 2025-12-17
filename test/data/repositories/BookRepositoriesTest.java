package data.repositories;

import data.models.Book;
import exceptions.BookRespositories.InvalidException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookRepositoriesTest {

    @Test
    void testThatBookRespositoriesIsEmpty(){
        BookRepositories bookRepositories = new BookRepositoriesImp();
        assertEquals(0, bookRepositories.count());

    }

    @Test
    void testThatIfBookIsBeenAdded_countIncreses(){
        BookRepositories bookRepositories = new BookRepositoriesImp();
        assertEquals(0, bookRepositories.count());
        bookRepositories.save(new Book());
        assertEquals(1L, bookRepositories.count());

    }

    @Test
    void testThatIfTwoBookIsBeenAdded_countIncreases(){
        BookRepositories bookRepositories = new BookRepositoriesImp();
        assertEquals(0, bookRepositories.count());
        bookRepositories.save(new Book());
        bookRepositories.save(new Book());
        assertEquals(2L, bookRepositories.count());

    }

    @Test
    void testThatBookRespositoriesCanBeFindById(){
        BookRepositories bookRepositories = new BookRepositoriesImp();
        assertEquals(0, bookRepositories.count());
        Book book = bookRepositories.save(new Book());
        assertEquals(book, bookRepositories.findById(1));
    }

    @Test
    void testThatBookRepositoriesWillThrowExceptionIflistIsNull(){
        BookRepositories bookRepositories = new BookRepositoriesImp();
        assertEquals(0, bookRepositories.count());
        assertThrows(InvalidException.class,() ->bookRepositories.findById(1));

    }

    @Test
    void testThatIfBookIsAdded_itCanBedeleted(){
        BookRepositories bookRepositories = new BookRepositoriesImp();
        assertEquals(0, bookRepositories.count());
        Book book = bookRepositories.save(new Book());
        bookRepositories.deleteById(1);
        assertEquals(0, bookRepositories.count());

    }

    @Test
    void testThatBookRespository_canbBeCheckedIfItExists(){
        BookRepositories bookRepositories = new BookRepositoriesImp();
        assertEquals(0, bookRepositories.count());
        Book book = bookRepositories.save(new Book());
        assertEquals(1L, bookRepositories.count());
        assertFalse(bookRepositories.existsById(1));


    }


}