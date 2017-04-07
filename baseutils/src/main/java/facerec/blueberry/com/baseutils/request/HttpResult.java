package facerec.blueberry.com.baseutils.request;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liukun on 16/3/5.
 */
public class HttpResult<T> {

    // code 为返回的状态码, message 为返回的消息, 演示的没有这两个字段，考虑到真实的环境中基本包含就在这里写定值
    private int code = 0;
    private String msg = "";

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    //用来模仿Data
    @SerializedName(value = "resp", alternate = {"subjects"})
    private T resp;


    public T getResp() {
        return resp;
    }

    public void setResp(T resp) {
        this.resp = resp;
    }
    
}
