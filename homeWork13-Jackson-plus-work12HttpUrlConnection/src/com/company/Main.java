package com.company;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    private static final String LINK = "https://tut.by";

    public static void main(String[] args) {
        InputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {

            // Otkryvaem soedinenie
            URL url = new URL(LINK);
            HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();

            // Poluchaem kod otveta ot saita ili servera
            int responseCode = httpURLConnection.getResponseCode();

            //Proveriaem uspeshnoe li podkluchenie, t.e. proverka na oshibki
            if ((responseCode == HttpURLConnection.HTTP_OK)){
                inputStream = httpURLConnection.getInputStream();

                File file = new File("E:\\test\\ex.html");
                outputStream = new FileOutputStream(file);
                int byteRead = -1;      // kolichestvo prochitannych bait za odno chtenie
                byte[] buffer = new byte[1024]; // to, chto skachivaem t.e. poleznaja informacija
                while ((byteRead = inputStream.read(buffer)) != -1){
                    outputStream.write(buffer, 0, byteRead);        // zapisyvaem v fail baity ot 0 do byteRead iz massiva buffer
                }
            }
            else {
                System.out.println(responseCode + "responseCode");
            }

        } catch (Exception ex) {
            System.out.println("Oshibka " + ex.toString());
        }
        finally {

                try {
                    if(inputStream != null) {
                        inputStream.close();
                    }
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } catch (IOException e) {
                    System.out.println("Oshibka pri zakrytii strima" + e.toString());

            }
        }



    }
}
