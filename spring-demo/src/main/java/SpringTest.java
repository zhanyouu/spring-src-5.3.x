import cicle.A;
import cicle.B;
import entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
//				UserConfig.class);
//		User user = (User) context.getBean("user");
//		System.out.println(user);
		ApplicationContext xmlContext = new ClassPathXmlApplicationContext("demo.xml");
		A a = (A) xmlContext.getBean("a");
		B b = (B) xmlContext.getBean("b");
		System.out.println(a);
		System.out.println(b);
	}
}