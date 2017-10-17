import java.io.FileInputStream;
import  java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;




public class ListeExtension {

    public static void main(String[] args) {
        try {
            File inputFile = new File("Text1.txt");
            File inputFile2 = new File("Text2.txt");
            File inputFile3 = new File("Text3.txt");

            File outputFile = new File("TextOutput.txt");

            FileInputStream fis = new FileInputStream(inputFile);
            FileInputStream fis2 = new FileInputStream(inputFile2);
            FileInputStream fis3 = new FileInputStream(inputFile3);

            FileOutputStream fos = new FileOutputStream(outputFile);
            int c;
            int b;
            int a;

            while ((c = fis.read()) != -1)
            {
                fos.write(c);
            }

            while ((b = fis2.read()) !=-1)


            { fos.write(b);
            }


            while ((a = fis3.read()) !=-1)
            {
                fos.write(a);
            }


            fis.close();
            fis2.close();
            fis3.close();
            fos.close();
        } catch (FileNotFoundException e) {
            System.err.println("FileStreamsTest: " + e);
        } catch (IOException e) {
            System.err.println("FileStreamsTest: " + e);
        }
    }

}
