package pjwstk.receipemate.app.sender;

import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.config.EmailConfig;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import pjwstk.receipemate.app.model.Mail;

@Service
public class EmailSender {
    private final EmailConfig emailConfig;

    public EmailSender(EmailConfig emailConfig) {
        this.emailConfig = emailConfig;
    }

    private JavaMailSender getJavaMailSender() {
        JavaMailSenderImpl mailSenderImpl = new JavaMailSenderImpl();
        mailSenderImpl.setHost(emailConfig.getHost());
        mailSenderImpl.setPort(emailConfig.getPort());
        mailSenderImpl.setUsername(emailConfig.getUsername());
        mailSenderImpl.setPassword(emailConfig.getPassword());
        return mailSenderImpl;
    }

    public void send(Mail mail) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(emailConfig.getFrom());
        message.setTo(mail.getTo());
        message.setSubject(mail.getSubject());
        message.setText(mail.getText());

        getJavaMailSender().send(message);
    }
}
