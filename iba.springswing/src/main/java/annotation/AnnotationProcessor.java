package annotation;

import button.ChangeColorButtonOne;

public class AnnotationProcessor {

	public static void main(String[] args) {
		inspectClass(ChangeColorButtonOne.class);
	}
	
	static void inspectClass(Class<?> someClass) {
		if (someClass.getAnnotation(UIAnnotation.class) != null) {
			UIAnnotation ann = someClass.getAnnotation(UIAnnotation.class);
			System.out.println(ann.message());
		}
	}

}
