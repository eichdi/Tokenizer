package users;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SOTI on 25.05.2016.
 */
public class UsersDaoFileImpl implements UsersDao {
    String path;

    public UsersDaoFileImpl(String path){
        this.path = path;
    }

    private void save(List<User> users){
        for (User user :
                users) {
            File file = new File(path+"\\"+user.get_name()+".user");

                try{
                    file.createNewFile();
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                    writer.write(user.get_name());
                    writer.newLine();
                    writer.write(user.get_info());
                    writer.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }

        }
    }
    @Override
    public List<User> findAll() {

        ArrayList<User> users = new ArrayList<>();
        File tempfile=new File(path);
        tempfile.mkdirs();
        File[] files = tempfile.listFiles();
        for (File file:
             files) {
            if (file.getName().contains("user") && file.isFile()) {
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    users.add(new User(reader.readLine(),reader.readLine()));
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        return users;
    }
    public void addUser(User user){
        List<User> users  = findAll();
        users.add(user);
        save(users);
    }
}
