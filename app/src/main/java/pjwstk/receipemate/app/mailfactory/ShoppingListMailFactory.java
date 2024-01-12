package pjwstk.receipemate.app.mailfactory;

import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.model.Mail;
import pjwstk.receipemate.app.request.EmailRequest;

@Service
public class ShoppingListMailFactory implements MailFactory {
    @Override
    public Mail make(EmailRequest emailRequest) {
        Mail mail = new Mail();
        mail.setTo(emailRequest.getTo());
        mail.setSubject("Twoja Lista Zakupów Gotowa do Działania!");
        mail.setText(emailRequest.getText());

        return mail;
    }
}
