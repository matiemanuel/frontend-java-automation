package com.framework.exceptions;

public class InvalidBrowserException extends Exception {

    public InvalidBrowserException() {
        super("Invalid or null browser");
    }
}
