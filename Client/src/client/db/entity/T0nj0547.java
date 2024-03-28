package client.db.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import javax.validation.constraints.NotNull;

public class T0nj0547 {
    public T0nj0547() {
        super();
    }
    @JsonProperty("President_No")
    private String bussrfno;
    @JsonProperty("Business_Name")
    private String bussnm;
    @JsonProperty("Business_Current_Status")
    private String costsid;
    @JsonProperty("Business_Current_Status_Desc")
    private String costsidcomt;
    @JsonProperty("Business_Organization_Type_Desc")
    private String orgnTyNm;
    @JsonProperty("Agency")
    private String regofc;
    @JsonProperty("Agency_Desc")
    private String regofccomt;
    @JsonProperty("Business_Address")
    private String busslocation;
    @JsonProperty("Business_Item_Old")
    private List<T0nj0547d> businessItemOld;

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

    public void setOrgnTyNm(String orgnTyNm) {
        this.orgnTyNm = orgnTyNm;
    }

    public String getOrgnTyNm() {
        return orgnTyNm;
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

    public List<T0nj0547d> getBusinessItemOld() {
        return businessItemOld;
    }

    public void setBusinessItemOld(List<T0nj0547d> businessItemOld) {
        this.businessItemOld = businessItemOld;
    }
}