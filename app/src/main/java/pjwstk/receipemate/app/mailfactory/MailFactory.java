package pjwstk.receipemate.app.mailfactory;

import pjwstk.receipemate.app.model.Mail;
import pjwstk.receipemate.app.request.EmailRequest;

public interface MailFactory {
    Mail make(EmailRequest emailRequest);
}
