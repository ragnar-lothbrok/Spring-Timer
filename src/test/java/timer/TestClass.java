package timer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springs.test.ManagerI;

public class TestClass {

	public static void main(String[] args) {
	    
	    ApplicationContext ctx1 = new ClassPathXmlApplicationContext("context-springs.xml");
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"context-spring.xml"},ctx1);
		ManagerI manager = (ManagerI)ctx.getBean("managerI");
		manager.addData();
		
		manager.addData("added");
		
		manager.addData(2);
		
		ctx.getBean("com.springs.test.ManagerI#0");
		
		ctx.getBean("com.springs.test.ManagerI#1");
		
		System.out.println(">>>>>>>>"+ctx.getBeanNamesForType(ManagerI.class).toString());
		
		System.out.println(manager.getName());
		
		System.out.println(ctx.getBean("customBike1"));
		System.out.println(ctx.getBean("customBike2"));
		
		System.out.println("Calendar : "+ctx.getBean("calendar"));
		
		((ConfigurableApplicationContext)ctx).start();
		
		((ConfigurableApplicationContext)ctx).stop();
		
		((ConfigurableApplicationContext)ctx).refresh();
		
		((ConfigurableApplicationContext)ctx).close();
	}
	
}
