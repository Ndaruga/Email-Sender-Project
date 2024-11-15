package org.EmailSender;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String product = "Pro Productivity Suite";
        String offerDetails = "50% OFF for the first 3 months";
        String validity = "Valid until December 31, 2024";

        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("Book1.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                String clientName = values[0];
                String recipientEmail = values[1];

                // HTML message
                String draftMsg = "<div style=\"background-color: #004aad; height: 70px; width: calc(100% + 40px); margin-left: -20px; margin-right: -20px; display: flex; justify-content: center; align-items: center;\">" +
                        "<h2 style=\"font-size: 20px; color: white; margin: 0; padding: 30px;\">Exclusive Offer on " + product + "!</h2>" +
                        "</div>" +

                        "<h4 style=\"color: #1a2561\">Dear " + clientName + ",</h4>" +
                        "<p>We are excited to bring you an exclusive sales offer for our premium product: <strong>" + product + "</strong>.</p>" +
                        "<p><strong>Enjoy " + offerDetails + ".</strong></p>" +
                        "<p>With " + product + ", you can streamline your workflow, improve efficiency, and achieve better results for your business.</p>" +

                        "<h3 style=\"color: #1a2561; font-size: 18px;\">Why Choose " + product + "?</h3>" +
                        "<ul style=\"padding-left: 20px;\">" +
                        "<li><strong>Advanced Features:</strong> Tools designed for professionals to save time and effort.</li>" +
                        "<li><strong>Ease of Use:</strong> User-friendly interface tailored for your convenience.</li>" +
                        "<li><strong>Unparalleled Support:</strong> 24/7 customer service to assist you anytime.</li>" +
                        "</ul>" +

                        "<p><strong>Hurry! This offer is " + validity + ".</strong></p>" +
                        "<p><strong>Interested?</strong> Reply to <a href=\"mailto:mail@gmail.com\">this email</a> or visit our website to learn more and claim your offer.</p>" +
                        "<p>Looking forward to helping you achieve greater success!</p>" +
                        "<p>Best regards,</p>" +
                        "<p><strong>Francis</strong><br>Your Sales Team</p>";

                EmailSender.sendEmail(recipientEmail, "Exclusive Sales Offer on " + product, draftMsg);
                System.out.print("\nEmail sent to " + clientName.split(" ")[0] + " via " + recipientEmail);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}