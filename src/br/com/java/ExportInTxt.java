package br.com.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ExportInTxt {
    public static void main(String[] args) {
        Path Location = Paths.get("C:/Users/Roger/Documents/teste.txt");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        byte[] textInByte = text.getBytes();
        try {
            Files.write(Location, textInByte);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
