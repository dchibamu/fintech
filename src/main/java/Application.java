import com.chibamu.forex.service.TransactionService;
import com.chibamu.forex.service.TransactionServiceImpl;
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

        TransactionService transactionService = (TransactionService) ctx.getBean("transactionService");
        TransactionService transactionService1 = TransactionServiceImpl.newInstance();
        Log.debug(transactionService1.getTransactionDetails().toString());
    }
}
