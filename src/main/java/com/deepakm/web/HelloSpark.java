package com.deepakm.web;

import org.json.simple.JSONObject;
import spark.Spark;

import java.util.HashMap;

public class HelloSpark {
    public static void main(String[] args) {
        Spark.get("/", (request, response) -> {
            System.out.println("received request from : " + request.ip());
            String jsonString = JSONObject.toJSONString(new HashMap() {{
                put("hello", "world");
            }});
            return jsonString;
        });
    }
}
