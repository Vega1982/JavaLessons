package Lesson19;

import com.google.common.io.Files;
import lombok.SneakyThrows;
import org.apache.commons.io.FileUtils;

import java.io.File;
import org.apache.commons.io.FilenameUtils;

public class Test {
    @SneakyThrows
    public static void main(String[] args) {
        String fileName = "D:\\test\\TesT2.txt";
        File myFile = new File(fileName);
//        myFile.createNewFile();
//        myFile.delete();
        String fileName1 = myFile.getName();
        FilenameUtils.getExtension(fileName1);
        Files.getFileExtension(fileName1);
//        myFile.mkdirs();
    }
}

class FileObject {

    String Filename;

    public FileObject(String filename) {
        Filename = filename;
    }
}
