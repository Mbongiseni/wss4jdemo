package za.co.fnb.ws;

import za.co.fnb.ws.messages.SumRequest;
import za.co.fnb.ws.messages.SumResponse;

public class CalculatorImpl implements CalculatorFacade {

    @Override
    public SumResponse calculateSum(SumRequest request) {
        SumResponse sumResponse = new SumResponse();
        sumResponse.setSum(request.getNum1() + request.getNum2());
        return sumResponse;
    }
}
