package org.xtext.example.mydsl.generator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;

public class JsonFormatter {

	Gson gson;

	public JsonFormatter() {
		gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
	}

	public String formatString(String file) throws MalformedJsonException  {

		JsonParser parser = new JsonParser();
		JsonObject json = parser.parse(file).getAsJsonObject();
		
		String prettyJson = "";
		prettyJson = gson.toJson(json);
		
		return prettyJson;
	}

}
