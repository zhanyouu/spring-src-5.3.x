import config.UserConfig;
import entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				UserConfig.class);
		User user = (User) context.getBean("user");
		System.out.println(user);
	}
}