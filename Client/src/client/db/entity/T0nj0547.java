package client.db.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import javax.validation.constraints.NotNull;

public class T0nj0547 {
    public T0nj0547() {
        super();
    }
    @JsonProperty("Bussrfno")
    @NotNull
    private String bussrfno;
    @JsonProperty("Bussnm")
    @NotNull
    private String bussnm;
    @JsonProperty("Costsid")
    @NotNull
    private String costsid;
    @JsonProperty("Costsidcomt")
    @NotNull
    private String costsidcomt;
    @JsonProperty("Regofc")
    @NotNull
    private String regofc;
    @JsonProperty("Regofccomt")
    @NotNull
    private String regofccomt;
    @JsonProperty("Busslocation")
    @NotNull
    private String busslocation;
    @JsonProperty("T0nj0547d")
    private List<T0nj0547d> t0nj0547d;

    public void setBussrfno(String bussrfno) {
        this.bussrfno = bussrfno;
    }

    public String getBussrfno() {
        return bussrfno;
    }

    public void setBussnm(String bussnm) {
        this.bussnm = bussnm;
    }

    public String getBussnm() {
        return bussnm;
    }

    public void setCostsid(String costsid) {
        this.costsid = costsid;
    }

    public String getCostsid() {
        return costsid;
    }

    public void setCostsidcomt(String costsidcomt) {
        this.costsidcomt = costsidcomt;
    }

    public String getCostsidcomt() {
        return costsidcomt;
    }

    public void setRegofc(String regofc) {
        this.regofc = regofc;
    }

    public String getRegofc() {
        return regofc;
    }

    public void setRegofccomt(String regofccomt) {
        this.regofccomt = regofccomt;
    }

    public String getRegofccomt() {
        return regofccomt;
    }

    public void setBusslocation(String busslocation) {
        this.busslocation = busslocation;
    }

    public String getBusslocation() {
        return busslocation;
    }

    public void setT0nj0547d(List<T0nj0547d> t0nj0547d) {
        this.t0nj0547d = t0nj0547d;
    }

    public List<T0nj0547d> getT0nj0547d() {
        return t0nj0547d;
    }
}
