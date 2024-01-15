package pjwstk.receipemate.app.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailRequest {
    @Pattern(
            regexp = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$",
            message = "Email is not valid!"
    )
    private String to;

    @NotEmpty(message = "Text cannot be empty!")
    private String message;
}
