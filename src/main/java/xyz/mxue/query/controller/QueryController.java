package xyz.mxue.query.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.mxue.query.util.QueryNotSub;
import xyz.mxue.query.util.ReadFileName;
import xyz.mxue.query.util.RemoveFileType;
import xyz.mxue.query.util.TotalPerson;

import java.util.List;

/**
 * @author mxuexxmy
 * @ClassName QueryController
 * @Description TODO
 * @Date 11/22/2020 12:19 AM
 * @Version 1.0
 **/
@Controller
@RequestMapping
public class QueryController {

    @GetMapping
    public String query(ModelMap map) {
        List<String> fileName = ReadFileName.getFileName("E://University//大四-上//人口普查");
        map.put("names", RemoveFileType.getName(fileName));
        map.put("namesNumber", fileName.size());
        List<String> totalName = TotalPerson.getName();
        QueryNotSub queryNotSub = new QueryNotSub();
        List<String> notSub = queryNotSub.getNotSubName( RemoveFileType.getName(fileName), totalName);
        map.put("notSubName", notSub);
        map.put("notSubNameNumber", notSub.size());
        return "index";
    }

}
