package com.easy4lazy.proj.dao;

import com.google.gson.JsonObject;

public class Utils {

    public static String returnErrorJsonResponse(String msg){
        JsonObject jo = new JsonObject();
        jo.addProperty("message", msg);
        jo.addProperty("status", false);
        return jo.toString();
    }
}

