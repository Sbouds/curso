package com.doug.cursomc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.doug.cursomc.services.DBService;
import com.doug.cursomc.services.EmailService;
import com.doug.cursomc.services.MockEmailService;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private DBService dbService;
	
	@Bean
	public boolean instantiateDataBase() throws ParseException {
		dbService.instantiateTestDataBase();		
		return true;
	}
	
	@Bean
	public EmailService emailService() {
		return new MockEmailService();
	}
}
