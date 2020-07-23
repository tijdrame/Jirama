package com.boa.api.response;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * CheckFactoryResponse
 */
@XmlRootElement
public class CheckFactoryResponse extends GenericResponse {

    private String billNum;    
    private String custumerRef;    
    private String billDate;    
    private Integer billAmount;    
    private String requierNumber;
    private String customerName;
    private String sessionNum;
    private Integer feeAmount;
    private ExceptionResponse exceptionResponse;

    

    public String getBillNum() {
        return this.billNum;
    }

    public void setBillNum(String billNum) {
        this.billNum = billNum;
    }

    public String getCustumerRef() {
        return this.custumerRef;
    }

    public void setCustumerRef(String custumerRef) {
        this.custumerRef = custumerRef;
    }

    public String getBillDate() {
        return this.billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public Integer getBillAmount() {
        return this.billAmount;
    }

    public void setBillAmount(Integer billAmount) {
        this.billAmount = billAmount;
    }

    public String getRequierNumber() {
        return this.requierNumber;
    }

    public void setRequierNumber(String requierNumber) {
        this.requierNumber = requierNumber;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getSessionNum() {
        return this.sessionNum;
    }

    public void setSessionNum(String sessionNum) {
        this.sessionNum = sessionNum;
    }

    public ExceptionResponse getExceptionResponse() {
        return this.exceptionResponse;
    }

    public void setExceptionResponse(ExceptionResponse exceptionResponse) {
        this.exceptionResponse = exceptionResponse;
    }

    public Integer getFeeAmount() {
        return this.feeAmount;
    }

    public void setFeeAmount(Integer feeAmount) {
        this.feeAmount = feeAmount;
    }

    @Override
    public String toString() {
        return "{" +
            " billNum='" + getBillNum() + "'" +
            ", custumerRef='" + getCustumerRef() + "'" +
            ", billDate='" + getBillDate() + "'" +
            ", billAmount='" + getBillAmount() + "'" +
            ", requierNumber='" + getRequierNumber() + "'" +
            ", customerName='" + getCustomerName() + "'" +
            ", sessionNum='" + getSessionNum() + "'" +
            ", feeAmount='" + getFeeAmount() + "'" +
            ", exceptionResponse='" + getExceptionResponse() + "'" +
            "}";
    }
   

}