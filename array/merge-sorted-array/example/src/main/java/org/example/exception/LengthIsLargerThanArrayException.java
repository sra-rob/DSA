package org.example.exception;

public class LengthIsLargerThanArrayException extends  RuntimeException{
    public LengthIsLargerThanArrayException() {
        super("Length cannot be larger than the number of elements");
    }
}
