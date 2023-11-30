package pjwstk.receipemate.app.enums;

public enum RecipeDifficulty {
    EASY,
    MEDIUM,
    HARD;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
