package ru.inno.course.playerService;

public class MightBeEmpty<T> {

    private T value;
    private boolean hasValue = false;

    public MightBeEmpty() {
    }

    public MightBeEmpty(T value) {
        this.value = value;
        this.hasValue = true;
    }

    public T getValue() {
        return value;
    }


    public static MightBeEmpty empty(){
        return new MightBeEmpty<>();
    }

    public boolean isHasValue() {
        return hasValue;
    }
}
