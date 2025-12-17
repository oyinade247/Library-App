package data.repositories;

import data.models.Book;
import exceptions.BookRespositories.InvalidException;

import java.util.ArrayList;
import java.util.List;

public class BookRepositoriesImp implements BookRepositories {
    List<Book> books = new ArrayList<>();
    private int count;

    @Override
    public long count(){
        return books.size();
    }

    @Override
    public Book save(Book book) {
        if(isNew(book))saveNewBook(book);else updateBook(book);
        return book;
    }

    private boolean isNew(Book book){
        return book.getId() == 0;
    }

    private void updateBook(Book book){
        deleteById(book.getId());
        books.add(book);
    }

    private void saveNewBook(Book book){
        book.setId(++count);
        books.add(book);
    }

    @Override
    public Book findById(int id) {
        validate(id);
       for(Book book : books){
           if(book.getId() == id)return book;
       }
       return null;
    }

    @Override
    public void deleteById(int id) {
      Book foundBook =  findById(id);
      books.remove(foundBook);
    }

    @Override
    public boolean existsById(int id) {
        for(var book: books){
            if(book.getId() == id){
                return true;
            }
        }
        return false;
    }

    private void validate(int id){
        if(id < 0 || id > books.size() )throw new InvalidException("invalid id");
    }




}
