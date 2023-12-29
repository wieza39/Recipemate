package pjwstk.receipemate.app.enums;

import lombok.Getter;

@Getter
public enum RecipeDifficulty {
    EASY("Łatwy"),
    MEDIUM("Średni"),
    HARD("Trudny");

    private final String type;

    RecipeDifficulty(String type) {
        this.type = type;
    }
}
