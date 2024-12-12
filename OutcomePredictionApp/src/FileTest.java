import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
public class FileTest {
    public static void main(String[] args) {
        File file=new File("./config/Introduction.txt");
        try {
            String content=FileUtils.readFileToString(file,"utf-8");
            System.out.println(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
