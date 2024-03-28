package client.test;

import client.db.entity.T0nj0547;
import client.db.entity.T0nj0547d;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class TestObjectMapper {
    public static void main(String[] args) throws Exception {
        String jsonPayload =
            "{\"President_No\":\"01465625\",\"Business_Name\":\"金齡化學藥品儀器行\",\"Business_Current_Status\":\"01\",\"Business_Current_Status_Desc\":\"核准設立\",\"Business_Organization_Type_Desc\":\"獨資\",\"Agency\":\"376410000A\",\"Agency_Desc\":\"新北市政府經濟發展局\",\"Business_Address\":\"新北市新莊區中港路615巷15號3樓\",\"Business_Item_Old\":[{\"Business_Seq_No\":\"1\",\"Business_Item\":\"F107200\",\"Business_Item_Desc\":\"化學原料批發業\"},{\"Business_Seq_No\":\"2\",\"Business_Item\":\"F113030\",\"Business_Item_Desc\":\"精密儀器批發業\"}]}";

        ObjectMapper objectMapper = new ObjectMapper();
        T0nj0547 t0nj0547 = objectMapper.readValue(jsonPayload, T0nj0547.class);

        System.out.println("bussrfno: " + t0nj0547.getBussrfno());
        System.out.println("bussnm: " + t0nj0547.getBussnm());
        System.out.println("costsid: " + t0nj0547.getCostsid());
        System.out.println("costsidcomt: " + t0nj0547.getCostsidcomt());
        System.out.println("orgntynm: " + t0nj0547.getOrgnTyNm());
        System.out.println("regofc: " + t0nj0547.getRegofc());
        System.out.println("regofccomt: " + t0nj0547.getRegofccomt());
        System.out.println("busslocation: " + t0nj0547.getBusslocation());

        List<T0nj0547d> t0nj0547d = t0nj0547.getT0nj0547d();
        for (T0nj0547d item : t0nj0547d) {
            System.out.println("Business Item Seq No: " + item.getIt());
            System.out.println("Business Item: " + item.getSalit());
            System.out.println("Business Item Desc: " + item.getSalitcomt());
        }
    }
}
