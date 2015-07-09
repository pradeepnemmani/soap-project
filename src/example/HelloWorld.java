package example;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by chandrav on 2/5/14.
 */

@WebService(endpointInterface = "example.IHelloWorld", serviceName = "IHelloWorld")
public class HelloWorld implements IHelloWorld {
      public String sayHelloWorldFrom(String from) {
           String result = "Hello, world, from " + from;
           System.out.println(result);
           return result;
      }
}
