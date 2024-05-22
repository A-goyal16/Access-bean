import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "(default package)")
public class ConfigClass 
{
	@Bean
	public Student s1()
	{
		return new Student(1,"Ayushi","development");
	}
	
	@Bean
	public Student s2()
	{
		return new Student(2, "Harshitha", "testing");
	}
	
	@Bean
	public Student s3()
	{
		return new Student(3, "sahana", "development");
	}
	@Bean
	public Student s4()
	{
		return new Student(4, "sravani", "testing");
	}
}
