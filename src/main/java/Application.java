import com.chibamu.forex.service.GreetingService;
import com.chibamu.forex.service.StockService;
import com.chibamu.forex.service.StockServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application
{

    private static Logger Log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args)
    {
        String[] applicationCtx =  new String[] {"application-context.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(applicationCtx);

        GreetingService greetingService = (GreetingService) ctx.getBean("Greeter");
        greetingService.greet("Dushbag heater shit...");

        StockService stockService = (StockService)ctx.getBean("ngodza");
        String stock = stockService.findLatestStock().stream().findFirst().orElse("");
        Log.debug(stock);
    }
}
