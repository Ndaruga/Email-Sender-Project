package org.EmailSender;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailSender {
    public static void sendEmail(String recipient, String subject, String htmlContent) {

        final String username= "your-email@gmail.com";
        final String password = "";

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
            message.setSubject(subject);

            // Set the content type to HTML
            message.setContent(htmlContent, "text/html; charset=utf-8");

            Transport.send(message);

//            System.out.println("Email sent successfully");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
