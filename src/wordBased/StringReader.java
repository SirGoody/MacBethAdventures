package wordBased;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringReader{

    public void main(String file) {
        try {
            FileReader fR = new FileReader(file);
            BufferedReader bR = new BufferedReader(fR);
            StringBuffer stringB = new StringBuffer();
            String line;
            while ((line = bR.readLine()) != null) {
                stringB.append(line);
                stringB.append("\n");
            }
            fR.close();
            System.out.println(stringB.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}