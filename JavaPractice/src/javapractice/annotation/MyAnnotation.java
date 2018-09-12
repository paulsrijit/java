package javapractice.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	String antNm() default "DefaultAnnotationName";
	int antVal() default -1;
}

class TestClass {
	
	//@MyAnnotation(antNm="Name_00", antVal=100)
	@MyAnnotation
	public void myfuntion() {
		System.out.println("Hello from myfunction");
	}
	
	
}
