package com.company.xml.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;

/**
 * Created by Home911 on 26.06.2017.
 */
public class ParsJsonJackson {

    public static void main(String[] args) {
        Root root = toJavaObject("E:\\test\\test.json");

        toJSON(root);
    }

    public static Root toJavaObject(String s) {
        Root root = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            root = mapper.readValue(new File("E:\\test\\test.json"), Root.class);
        } catch (Exception e) {
            System.out.println("Exception " + e.toString());
        }
        return root;
    }

    public static void toJSON(Root root) {
        try (FileWriter writer = new FileWriter("result.json", false)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(root, writer);
        } catch (Exception e) {
            System.out.println("Exception" + e.toString());
        }
    }
}
