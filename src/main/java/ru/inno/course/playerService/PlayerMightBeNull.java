package ru.inno.course.playerService;

public class PlayerMightBeNull {
    private Player value;
    private boolean hasValue = false;

    public PlayerMightBeNull() {
    }

    public PlayerMightBeNull(Player value) {
        this.value = value;
        this.hasValue = true;
    }

    public Player getValue() {
        return value;
    }

    public boolean hasValue() {
        return hasValue;
    }

    public void setValue(Player value) {
        this.value = value;
    }
}
