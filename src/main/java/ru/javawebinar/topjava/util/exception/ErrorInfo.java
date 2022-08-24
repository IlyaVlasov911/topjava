package ru.javawebinar.topjava.util.exception;

import java.util.List;

public class ErrorInfo {
    private final String url;
    private final ErrorType type;
    private final List<String> errors;

    public ErrorInfo(CharSequence url, ErrorType type, List<String> errors) {
        this.url = url.toString();
        this.type = type;
        this.errors = errors;
    }
}