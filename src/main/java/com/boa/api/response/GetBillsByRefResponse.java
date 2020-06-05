package com.boa.api.response;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * GetBillsByRefResponse
 */
@XmlRootElement
public class GetBillsByRefResponse extends GenericResponse{
    
    private List<ItemResp> billList;
    private ExceptionResponse exceptionResponse;

    public List<ItemResp> getBillList() {
        if(billList==null || billList.isEmpty()) billList = new ArrayList<>();
        return this.billList;
    }

    public void setBillList(List<ItemResp> billList) {
        this.billList = billList;
    }

    public ExceptionResponse getExceptionResponse() {
        return this.exceptionResponse;
    }

    public void setExceptionResponse(ExceptionResponse exceptionResponse) {
        this.exceptionResponse = exceptionResponse;
    }
    
}

