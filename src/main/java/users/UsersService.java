package users;


import java.io.File;
import java.util.List;

public class UsersService {
    public UsersDao userDao;

    public  UsersService(){

        userDao = new UsersDaoFileImpl(new File("").getAbsolutePath()+"\\user");
        //userDao = new UsersDaoFileImpl(path);
    }
    public void addUser(User user){
        userDao.addUser(user);
    }

    public User findUserbyName(String name){
        List<User> users = userDao.findAll();
        for (User user:
             users) {
            if(user.get_name().equals(name)){
                return user;
            }

        }
        return null;
    }
}
