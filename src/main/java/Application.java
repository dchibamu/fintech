import com.chibamu.forex.service.GreetingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application
{
    public static void main(String[] args)
    {
        String[] applicationCtx =  new String[] {"application-context.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(applicationCtx);

        GreetingService greetingService = (GreetingService) ctx.getBean("Greeter");
        greetingService.greet("Dushbag heater shit...");
    }
}
