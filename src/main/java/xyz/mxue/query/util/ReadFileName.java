package xyz.mxue.query.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.util.ResourceUtils.getFile;

/**
 * @author mxuexxmy
 * @ClassName ReadFileName
 * @Description TODO
 * @Date 11/22/2020 12:36 AM
 * @Version 1.0
 **/
public class ReadFileName {

    public static List<String> getFileName(String filePath) {
        File file = new File(filePath);
        File[] array = file.listFiles();
        List<String> fileName = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
                fileName.add(array[i].getName());
        }
      return fileName;
    }
}
