package start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import annotation.AnnotationProcessor;

public class StartUI {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("all-context.xml");
		AnnotationProcessor.main(args);
	}
}
