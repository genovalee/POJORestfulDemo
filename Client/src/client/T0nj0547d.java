package client;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class T0nj0547d {
    public T0nj0547d() {
        super();
    }
    @JsonProperty("Bussrfno")
    @NotNull
    private String bussrfno;
    @JsonProperty("Regofc")
    @NotNull
    private String regofc;
    @JsonProperty("It")
    @NotNull
    private String it;
    @JsonProperty("Salit")
    @NotNull
    private String salit;
    @JsonProperty("Salitcomt")
    @NotNull
    private String salitcomt;

    public void setBussrfno(String bussrfno) {
        this.bussrfno = bussrfno;
    }

    public String getBussrfno() {
        return bussrfno;
    }

    public void setRegofc(String regofc) {
        this.regofc = regofc;
    }

    public String getRegofc() {
        return regofc;
    }

    public void setIt(String it) {
        this.it = it;
    }

    public String getIt() {
        return it;
    }

    public void setSalit(String salit) {
        this.salit = salit;
    }

    public String getSalit() {
        return salit;
    }

    public void setSalitcomt(String salitcomt) {
        this.salitcomt = salitcomt;
    }

    public String getSalitcomt() {
        return salitcomt;
    }
}
