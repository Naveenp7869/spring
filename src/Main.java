import com.spring.entities.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      ApplicationContext applicationContext =new  ClassPathXmlApplicationContext("com/spring/resource/config.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println(user);
    }
}