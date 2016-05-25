import tokenizer.Tokenizer;
import tokenizer.TokenizerImpl;
import users.User;
import users.UsersService;

public class Main {

    public static void main(String[] args) {
        UsersService usersService = new UsersService();
        usersService.addUser(new User("Иннокентий", "Черепаха"));
        usersService.addUser(new User("Стас", "Борецкий"));
        usersService.addUser(new User("Рюко", "Матой"));
        usersService.addUser(new User("Сайтама", "Onepunch"));
        User stas = usersService.findUserbyName("Стас");
//        String text = "sluchaini tekst dlya Marselya";
//        Tokenizer tokenizer = new TokenizerImpl();
//        for (String word:
//                tokenizer.split(text)) {
//
//            System.out.printf(word + "\n");
//
//        }
    }

}