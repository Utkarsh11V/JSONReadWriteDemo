package com.infy;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JSONWriter {

    public static void main(String[] args) {
        JSONObject obj = new JSONObject();
        obj.put("name","utkarsh");
        obj.put("age",28);
        obj.put("company","infosys");

        JSONArray jarray = new JSONArray();
        jarray.add("Java");
        jarray.add("spring");
        jarray.add("hibernate");

        obj.put("skills",jarray);

        try(FileWriter file = new FileWriter("myJSON.json")){
                file.write(obj.toString());
                file.flush();
        }
        catch(IOException e){
                e.printStackTrace();
        }
        System.out.println("JSON file created");
        System.out.println(obj);

    }
}
