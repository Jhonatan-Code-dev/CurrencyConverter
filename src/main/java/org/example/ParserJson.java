package org.example;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ParserJson {

    public double obtenerResultado(String json) {
        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
        return jsonObject.get("conversion_result").getAsDouble();
    }
}