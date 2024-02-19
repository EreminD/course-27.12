package ru.inno.course.playerService;

public class MightBeEmptyInt {

    private int value;
    private boolean hasValue = false;

    public MightBeEmptyInt() {
    }

    public MightBeEmptyInt(int value) {
        this.value = value;
        this.hasValue = true;
    }

    public int getValue() {
        return value;
    }

    public boolean hasValue() {
        return hasValue;
    }

    public void setValue(int value) {
        this.value = value;
        this.hasValue = true;
    }
}
