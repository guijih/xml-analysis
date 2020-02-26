package com.test.test;


import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.dom4j.*;

import java.util.*;

/**
 * 解析xml的工具类
 * 1、将多层级xml解析为Map
 * 2、将多层级xml解析为Json
 *
 * @author lmb
 */
public class ParseXmlUtil {


    public static Logger logger = Logger.getLogger(ParseXmlUtil.class);

    public static void main(String[] args) {

        String textFromFile="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<ROOT>  \n" +
                "      <HEAD>  \n" +
                "            <ORIGIN_DOMAIN>kefuxitongbianma</ORIGIN_DOMAIN>  \n" +
                "            <HOME_DOMAIN>CUGCRM</HOME_DOMAIN>  \n" +
                "            <ACTION_CODE>1</ACTION_CODE>  \n" +
                "            <BUSI_CODE>QUERYCUST</BUSI_CODE>  \n" +
                "            <TRANS_ID>20160220160635123456</TRANS_ID>  \n" +
                "            <RET_CODE>0000</RET_CODE>  \n" +
                "            <RET_MSG>success</RET_MSG>  \n" +
                "      </HEAD>  \n" +
                "      <BODY>  \n" +
                "            <TOTAL_RECORDS>20</TOTAL_RECORDS>  \n" +
                "            <TOTAL_PAGE>10</TOTAL_PAGE>  \n" +
                "            <CURRENT_PAGE>1</CURRENT_PAGE>  \n" +
                "            <CUSTINFOLIST>  \n" +
                "                  <CUSTINFO>  \n" +
                "                        <CUST_TYPE>001</CUST_TYPE>  \n" +
                "                        <VIP_FLAG>true</VIP_FLAG>  \n" +
                "                  </CUSTINFO>  \n" +
                "                  <CUSTINFO>  \n" +
                "                        <CUST_TYPE>002</CUST_TYPE>  \n" +
                "                        <VIP_FLAG>false</VIP_FLAG>  \n" +
                "                  </CUSTINFO>  \n" +
                "                  <CUSTINFO>  \n" +
                "                        <CUST_TYPE>003</CUST_TYPE>  \n" +
                "                        <VIP_FLAG>false</VIP_FLAG>  \n" +
                "                  </CUSTINFO>  \n" +
                "            </CUSTINFOLIST>  \n" +
                "      </BODY>  \n" +
                "</ROOT>\n";
        Map resultMap = ParseXmlUtil.xml2map(textFromFile);


    }


    /**
     * 将xml格式响应报文解析为Json格式
     *
     * @param responseXmlTemp
     * @return
     */
    public static String xml2Json(String responseXmlTemp) {
        Document doc = null;
        try {
            doc = DocumentHelper.parseText(responseXmlTemp);
        } catch (DocumentException e) {
            logger.error("parse text error : " + e);
        }
        Element rootElement = doc.getRootElement();
        Map<String, Object> mapXml = new HashMap<String, Object>();
        element2Map(mapXml, rootElement);
        String jsonXml = JSONObject.fromObject(mapXml).toString();
        System.out.println("Json >>> " + jsonXml);
        return jsonXml;
    }

    /**
     * 将xml格式响应报文解析为Map格式
     *
     * @param responseXmlTemp
     * @param
     * @return
     * @throws DocumentException
     */
    public static Map<String, Object> xml2map(String responseXmlTemp) {
        Document doc = null;
        try {
            doc = DocumentHelper.parseText(responseXmlTemp);
        } catch (DocumentException e) {
            logger.error("parse text error : " + e);
        }
        Element rootElement = doc.getRootElement();
        Map<String, Object> mapXml = new HashMap<String, Object>();
        element2Map(mapXml, rootElement);
        System.out.println("Map >>> " + mapXml);
        return mapXml;
    }

    /**
     * 使用递归调用将多层级xml转为map
     *
     * @param map
     * @param rootElement
     */
    public static void element2Map(Map<String, Object> map, Element rootElement) {

        //获得当前节点的子节点
        List<Element> elements = rootElement.elements();
        if (elements.size() == 0) {
            //没有子节点说明当前节点是叶子节点，直接取值
            map.put(rootElement.getName(), rootElement.getText());
        } else if (elements.size() == 1) {
            //只有一个子节点说明不用考虑list的情况，继续递归
            Map<String, Object> tempMap = new HashMap<String, Object>();
            element2Map(tempMap, elements.get(0));
            map.put(rootElement.getName(), tempMap);
        } else {
            //多个子节点的话就要考虑list的情况了，特别是当多个子节点有名称相同的字段时
            Map<String, Object> tempMap = new HashMap<String, Object>();
            for (Element element : elements) {
                tempMap.put(element.getName(), null);
            }
            Set<String> keySet = tempMap.keySet();
            for (String string : keySet) {
                Namespace namespace = elements.get(0).getNamespace();
                List<Element> sameElements = rootElement.elements(new QName(string, namespace));
                //如果同名的数目大于1则表示要构建list
                if (sameElements.size() > 1) {
                    List<Map> list = new ArrayList<Map>();
                    for (Element element : sameElements) {
                        Map<String, Object> sameTempMap = new HashMap<String, Object>();
                        element2Map(sameTempMap, element);
                        list.add(sameTempMap);
                    }
                    map.put(string, list);
                } else {
                    //同名的数量不大于1直接递归
                    Map<String, Object> sameTempMap = new HashMap<String, Object>();
                    element2Map(sameTempMap, sameElements.get(0));
                    map.put(string, sameTempMap);
                }
            }
        }
    }
}