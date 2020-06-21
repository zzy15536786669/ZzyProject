package day04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OSWriter {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("b.txt",true);
        OutputStreamWriter osw = new OutputStreamWriter(fos);

        FileInputStream fis = new FileInputStream("a.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        int chs = -1;
        while ((chs=isr.read())!=-1){
            osw.write(chs);
        }
        System.out.println("复制成功");
        isr.close();

        osw.close();
    }
}
