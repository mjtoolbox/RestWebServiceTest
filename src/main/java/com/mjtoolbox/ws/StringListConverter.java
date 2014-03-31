package com.mjtoolbox.ws;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.ws.rs.ext.ParamConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class StringListConverter implements ParamConverter<List<String>> {

	Gson gson = new Gson();

	@Override
	public List<String> fromString(String value) {

		if (value == null) {
			return Collections.emptyList();
		}
		return Arrays.asList(value.split(","));
	}

	@Override
	public String toString(List<String> value) {
		final StringBuilder sb = new StringBuilder();
		boolean first = true;

		for (String city : value) {
			if (first) {
				first = false;
			} else {
				sb.append(",");
			}
			sb.append(city);
		}
		return sb.toString();
	}
	
	public String toJson(List<String> value)
	{
		return gson.toJson(value);
	}
	
	
	public  List<String> fromJson(String json) {		
		Type collectionType = new TypeToken<Collection<String>>(){}.getType();
		Collection<String> list = gson.fromJson(json, collectionType);
		return (List<String>)list;		
	}
}
