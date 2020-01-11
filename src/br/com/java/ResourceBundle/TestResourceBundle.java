package br.com.java.ResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestResourceBundle {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("en","US"));
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("good.morning"));

        rb = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));

        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("good.morning"));
    }
}
