package data.repositories;


import data.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositioriesImpl  implements UserRepositories{
    List<User> users = new ArrayList<>();
    private int count;

    @Override
    public long count(){
        return users.size();
    }

    @Override
    public User save(User user) {
        if(isNew(user))saveNewUser(user);else updateUser(user);
        return user;
    }

    private boolean isNew(User user){
        return user.getId() == 0;
    }

    private void updateUser(User user){
        deleteById(user.getId());
        users.add(user);
    }

    private void saveNewUser(User user){
        user.setId(++count);
        users.add(user);
    }

    @Override
    public User findById(int id) {

        return users.get(id -1);
    }

    @Override
    public void deleteById(int id) {
        User foundUser =  findById(id);
        users.remove(foundUser);
    }

    @Override
    public boolean existsById(int id) {
        for(var user: users){
            if(user.getId() == id){
                return true;
            }
        }
        return false;
    }
}
