package xyz.mxue.query.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mxuexxmy
 * @ClassName QueryNotSub
 * @Description TODO
 * @Date 11/22/2020 1:15 AM
 * @Version 1.0
 **/
public class QueryNotSub {
    public List<String> getNotSubName(List<String> sub, List<String> totalNames) {
        List<String> notSubName = new ArrayList<>();
        for(String str: totalNames)
        {
            if(!sub.contains(str))
            {
                notSubName.add(str);
            }
        }
        return notSubName;
    }
}
