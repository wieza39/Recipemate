package pjwstk.receipemate.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pjwstk.receipemate.app.mailfactory.ShoppingListMailFactory;
import pjwstk.receipemate.app.model.Mail;
import pjwstk.receipemate.app.request.EmailRequest;
import pjwstk.receipemate.app.sender.EmailSender;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/email")
public class EmailController {
    private final EmailSender emailSender;
    private final ShoppingListMailFactory shoppingListMailFactory;

    public EmailController(
            EmailSender emailSender,
            ShoppingListMailFactory shoppingListMailFactory
    ) {
        this.emailSender = emailSender;
        this.shoppingListMailFactory = shoppingListMailFactory;
    }

    @PostMapping("send-recipe-list")
    public ResponseEntity.BodyBuilder send(@RequestBody EmailRequest emailRequest) {
        Mail mail = this.shoppingListMailFactory.make(emailRequest);
        this.emailSender.send(mail);

        return ResponseEntity.status(200);
    }
}
