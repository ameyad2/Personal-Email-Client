
# Personal-Email-Client

## Description
**Personal Email Client** is a full-stack application that serves as your personal email manager. This multipurpose web application enables you to draft creative emails with a rich text editor and add multiple attachments. It also imports emails from various Gmail folders like Inbox, Sent, Personal, and more. With its versatile features, Personal Email Client helps you manage your email-related tasks efficiently and creatively.

## Demo

### Compose Email Screen

![Compose Email](https://github.com/ameyad2/Personal-Email-Client/blob/master/images-demo/ComposeEmail.JPG?raw=true)

This screenshot shows the email composition interface where users can draft and send emails. It includes features like rich text formatting, attachment support, and more.

### Sending Email Screen

![Sending Email](https://github.com/ameyad2/Personal-Email-Client/blob/master/images-demo/SendingEmail.JPG?raw=true)

This screenshot illustrates the process of sending an email. It demonstrates the user interface and options available during the sending process.

### Mail Screen on Gmail (Tested Emails)
![Tested Emails](https://github.com/ameyad2/Personal-Email-Client/blob/master/images-demo/TestedEmails.JPG?raw=true)

This screenshot shows the email in the Gmail interface after being sent using the Personal Email Client. It verifies that the email was successfully delivered.

## Installation

### Front End
To set up the front end of the Personal-Email-Client, follow these steps:

1. **Set up a Vite React environment**:
   ```bash
   npm create vite@latest
   ```

2. **Install Tailwind CSS and necessary plugins**:
   ```bash
   npm install -D tailwindcss postcss autoprefixer
   npx tailwindcss init -p
   ```

3. **Install additional dependencies**:
   - Install React Hot Toast:
     ```bash
     npm install react-hot-toast
     ```
   - Install Axios:
     ```bash
     npm i axios
     ```
   - Install TinyMCE React component:
     ```bash
     npm install --save @tinymce/tinymce-react
     ```

## Usage
Personal-Email-Client can be used to send creative emails to multiple recipients, with the ability to add multiple attachments. It also allows users to view and manage emails received from various sources efficiently. This daily utility application enhances your email management experience with its rich feature set.

## Features
1. **Send Creative and Attractive Emails**: Utilize the rich text editor to draft visually appealing emails.
2. **HTML in Messages**: Add HTML content within your emails for enhanced formatting.
3. **Multiple Attachments**: Easily attach multiple files to your emails.
4. **Interactive UI**: Enjoy a user-friendly and interactive interface.
5. **Email Import**: Import emails from various Gmail folders, including Inbox, Sent, and more.

## API Documentation
The API documentation for Personal-Email-Client is available within the repository, detailing the various endpoints and how to interact with them.
This API provides endpoints for sending emails, including HTML messages and attachments, and retrieving sent emails.

## Endpoints

### 1. Send an Email or HTML Message
**Endpoint:** `POST /api/v1/email/send`

- **URL:** `localhost:8080/api/v1/email/send`
- **Description:** Sends an email or an HTML message to the specified recipients.
- **Request Body:**
  ```json
  {
    "to":"abc@gmail.com",
    "subject":"Email via Postman: HTML",
    "message": "<h1>Email Sent using Postman with HTML</h1>"
  }
  ```
- **Response:**
  - **Success:** 
    ```json
    {
      "message": "Email Sent Successfully !!",
      "httpStatus": "OK",
      "success": true
    }
    ```
  - **Failure:** Appropriate error message.

### 2. Send an Email with Attachment
**Endpoint:** `POST /api/v1/email/send-with-file`

- **URL:** `localhost:8080/api/v1/email/send-with-file`
- **Description:** Sends an email with one or more attachments.
- **Request Body (Multipart/Form-Data):**
  - **Fields:**
    - `to`: "abc@gmail.com"
    - `subject`: "Email subject."
    - `message`: "Email body in plain text or HTML."
    - `attachments`: Files to attach (one or more files).
- **Response:**
  - **Success:** 
    ```json
    {
      "message": "Email Sent Successfully !!",
      "httpStatus": "OK",
      "success": true
    }
    ```
  - **Failure:** Appropriate error message.

### 3. Get All Sent Emails
**Endpoint:** `POST /api/v1/email/get-sent-emails`

- **URL:** `localhost:8080/api/v1/email/get-sent-emails`
- **Description:** Retrieves a list of all emails that have been sent.
- **Response:**
  - **Success:**
    ```json
    [
      {
        "to": "recipient1@example.com",
        "subject": "First Email Subject",
        "body": "First Email Body",
        "dateSent": "2024-08-15T12:34:56Z"
      },
      {
        "to": "recipient2@example.com",
        "subject": "Second Email Subject",
        "body": "Second Email Body",
        "dateSent": "2024-08-15T12:45:00Z"
      }
    ]
    ```
  - **Failure:** Appropriate error message.


For easy access, postman api collection is checked in backend code. You can directly download and import in postman collection.


## 🚀 About Me

## About Me

I am a full-stack developer with a strong focus on backend development. With over 2.5 years of experience in the industry, I have honed my skills in a wide range of backend technologies and frameworks. My expertise includes:

- **Spring Boot**: Building scalable and efficient backend applications.
- **Java**: Writing robust and maintainable code.
- **JPA-Hibernate**: Managing database interactions with ease.
- **Kafka**: Implementing reliable messaging and streaming systems.
- **Backend Development Architecture**: Designing and implementing reliable and scalable backend systems.
- **REST and SOAP Requests**: Developing and consuming APIs with precision.
- **Data Structures and Algorithms**: Solving complex problems with optimized solutions.
- **MySQL & IBM DB2**: Managing and querying relational databases effectively.
- **Additional Backend Technologies**: Experience with tools and platforms such as Docker, Kubernetes, Microservices architecture, and CI/CD pipelines.

My passion for backend development drives me to continuously learn and improve, ensuring that I stay updated with the latest trends and technologies in the field.
