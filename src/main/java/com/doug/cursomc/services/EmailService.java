package com.doug.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.doug.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
