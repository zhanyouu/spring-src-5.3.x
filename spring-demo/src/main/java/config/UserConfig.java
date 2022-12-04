package config;

import entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig{
	@Bean
	public User user(){
		return new User(29,"zhanyou");
	}
}
