package org.practice.hackerrank.monthpreparation.week2;

public class DynamicArrayException extends Throwable {

    private final Exception exception;

    public DynamicArrayException(Exception ex) {
        this.exception = ex;
    }

    public Exception getException() {
        return exception;
    }
}
