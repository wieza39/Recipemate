package pjwstk.receipemate.app.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class EmailConfig {
    @Value("${spring.mail.host}")
    private String host;
    @Value("${spring.mail.port}")
    private Integer port;
    @Value("${spring.mail.username}")
    private String username;
    @Value("${spring.mail.password}")
    private String password;
    @Value("${spring.mail.from}")
    private String from;

    @Override
    public String toString() {
        return "EmailConfiguration [host=" + host + ", port=" + port + ", username=" + username + ", password="
                + password + "]";
    }
}
