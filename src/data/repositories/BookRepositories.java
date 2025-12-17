package data.repositories;

import data.models.Book;

public interface BookRepositories {
    long count();
    Book save(Book book);

    Book findById(int id);
    void deleteById(int id);

    boolean existsById(int id);
}
