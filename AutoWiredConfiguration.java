package com.xworkz.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.autowiredconstructor")
public class AutoWiredConfiguration {
	
	public AutoWiredConfiguration() {
		System.out.println("Auto wired configuration is running");
	}

	@Bean
	public int id() {
		return 10;

	}

	@Bean
	public String name() {
		return "THE HINDU";

	}

	@Bean
	public String ownerName() {
		return "AKSHAY";
	}

	@Bean
	public String langauge() {
		return "ENGLISH";
	}

	@Bean

	public double price() {
		return 50.0;
	}

	@Bean

	public String engineName() {
		return "ELGE COMPRESSOR ENGINE";

	}

	@Bean
	public String engineType() {
		return "BOREWELL COMPRESSOR ENGINE";
	}

	@Bean
	public long number() {
		return 990023873;
	}

	@Bean
	public String version() {
		return "V2023";
	}

	@Bean

	public String company() {
		return "ASHOK LEYLAND";
	}

	@Bean
	public int strokes() {
		return 4;
	}

	@Bean

	public String snakeName() {
		return "QWERTY";
	}

	@Bean
	public double length() {
		return 5.5;
	}

	@Bean
	public String color() {
		return "BLACK";
	}

	@Bean
	public String type() {
		return "COBRA";
	}

	@Bean
	public boolean poisionas() {
		return true;
	}

	@Bean
	public String gostName() {
		return "BOO BERRY";

	}

	@Bean
	public int age() {
		return 23;
	}

	@Bean
	public String gostColor() {
		return "BLUE";
	}

	@Bean
	public String fatherName() {
		return "PURPLISH-RED";
	}

	@Bean
	public String motherName() {
		return "GREENISH-BLUE";
	}

	@Bean
	public int fingurSize() {
		return 3;
	}

	@Bean
	public String nativename() {
		return "NEW YORK";
	}

	@Bean
	public String state() {
		return "NEW YORK";
	}

	@Bean
	public String country() {
		return "USA";
	}

	@Bean

	public String gostType() {
		return "COMEDY";
	}

	@Bean
	public String dress() {
		return "saree";
	}

	@Bean
	public double gostHeight() {
		return 5.5;
	}

	@Bean
	public double gostWeight() {
		return 60;
	}

	@Bean
	public String faceType() {
		return "Normal";
	}

	@Bean
	public boolean craying() {
		return false;
	}

	@Bean
	public String ringsType() {
		return "circle";
	}

	@Bean
	public String sarytype() {
		return "Normal";
	}

	@Bean
	public String wepons() {
		return "THOP";
	}

	@Bean
	public boolean fingerPrint() {
		return true;
	}

	@Bean
	public int legSize() {
		return 4;
	}


}
