package com.trer.group.service;

import com.trer.group.bean.AuthCode;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Random;

@Service
@CrossOrigin(origins = "*", maxAge = 3600)
public class EmailSenderService {
	@Autowired
	private JavaMailSender sender;
	@Autowired
	private AuthCode authCode;

	public void sendEmail(String to) throws MessagingException {
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);
		helper.setFrom("Verification Code <samuel.barra99@gmail.com>");
		helper.setTo(to);
		helper.setSubject("Your Verification Code");
		helper.setText("<html><body>Your verification code is: <b>"+ authCode.getAuthCode()+"</b></body></html>" , true);
		sender.send(message);
	}



}
