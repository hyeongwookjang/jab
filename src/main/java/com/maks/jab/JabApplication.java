package com.maks.jab;

import com.maks.jab.object.CalculatorDemo;
import com.maks.jab.object.CalculatorDemo2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JabApplication {


	public static void main(String[] args) {
		SpringApplication.run(JabApplication.class, args);


		CalculatorDemo.main(new String[0]);
		CalculatorDemo2.main(new String[0]);

	}

}
