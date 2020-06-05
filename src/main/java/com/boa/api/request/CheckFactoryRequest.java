package com.boa.api.request;

public class CheckFactoryRequest {

    private String vnumFact;
    private String refenca;
    private String telcli;
    private String billerCode;
    private String langue;
    private String channel;

    public String getVnumFact() {
        return vnumFact;
    }

    public void setVnumFact(String vnumFact) {
        this.vnumFact = vnumFact;
    }

    public String getRefenca() {
        return refenca;
    }

    public void setRefenca(String refenca) {
        this.refenca = refenca;
    }

    public String getTelcli() {
        return telcli;
    }

    public void setTelcli(String telcli) {
        this.telcli = telcli;
    }

    public String getBillerCode() {
        return this.billerCode;
    }

    public void setBillerCode(String billerCode) {
        this.billerCode = billerCode;
    }

    public String getLangue() {
        return this.langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "{" +
            " vnumFact='" + vnumFact + "'" +
            ", refenca='" + refenca + "'" +
            ", telcli='" + telcli + "'" +
            ", channel='" + channel + "'" +
            "}";
    }

}