package com.example.app.http.response;

/**
 * Created by wanxin on 16/12/23.
 */

public class RedConsumeResponse {

    /**
     * fid : 8120161108161942229295630
     * create_time : 2016年11月8日 16点19分
     * amount : -10
     * order_id : 详情_211478593179169351257578
     */

    private String fid;
    private String create_time;
    private String amount;
    private String order_id;

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }
}
