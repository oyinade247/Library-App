package data.repositories;


import data.models.User;

public interface UserRepositories {
    long count();
    User save(User user);

   User findById(int id);
    void deleteById(int id);

    boolean existsById(int id);
}
