import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DriverClass 
{
	public static void main(String[] args) 
	{
		ApplicationContext ac=new AnnotationConfigApplicationContext(ConfigClass.class);
		
		System.out.println("----Bean1------");
		Student s=(Student) ac.getBean("s1");
		System.out.println(s);
		System.out.println();
		
		
		System.out.println("----Bean2------");
		Student s1=(Student) ac.getBean("s2");
		System.out.println(s1);
		System.out.println();
		
		System.out.println("----Bean3------");
		Student s2=(Student) ac.getBean("s3");
		System.out.println(s2);
		System.out.println();
		
		System.out.println("----Bean4------");
		Student s3=(Student) ac.getBean("s4");
		System.out.println(s3);
				
	}
}
