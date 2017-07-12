package basepackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Home911 on 12.07.2017.
 */
public class Download implements DownloadFileListenner {

    public final String URLXML = "http://kiparo.ru/t/shop.xml";
    public final String URLJSON = "http://kiparo.ru/t/shop.json";

    @Override
    public void downloadFileXML() {
        InputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            URL url = new URL(URLXML);
            HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK){
              inputStream = httpURLConnection.getInputStream();
              File file = new File("shop.xml");
              outputStream = new FileOutputStream(file);
              int byteRead = -1;
              byte[] buffer = new byte[1024];
              while ((byteRead = inputStream.read(buffer)) != -1){
                  outputStream.write(buffer, 0, byteRead);
              }
            }
            else {
                System.out.println(responseCode + " - response code XML");
            }
        } catch (Exception e) {
            System.out.println("Ошибка " + e.toString());
        }
        finally {
            try {
                if (inputStream != null){
                    inputStream.close();
                }
                if (outputStream != null){
                    outputStream.close();
                }
            } catch (IOException e){
                System.out.println("Ошибка при закрытии стрима XML " + e.toString());
            }
        }


    }

    @Override
    public void downloadFileJSON() {
        InputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            URL url = new URL(URLJSON);
            HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK){
                inputStream = httpURLConnection.getInputStream();
                File file = new File("shop.json");
                outputStream = new FileOutputStream(file);
                int byteRead = -1;
                byte[] buffer = new byte[1024];
                while ((byteRead = inputStream.read(buffer)) != -1){
                    outputStream.write(buffer, 0, byteRead);
                }
            }
            else {
                System.out.println(responseCode + " - response code JSON");
            }
        } catch (Exception e) {
            System.out.println("Ошибка " + e.toString());
        }
        finally {
            try {
                if (inputStream != null){
                    inputStream.close();
                }
                if (outputStream != null){
                    outputStream.close();
                }
            } catch (IOException e){
                System.out.println("Ошибка при закрытии стрима JSON " + e.toString());
            }
        }

    }
}
