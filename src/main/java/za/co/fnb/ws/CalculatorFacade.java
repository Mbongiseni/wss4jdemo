package za.co.fnb.ws;

import za.co.fnb.ws.messages.SumRequest;
import za.co.fnb.ws.messages.SumResponse;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/*
 *
 * Marks Java class as an implementation of Webservice or Java interface as a webservice interface
 */
@WebService(name="CalculatorService")
public interface CalculatorFacade {
    @WebResult(name="sumResults")
    SumResponse calculateSum(@WebParam(name="sumRequest") SumRequest request);
}
