package com.test.test;

import org.jdom.Document;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
/**
 * 读取一个xml文件返回string
 * @author lmb
 *
 */
public class MyXmlUtil {
    /**
     * 加载xml文件
     * @return Document
     */
    public static Document load(){
        Document document=null;
        String url="E://2.xml";
        try {
            SAXBuilder reader = new SAXBuilder();
            document=reader.build(new File(url));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return document;
    }

    /**
     * 将xml文件转换为String串
     * @return
     */
    public static String XmlToString(){
        Document document=null;
        document=load();

        Format format =Format.getPrettyFormat();
        //设置编码格式
        format.setEncoding("UTF-8");
        //输出对象
        StringWriter out=null;
        //输出字符串
        String sReturn ="";
        XMLOutputter outputter =new XMLOutputter();
        out=new StringWriter();
        try {
            outputter.output(document,out);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sReturn=out.toString();
        return sReturn;
    }
}