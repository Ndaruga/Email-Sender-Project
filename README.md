---

# Email Sender

## Overview
The **Email Sender** is a Java application designed to send personalized sales emails to clients. It reads client data (names and email addresses) from a CSV file, customizes an HTML email for each client, and sends it using Gmail's SMTP server.

![image](https://github.com/user-attachments/assets/3f6fdf7d-6923-48fc-9d27-521a3d08d475)


This application is perfect for reaching out to multiple clients with tailored offers in an efficient and professional manner.

---

## Features
- Reads client data from a CSV file.
- Generates personalized HTML emails dynamically.
- Sends emails using Gmail’s SMTP server.
- Handles bulk email sending.

---

## Prerequisites
1. **Java Development Kit (JDK)**: Version 8 or higher.
2. **Maven**: For managing dependencies.
3. **Gmail Account**: To send emails via Gmail SMTP.
   - If you're using Gmail, you will need to generate a **16-digit App Password** from your Google Account's **Security Settings**.

---

## Setup Instructions

### Step 1: Clone the Repository
Clone the repository to your local machine:
```bash
git clone https://github.com/Ndaruga/Email-Sender-Project.git
cd Email-Sender-Project
```

---

### Step 2: Prepare the Data
Create a CSV file named `Book1.csv` in the root directory of the project. The file should have the following format:

```
Name,Email
Alex Nathanail,Alex.Nathanail.20@yamma.co.uk
Andrzej Szablewski,andrzej.szablewski.20@fintec.com
```

Ensure that the CSV contains client names and emails in the specified format.

---

### Step 3: Update the Email Credentials
1. Open the `EmailSender.java` file.
2. Replace the `username` and `password` fields with your Gmail credentials:
   ```java
   final String username = "your-email@gmail.com";
   final String password = "your-16-digit-app-password";
   ```
3. **Important**: 
   - The password is a **16-digit alphanumeric password** generated via Google **App Passwords**.  
   - To generate an App Password:
     1. Go to your [Google Account Security Settings](https://myaccount.google.com/security).
     2. Scroll to "Signing in to Google" and select or search for **App Passwords**.
     3. Create an App Password for "Mail" and copy it.

---

### Step 4: Build and Run the Application

#### Using IntelliJ IDEA:
1. **Open the Project**: Import the project into IntelliJ as a Maven project.
2. **Build the Project**:
   - Go to the **Maven** tab on the right.
   - Click on **Lifecycle > clean** and then **install** to build the project.
3. **Run the Main Class**:
   - Locate `Main.java` in the `org.EmailSender` package.
   - Right-click and select **Run Main.main()**.

#### Using Command Line:
1. **Compile the Project**:
   ```bash
   mvn clean install
   ```
2. **Run the Application**:
   ```bash
   java -cp target/EmailSender-1.0-SNAPSHOT.jar org.EmailSender.Main
   ```

---

## How It Works
1. The application reads the `Book1.csv` file to get client names and emails.
2. It generates a personalized HTML email for each client.
3. Emails are sent using Gmail's SMTP server.
4. Each email is logged to the console to confirm successful delivery.

---

## Troubleshooting
- **Invalid Credentials**: Ensure your Gmail username and 16-digit App Password are correctly entered.
- **File Not Found**: Verify that `Book1.csv` is in the root directory and follows the specified format.
- **SMTP Issues**:
  - Check if "Allow less secure apps" is enabled (deprecated for most regions).
  - Ensure App Passwords are used instead of your account password.

---

## Example Output
Here’s an example log of sent emails:
```
Email sent to ﻿Francis via  cejiye6866@operades.com
Email sent to Alex via Alex.Nathanail.20@yamma.co.uk
Email sent to Andrzej via andrzej.szablewski.20@fintec.com
```

---

## Notes
- Use App Passwords for enhanced security when using Gmail.
- Avoid sharing or exposing your CSV file or credentials in public repositories.
- You can customize the email content by modifying the HTML message in `Main.java`.

---

## Author
**Francis Ndaruga**  
[Email](mailto:ndaruga.francis@gmail.com)

---
