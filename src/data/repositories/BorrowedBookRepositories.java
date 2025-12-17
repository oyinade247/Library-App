package data.repositories;

import data.models.Book;

public interface BorrowedBookRepositories {
    long count();

    BorrowedBookRepositories save(Book book);
}
