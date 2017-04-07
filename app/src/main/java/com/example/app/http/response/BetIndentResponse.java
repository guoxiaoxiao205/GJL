package com.example.app.http.response;

/**
 * Created by guoxiao on 16/12/15.
 */

public class BetIndentResponse {
    /**
     * amount : 220
     * order_id : 16112511SK000001201700
     * pre_handle_token : 1480043255135509847600
     */

    private String amount;
    private String order_id;
    private String pre_handle_token;

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

    public String getPre_handle_token() {
        return pre_handle_token;
    }

    public void setPre_handle_token(String pre_handle_token) {
        this.pre_handle_token = pre_handle_token;

    }

    @Override
    public String toString() {
        return "BetIndentResponse{" +
                "amount='" + amount + '\'' +
                ", order_id='" + order_id + '\'' +
                ", pre_handle_token='" + pre_handle_token + '\'' +
                '}';
    }
}
