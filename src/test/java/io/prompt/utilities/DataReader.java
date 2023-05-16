package io.prompt.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataReader {

            //1- Create the object of Properties
    private static Properties properties = new Properties();

    static{

        try {

            //2- We need to open the file in java memory: FileInputStream
            FileInputStream file = new FileInputStream("data.properties");

            //3- Load the properties object using FileInputStream object
            properties.load(file);

            //close the file
            file.close();


        } catch (IOException e) {
            System.out.println("File not found in the DataReader class.");
            e.printStackTrace();
        }

    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }
}