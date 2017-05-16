package eu.sig.training.ch05.buildandsendmail;

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

	// tag::buildAndSendMail[]
    public void buildAndSendMail(MailMan m, Employee employee, String subject,
        MailFont font, String message1, String message2, String message3) {
        // Format the email address
        String mId = employee.firstName.charAt(0) + "." + employee.lastName.substring(0, 7) + "@"
            + employee.division.substring(0, 5) + ".compa.ny";
        // Format the message given the content type and raw message
        MailMessage mMessage = formatMessage(font,
            message1 + message2 + message3);
        // Send message
        m.send(mId, subject, mMessage);
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