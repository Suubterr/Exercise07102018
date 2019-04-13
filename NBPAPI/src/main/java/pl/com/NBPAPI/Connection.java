package pl.com.NBPAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Connection {

    private BufferedReader br;
    private StringBuilder rawData = new StringBuilder();

    public Connection(URL url) throws IOException {
        URLConnection con = url.openConnection();
        br = new BufferedReader(new InputStreamReader(con.getInputStream()));
        setRawData(br);
    }

    public String getData() {
        return rawData.toString();
    }

    private void setRawData(BufferedReader data) throws IOException {
        while(data.readLine()!=null) {
            rawData.append(data.readLine());
        }
    }
}
