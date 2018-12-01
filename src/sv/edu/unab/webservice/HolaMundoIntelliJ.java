package sv.edu.unab.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class HolaMundoIntelliJ {

    @WebMethod(operationName = "hola")
    public String diHola(@WebParam(name = "nombre") String arg0){
        return "Hola " + arg0 + "!";
    }

    @WebMethod(operationName = "adios")
    public String diAdios(@WebParam(name = "nombre") String arg0){
        return "Adios " + arg0 + "!";
    }

}
