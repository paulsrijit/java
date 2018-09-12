package javapractice.annotation;

import java.lang.reflect.Method;

public class AnnotationDemo2 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		TestClass obj = new TestClass();
		Class<?> clazz = obj.getClass();
		Method method = clazz.getMethod("myfuntion");
		MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
		System.out.println(annotation.antNm());
		System.out.println(annotation.antVal());
	}

}
