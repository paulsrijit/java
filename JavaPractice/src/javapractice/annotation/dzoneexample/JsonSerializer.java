package javapractice.annotation.dzoneexample;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import static java.util.stream.Collectors.joining;

public class JsonSerializer {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Car myCar = new Car("Suzuki", "Maruti 800", "2018");
		String jsonString = new JsonSerializer().serialize(myCar);
		System.out.println(myCar.toString());
		System.out.println(jsonString);
	}
	
	public String serialize(Object object) throws IllegalArgumentException, IllegalAccessException{
		String jsonString = null;
		Class<?> classOfTheObject = object.getClass();
		Map<String, String> jsonElements = new HashMap<>();
		
		for(Field field : classOfTheObject.getDeclaredFields()) {
			field.setAccessible(true);
			if (field.isAnnotationPresent(JsonField.class)) {
				jsonElements.put(getSerializedKey(field), (String)field.get(object));
			}
		}
		
		if (!jsonElements.isEmpty()) {
			jsonString = toJsonString(jsonElements);
		}
		
		return jsonString;
	}

	private String toJsonString(Map<String, String> jsonMap) {

		String elementsString = jsonMap.entrySet().stream()
				.map(entry -> "\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"").collect(joining(","));
		return "{" + elementsString + "}";
	}

	private String getSerializedKey(Field field) {
		String annotationValue = field.getAnnotation(JsonField.class).value();
		if (annotationValue.isEmpty()) {
			return field.getName();
		}
		return annotationValue;
	}

}
