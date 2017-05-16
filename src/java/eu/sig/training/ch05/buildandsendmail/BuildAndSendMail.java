package eu.sig.training.ch05.buildandsendmail;

public class BuildAndSendMail {
    // tag::buildAndSendMail[]
    public void buildAndSendMail(MailMan m, Recipient recipient, MailFont font, Message message) {
        // Format the email address
        String mId = recipient.firstName.charAt(0) + "." + recipient.lastName.substring(0, 7) + "@"
            + recipient.division.substring(0, 5) + ".compa.ny";
        // Format the message given the content type and raw message
        MailMessage mMessage = formatMessage(font,
            message.message);
        // Send message
        m.send(mId, message.subject, mMessage);
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
    
    private class Recipient{
    	private String firstName;
    	private String lastName;
    	private String division;
    	public Recipient(String firstName, String lastName, String division){
    		this.firstName = firstName;
    		this.lastName = lastName;
    		this.division = division;
    	}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getDivision() {
			return division;
		}
		public void setDivision(String division) {
			this.division = division;
		}
    }
    
    private class Message{
    	private String message;
    	private String subject;

    	public Message(String subject, String message1, String message2, String message3){
    		this.message = message1 + message2 + message3;
    	}
		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
    }
}