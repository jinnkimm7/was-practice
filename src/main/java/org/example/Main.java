package org.example;

// GET /calcuate?operand1=11&operate=*operand2=2=55
public class Main {
    public static void main(String[] args) {
        new CustomWebApplicationServer(8080).start();
    }
}