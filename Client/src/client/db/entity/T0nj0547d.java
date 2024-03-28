package client.db.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class T0nj0547d {
    public T0nj0547d() {
        super();
    }
    @JsonProperty("Business_Seq_No")
    @NotNull
    private String it;
    @JsonProperty("Business_Item")
    @NotNull
    private String salit;
    @JsonProperty("Business_Item_Desc")
    @NotNull
    private String salitcomt;

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
