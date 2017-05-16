package eu.sig.training.ch05.buildandsendmail;

import eu.sig.training.ch05.buildandsendmail.BuildAndSendMail.Employee;
import eu.sig.training.ch05.buildandsendmail.BuildAndSendMail.Mail;
import eu.sig.training.ch05.buildandsendmail.BuildAndSendMail.Message;

public class BuildAndSendMail {
    public static class Employee {
		public String firstName;
		public String lastName;
		public String division;

		public Employee(String firstName, String lastName, String division) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.division = division;
		}
	}

	public static class Message {
		public String message1;
		public String message2;
		public String message3;

		public Message(String message1, String message2, String message3) {
			this.message1 = message1;
			this.message2 = message2;
			this.message3 = message3;
		}
	}

	public static class Mail {
		public String subject;
		public MailFont font;
		public Message message;

		public Mail(String subject, MailFont font, Message message) {
			this.subject = subject;
			this.font = font;
			this.message = message;
		}
	}

	public static class Email {
		public Employee employee;
		public Mail mail;

		public Email(Employee employee, Mail mail) {
			this.employee = employee;
			this.mail = mail;
		}
	}

	// tag::buildAndSendMail[]
    public void buildAndSendMail(MailMan m, Email email) {
        // Format the email address
        String mId = email.employee.firstName.charAt(0) + "." + email.employee.lastName.substring(0, 7) + "@"
            + email.employee.division.substring(0, 5) + ".compa.ny";
        // Format the message given the content type and raw message
        MailMessage mMessage = formatMessage(email.mail.font,
            email.mail.message.message1 + email.mail.message.message2 + email.mail.message.message3);
        // Send message
        m.send(mId, email.mail.subject, mMessage);
    }
    // end::buildAndSendMail[]

    @SuppressWarnings("unused")
    private MailMessage formatMessage(MailFont font, String string) {
        return null;
    }

    private class MailMan {

        @SuppressWarnings("unused")
        public void send(String mId, String subject, MailMessage mMessage) {}

    }

    private class MailFont {

    }

    private class MailMessage {

    }

}