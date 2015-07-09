package example;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by chandrav on 2/5/14.
 */

@WebService
public interface IHelloWorld {
    String sayHelloWorldFrom(@WebParam(name="from") String from);
}
