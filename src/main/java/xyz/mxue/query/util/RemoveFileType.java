package xyz.mxue.query.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mxuexxmy
 * @ClassName RemoveFileType
 * @Description TODO
 * @Date 11/22/2020 12:51 AM
 * @Version 1.0
 **/
public class RemoveFileType {
    public static List<String> getName(List<String> list) {
          List<String> name = new ArrayList<>();
          for (String str : list) {
              String str1 = "";
              for (int i = 0; i < str.length(); i++) {
                  if(str.charAt(i) != '.') {
                      str1 += str.charAt(i);
                  } else {
                      break;
                  }
              }
              name.add(str1);
          }
          return name;
    }
}
