package org.example.exception;

public class RemoveElementArrayIsNull extends RuntimeException{
    public RemoveElementArrayIsNull() {
        super("removeElement array cannot be null");
    }
}
