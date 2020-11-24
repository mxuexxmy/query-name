package xyz.mxue.query.util;

import cn.hutool.core.text.StrSpliter;

import java.util.List;

/**
 * @author mxuexxmy
 * @ClassName TotalPerson
 * @Description TODO
 * @Date 11/22/2020 1:02 AM
 * @Version 1.0
 **/
public class TotalPerson {
    private static  String str = "宋梓荣,张晓星,夏月月,熊文诚,赵龄,侯中荣,林丹,吴宇,田勇,晏传华,王艳梅,田民涌,杨定昌,张达斌,吴启立,匡思成,邓永平,韦顺园,龙兴,王恩琴,孔维兰,熊买艳,彭杨,石远文,马梦,徐润诏,耿思学,曹建华,周佳丽,郑远顺,余光玉,田旭东,周菊琴,耿瑶,吕荀薇,晏敏,谢宇佳,李生满,张斌,罗小春,许梅,张继,赵静,王昌欢,闫家权,罗洋洋";
    public static List<String> getName() {
        List<String> totalName = StrSpliter.split(str, ",", true,true);
        return totalName;
    }
}
