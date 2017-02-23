package IO;

import java.io.*;

/**
 * Created by hcb on 2017/2/23.
 */
public class FileOperate {

    private static InputStream is;
    private static OutputStream os;


    public static void writeBytesToFile(String filePath,String word) {
        String witeWord = new String(word);
        byte[] bytes = witeWord.getBytes();
        try{
            File myFile = new File(filePath);
            if (!myFile.exists()){
                myFile.createNewFile();
            }
            os = new FileOutputStream(myFile);
            os.write(bytes);
            os.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        String filePath = "D:\\TestFolder\\myTest.txt";
        writeBytesToFile(filePath,"helloWorld");
    }

}
