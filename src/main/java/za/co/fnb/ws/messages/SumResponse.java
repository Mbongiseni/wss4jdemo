package za.co.fnb.ws.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SumResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class SumResponse {

    @XmlElement(name="sum")
    private int sum;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "SumResponse{" +
                "sum=" + sum +
                '}';
    }
}
