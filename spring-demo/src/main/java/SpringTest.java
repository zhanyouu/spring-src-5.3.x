import config.UserConfig;
import entity.Person;
import entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
//				UserConfig.class);
//		User user = (User) context.getBean("user");
//		System.out.println(user);
		ApplicationContext xmlContext = new ClassPathXmlApplicationContext("person.xml");
		Person person = (Person) xmlContext.getBean("person");
		System.out.println(person);
	}
}