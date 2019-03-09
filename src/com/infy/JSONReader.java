package com.infy;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class JSONReader {
        public static void main(String[] args){
            JSONParser parser = new JSONParser();
            try {
                //JSON object Parsing
                System.out.println("Parsing JSON File...");
                Object obj = parser.parse(new FileReader("myJSON.json"));
                JSONObject jobj = (JSONObject) obj;
                String name = (String) jobj.get("name");
                String company = (String) jobj.get("company");
                long age = (long) jobj.get("age");
                System.out.println("Name : "+name);
                System.out.println("Company : "+company);
                System.out.println("Age : "+age);
                System.out.println("chnages on local for testing...");
                
                //JSON Array parsing
                JSONArray skills = (JSONArray) jobj.get("skills");
                /*
                for (Object skill: skills) {
                System.out.println(skill.toString());
                }
                */
                Iterator<String> itr = skills.iterator();
                while(itr.hasNext()){
                    System.out.println("skill : "+ itr.next());
                }

            }
            catch(FileNotFoundException e){ e.printStackTrace(); }
            catch(IOException e){ e.printStackTrace(); }
            catch(ParseException e){ e.printStackTrace(); }
            catch(Exception e){ e.printStackTrace(); }

        }
}
