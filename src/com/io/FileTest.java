package com.io;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args)  {
        File file = new File("C:\\Users\\Abu Bakar\\Downloads\12th.pdf");
        try {
            if (file.createNewFile()) {
                System.out.println("File created" + file.getName());
            } else {
                System.out.println("file alreadyExist");
            }
        }catch (IOException ioException){
            System.out.println(" Exception Occurred");
        }
}}
