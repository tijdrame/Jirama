package com.boa.api.request;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * PayementRequest
 */
@XmlRootElement
public class PayementRequest {

    private String billerCode, billNum, cashingRef, paymentDate, phoneNumber, langue;
    private String  deviceId, customerAccount, billRefTrx, description, channelType;

    public String getBillerCode() {
        return this.billerCode;
    }

    public void setBillerCode(String billerCode) {
        this.billerCode = billerCode;
    }

    public String getBillNum() {
        return this.billNum;
    }

    public void setBillNum(String billNum) {
        this.billNum = billNum;
    }

    public String getCashingRef() {
        return this.cashingRef;
    }

    public void setCashingRef(String cashingRef) {
        this.cashingRef = cashingRef;
    }

    public String getPaymentDate() {
        return this.paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getCustomerAccount() {
        return this.customerAccount;
    }

    public void setCustomerAccount(String customerAccount) {
        this.customerAccount = customerAccount;
    }

    public String getBillRefTrx() {
        return this.billRefTrx;
    }

    public void setBillRefTrx(String billRefTrx) {
        this.billRefTrx = billRefTrx;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLangue() {
        return this.langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public String getChannelType() {
        return this.channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    @Override
    public String toString() {
        return "{" +
            " billerCode='" + billerCode + "'" +
            ", billNum='" + billNum + "'" +
            ", cashingRef='" + cashingRef + "'" +
            ", paymentDate='" + paymentDate + "'" +
            ", phoneNumber='" + phoneNumber + "'" +
            ", deviceId='" + deviceId + "'" +
            ", customerAccount='" + customerAccount + "'" +
            ", billRefTrx='" + billRefTrx + "'" +
            ", description='" + description + "'" +
            ", channelType='" + channelType + "'" +
            ", langue='" + langue + "'" +
            "}";
    }

}