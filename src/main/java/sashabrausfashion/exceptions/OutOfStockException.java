package main.java.sashabrausfashion.exceptions;

public class OutOfStockException extends Exception {
    public OutOfStockException() {}
    public OutOfStockException(String message) {
        super(message);
    }
}
