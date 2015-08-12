package timer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springs.test.ManagerI;

public class TestClass {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context-spring.xml");
		ManagerI manager = (ManagerI)ctx.getBean("managerI");
		manager.addData();
		
		manager.addData("added");
		
		manager.addData(2);
		
		System.out.println(manager.getName());
	}
	
}
