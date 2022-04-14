package nl.inholland.guitarshopapi;


import nl.inholland.guitarshopapi.model.Guitar;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class GuitarShopApiApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(GuitarShopApiApplication.class, args);
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

	@Bean
	@Scope(scopeName = BeanDefinition.SCOPE_PROTOTYPE)
	public List<Guitar> guitars(){
		return new ArrayList<>(
				List.of(
						new Guitar("Fender", "Telecaster", 1450.00),
						new Guitar("Fender", "Stratocaster", 1750.00),
						new Guitar("Gibson", "Les Paul", 2250.00)
				));
	}

}
