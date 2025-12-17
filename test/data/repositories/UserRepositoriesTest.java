package data.repositories;


import data.models.User;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoriesTest {
    @Test
    void testThatUserRespositoriesIsEmpty(){
        UserRepositories userRepositories = new UserRepositioriesImpl();
        assertEquals(0,  userRepositories.count());

    }

    @Test
    void testThatIfUserIsBeenAdded_countIncreses(){
        UserRepositories userRepositories = new UserRepositioriesImpl();
        assertEquals(0,  userRepositories .count());
        userRepositories .save(new User());
        assertEquals(1L,  userRepositories .count());

    }

    @Test
    void testThatIfTwoUserIsBeenAdded_countIncreases(){
        UserRepositories userRepositories = new UserRepositioriesImpl();
        assertEquals(0, userRepositories.count());
        userRepositories.save(new User());
        userRepositories.save(new User());
        assertEquals(2L, userRepositories.count());

    }

    @Test
    void testThatUserRespositoriesCanBeFindById(){
        UserRepositories userRepositories = new UserRepositioriesImpl();
        assertEquals(0, userRepositories.count());
        User user = userRepositories .save(new User());
        assertEquals(user,userRepositories.findById(1));
    }



    @Test
     void testThatIfUserIsAdded_itCanBedeleted(){
        UserRepositories userRepositories = new UserRepositioriesImpl();
        assertEquals(0, userRepositories.count());
        User user = userRepositories.save(new User());
        userRepositories.deleteById(1);
        assertEquals(0, userRepositories.count());

    }

    @Test
    void testThatUserRespository_canbBeCheckedIfItExists(){
        UserRepositories userRepositories = new UserRepositioriesImpl();
        assertEquals(0, userRepositories.count());
        User user = userRepositories.save(new User());
        assertEquals(1L, userRepositories.count());
        assertFalse(userRepositories.existsById(4));


    }

}