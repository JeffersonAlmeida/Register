package com.hanzo.json;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.hanzo.register.json.model.Field;

public class FromJson {

	private static final String OBJECT_NAME = "fields";
	
	public List<Field> toFields(String jsonString){
		JsonParser jsonParser = new JsonParser();
        JsonObject jsonObject = (JsonObject) jsonParser.parse(jsonString);
        JsonArray jsonArray = jsonObject.getAsJsonArray(OBJECT_NAME);
        Gson gson = new Gson();
        Type listType = new TypeToken<List<Field>>(){}.getType();
        return gson.fromJson(jsonArray, listType);
	}
}
