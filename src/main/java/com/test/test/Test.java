package com.test.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.test.test.bean.B;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonMethod;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;

import java.util.Map;

import static com.test.test.ParseXmlUtil.xml2Json;

public class Test {
    public static void main(String[] args) throws Exception {
        // 获取一个xml文件
        String textFromFile = MyXmlUtil.XmlToString();
        //将xml解析为Map
        Map resultMap = ParseXmlUtil.xml2map(textFromFile);
        //将xml解析为Json
        String resultJson = xml2Json(textFromFile);
        System.out.println("-------------------------json----------------------------------");
        System.out.println(resultJson);


        System.out.println("---------------解析---------------------");
        JSONObject object = JSONObject.parseObject(resultJson);
        String pretty = JSON.toJSONString(object, SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue,
                SerializerFeature.WriteDateUseDateFormat);
        System.out.println(pretty);


        B o = (B) toObject(pretty, B.class);


        System.out.println(o.toString());

        System.out.println(o.getBODY().getCURRENT_PAGE().getCURRENT_PAGE());
        System.out.println(o.getBODY().getCUSTINFOLIST().getCUSTINFO().get(0).getCUST_TYPE().getCUST_TYPE());
        System.out.println(o.getBODY().getCUSTINFOLIST().getCUSTINFO().get(1).getCUST_TYPE().getCUST_TYPE());


    }

    public static Object toObject(String jsonString, Class cls) throws Exception {
        ObjectMapper mapper = new ObjectMapper().setVisibility(JsonMethod.FIELD, JsonAutoDetect.Visibility.ANY);
        mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return mapper.readValue(jsonString, cls);
    }


}



