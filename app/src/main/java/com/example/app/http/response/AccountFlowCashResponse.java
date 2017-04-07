package com.example.app.http.response;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by wanxin on 16/12/2.
 */

public class AccountFlowCashResponse {
    /**
     * account_info : {"account_type_nm":"现金账户","account_type_id":1,"account_id":null,"user_id":null,"balancestr":"904","balance":904,"is_default_option":1,"status":1,"model_id":0,"use_priorty":1,"is_virtual":0,"is_withdrawal":1,"is_expense":1,"is_exchange":1,"unit":"元","is_direct":0,"img_url":"http://7xoiug.com1.z0.glb.clouddn.com/payment%2F%E4%BD%99%E9%A2%9D%E6%94%AF%E4%BB%98.png","withdraw_fee":0,"fill_sales":0,"pay_for_sales":0,"memo":null,"backup_1":"http://cashier.caiqr.cn/paymentAccount.html","backup_2":null,"backup_3":null,"backup_4":null}
     * cash_log : {"result_list":[{"title":"2016年12月01日","flows":[{"flow_id":"1480599795318022953478","operate_type_id":1006,"type_name":"购买红包","amount":"-50","memo":"[{\"title\":\"类型\",\"content\":\"购买红包\"},{\"title\":\"订单ID\",\"content\":\"31480599795195678\"},{\"title\":\"渠道\",\"content\":\"账户余额\"}]","handle_id":"31480599795195678","times":"21时43分","create_date":"2016年12月01日","create_time":"2016-12-01 21:43:15 +0800"}]}],"get_last_day":"2016-08-04"}
     */

    private AccountInfoBean account_info;
    private CashLogBean cash_log;

    public AccountInfoBean getAccount_info() {
        return account_info;
    }

    public void setAccount_info(AccountInfoBean account_info) {
        this.account_info = account_info;
    }

    public CashLogBean getCash_log() {
        return cash_log;
    }

    public void setCash_log(CashLogBean cash_log) {
        this.cash_log = cash_log;
    }

    public static class AccountInfoBean {
        /**
         * account_type_nm : 现金账户
         * account_type_id : 1
         * account_id : null
         * user_id : null
         * balancestr : 904
         * balance : 904
         * is_default_option : 1
         * status : 1
         * model_id : 0
         * use_priorty : 1
         * is_virtual : 0
         * is_withdrawal : 1
         * is_expense : 1
         * is_exchange : 1
         * unit : 元
         * is_direct : 0
         * img_url : http://7xoiug.com1.z0.glb.clouddn.com/payment%2F%E4%BD%99%E9%A2%9D%E6%94%AF%E4%BB%98.png
         * withdraw_fee : 0
         * fill_sales : 0
         * pay_for_sales : 0
         * memo : null
         * backup_1 : http://cashier.caiqr.cn/paymentAccount.html
         * backup_2 : null
         * backup_3 : null
         * backup_4 : null
         */

        private String account_type_nm;
        private int account_type_id;
        private Object account_id;
        private Object user_id;
        private String balancestr;
        private double balance;
        private int is_default_option;
        private int status;
        private int model_id;
        private int use_priorty;
        private int is_virtual;
        private int is_withdrawal;
        private int is_expense;
        private int is_exchange;
        private String unit;
        private int is_direct;
        private String img_url;
        private int withdraw_fee;
        private int fill_sales;
        private int pay_for_sales;
        private Object memo;
        private String backup_1;
        private Object backup_2;
        private Object backup_3;
        private Object backup_4;

        public String getAccount_type_nm() {
            return account_type_nm;
        }

        public void setAccount_type_nm(String account_type_nm) {
            this.account_type_nm = account_type_nm;
        }

        public int getAccount_type_id() {
            return account_type_id;
        }

        public void setAccount_type_id(int account_type_id) {
            this.account_type_id = account_type_id;
        }

        public Object getAccount_id() {
            return account_id;
        }

        public void setAccount_id(Object account_id) {
            this.account_id = account_id;
        }

        public Object getUser_id() {
            return user_id;
        }

        public void setUser_id(Object user_id) {
            this.user_id = user_id;
        }

        public String getBalancestr() {
            return balancestr;
        }

        public void setBalancestr(String balancestr) {
            this.balancestr = balancestr;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public int getIs_default_option() {
            return is_default_option;
        }

        public void setIs_default_option(int is_default_option) {
            this.is_default_option = is_default_option;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getModel_id() {
            return model_id;
        }

        public void setModel_id(int model_id) {
            this.model_id = model_id;
        }

        public int getUse_priorty() {
            return use_priorty;
        }

        public void setUse_priorty(int use_priorty) {
            this.use_priorty = use_priorty;
        }

        public int getIs_virtual() {
            return is_virtual;
        }

        public void setIs_virtual(int is_virtual) {
            this.is_virtual = is_virtual;
        }

        public int getIs_withdrawal() {
            return is_withdrawal;
        }

        public void setIs_withdrawal(int is_withdrawal) {
            this.is_withdrawal = is_withdrawal;
        }

        public int getIs_expense() {
            return is_expense;
        }

        public void setIs_expense(int is_expense) {
            this.is_expense = is_expense;
        }

        public int getIs_exchange() {
            return is_exchange;
        }

        public void setIs_exchange(int is_exchange) {
            this.is_exchange = is_exchange;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public int getIs_direct() {
            return is_direct;
        }

        public void setIs_direct(int is_direct) {
            this.is_direct = is_direct;
        }

        public String getImg_url() {
            return img_url;
        }

        public void setImg_url(String img_url) {
            this.img_url = img_url;
        }

        public int getWithdraw_fee() {
            return withdraw_fee;
        }

        public void setWithdraw_fee(int withdraw_fee) {
            this.withdraw_fee = withdraw_fee;
        }

        public int getFill_sales() {
            return fill_sales;
        }

        public void setFill_sales(int fill_sales) {
            this.fill_sales = fill_sales;
        }

        public int getPay_for_sales() {
            return pay_for_sales;
        }

        public void setPay_for_sales(int pay_for_sales) {
            this.pay_for_sales = pay_for_sales;
        }

        public Object getMemo() {
            return memo;
        }

        public void setMemo(Object memo) {
            this.memo = memo;
        }

        public String getBackup_1() {
            return backup_1;
        }

        public void setBackup_1(String backup_1) {
            this.backup_1 = backup_1;
        }

        public Object getBackup_2() {
            return backup_2;
        }

        public void setBackup_2(Object backup_2) {
            this.backup_2 = backup_2;
        }

        public Object getBackup_3() {
            return backup_3;
        }

        public void setBackup_3(Object backup_3) {
            this.backup_3 = backup_3;
        }

        public Object getBackup_4() {
            return backup_4;
        }

        public void setBackup_4(Object backup_4) {
            this.backup_4 = backup_4;
        }
    }

    public static class CashLogBean {
        /**
         * result_list : [{"title":"2016年12月01日","flows":[{"flow_id":"1480599795318022953478","operate_type_id":1006,"type_name":"购买红包","amount":"-50","memo":"[{\"title\":\"类型\",\"content\":\"购买红包\"},{\"title\":\"订单ID\",\"content\":\"31480599795195678\"},{\"title\":\"渠道\",\"content\":\"账户余额\"}]","handle_id":"31480599795195678","times":"21时43分","create_date":"2016年12月01日","create_time":"2016-12-01 21:43:15 +0800"}]}]
         * get_last_day : 2016-08-04
         */

        private String get_last_day;
        private List<ResultListBean> result_list;

        public String getGet_last_day() {
            return get_last_day;
        }

        public void setGet_last_day(String get_last_day) {
            this.get_last_day = get_last_day;
        }

        public List<ResultListBean> getResult_list() {
            return result_list;
        }

        public void setResult_list(List<ResultListBean> result_list) {
            this.result_list = result_list;
        }

        public static class ResultListBean {
            /**
             * title : 2016年12月01日
             * flows : [{"flow_id":"1480599795318022953478","operate_type_id":1006,"type_name":"购买红包","amount":"-50","memo":"[{\"title\":\"类型\",\"content\":\"购买红包\"},{\"title\":\"订单ID\",\"content\":\"31480599795195678\"},{\"title\":\"渠道\",\"content\":\"账户余额\"}]","handle_id":"31480599795195678","times":"21时43分","create_date":"2016年12月01日","create_time":"2016-12-01 21:43:15 +0800"}]
             */

            private String title;
            private List<FlowsBean> flows;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public List<FlowsBean> getFlows() {
                return flows;
            }

            public void setFlows(List<FlowsBean> flows) {
                this.flows = flows;
            }

            public static class FlowsBean implements Parcelable {
                /**
                 * flow_id : 1480599795318022953478
                 * operate_type_id : 1006
                 * type_name : 购买红包
                 * amount : -50
                 * memo : [{"title":"类型","content":"购买红包"},{"title":"订单ID","content":"31480599795195678"},{"title":"渠道","content":"账户余额"}]
                 * handle_id : 31480599795195678
                 * times : 21时43分
                 * create_date : 2016年12月01日
                 * create_time : 2016-12-01 21:43:15 +0800
                 */

                private int type;
                private String title;
                private String flow_id;
                private int operate_type_id;
                private String type_name;
                private String amount;
                private String memo;
                private String handle_id;
                private String times;
                private String create_date;
                private String create_time;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }


                public String getFlow_id() {
                    return flow_id;
                }

                public void setFlow_id(String flow_id) {
                    this.flow_id = flow_id;
                }

                public int getOperate_type_id() {
                    return operate_type_id;
                }

                public void setOperate_type_id(int operate_type_id) {
                    this.operate_type_id = operate_type_id;
                }

                public String getType_name() {
                    return type_name;
                }

                public void setType_name(String type_name) {
                    this.type_name = type_name;
                }

                public String getAmount() {
                    return amount;
                }

                public void setAmount(String amount) {
                    this.amount = amount;
                }

                public String getMemo() {
                    return memo;
                }

                public void setMemo(String memo) {
                    this.memo = memo;
                }

                public String getHandle_id() {
                    return handle_id;
                }

                public void setHandle_id(String handle_id) {
                    this.handle_id = handle_id;
                }

                public String getTimes() {
                    return times;
                }

                public void setTimes(String times) {
                    this.times = times;
                }

                public String getCreate_date() {
                    return create_date;
                }

                public void setCreate_date(String create_date) {
                    this.create_date = create_date;
                }

                public String getCreate_time() {
                    return create_time;
                }

                public void setCreate_time(String create_time) {
                    this.create_time = create_time;
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(Parcel dest, int flags) {
                    dest.writeInt(this.type);
                    dest.writeString(this.title);
                    dest.writeString(this.flow_id);
                    dest.writeInt(this.operate_type_id);
                    dest.writeString(this.type_name);
                    dest.writeString(this.amount);
                    dest.writeString(this.memo);
                    dest.writeString(this.handle_id);
                    dest.writeString(this.times);
                    dest.writeString(this.create_date);
                    dest.writeString(this.create_time);
                }

                public FlowsBean() {
                }

                protected FlowsBean(Parcel in) {
                    this.type = in.readInt();
                    this.title = in.readString();
                    this.flow_id = in.readString();
                    this.operate_type_id = in.readInt();
                    this.type_name = in.readString();
                    this.amount = in.readString();
                    this.memo = in.readString();
                    this.handle_id = in.readString();
                    this.times = in.readString();
                    this.create_date = in.readString();
                    this.create_time = in.readString();
                }

                public static final Parcelable.Creator<FlowsBean> CREATOR = new Parcelable.Creator<FlowsBean>() {
                    @Override
                    public FlowsBean createFromParcel(Parcel source) {
                        return new FlowsBean(source);
                    }

                    @Override
                    public FlowsBean[] newArray(int size) {
                        return new FlowsBean[size];
                    }
                };
            }
        }
    }
}
