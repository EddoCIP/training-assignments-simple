package eu.sig.training.ch05.buildandsendmail;

public class BuildAndSendMail {
    public static class Mail {
		public String subject;
		public MailFont font;
		public Text text;

		public Mail(String subject, MailFont font, Text text) {
			this.subject = subject;
			this.font = font;
			this.text = text;
		}
	}

	// tag::buildAndSendMail[]
    public void buildAndSendMail(MailMan m, Employee employee, Mail mail) {
        // Format the email address
        String mId = employee.firstName.charAt(0) + "." + employee.lastName.substring(0, 7) + "@"
            + employee.division.substring(0, 5) + ".compa.ny";
        // Format the message given the content type and raw message
        MailMessage mMessage = formatMessage(mail.font,
            mail.text.message1 + mail.text.message2 + mail.text.message3);
        // Send message
        m.send(mId, mail.subject, mMessage);
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