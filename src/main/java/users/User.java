package users;

/**
 * Created by SOTI on 25.05.2016.
 */
public class User {
    private String name;
    private String info;
    public User(String name, String info){
        this.name = name;
        this.info = info;
    }
    public  String get_name() {
        return this.name;
    }
    public  String get_info(){
        return this.info;
    }

}
