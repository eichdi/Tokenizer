package users;

import java.util.List;

/**
 * Created by SOTI on 25.05.2016.
 */
public interface UsersDao {
    List<User> findAll();
    void addUser(User user);
}
