package com.example.app.http.response;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanxin on 16/12/6.
 */

public class WithdrawRecordResponse {

    /**
     * result_list : [{"title":"2016年12月06日","flows":[{"order_id":"21481033927230978","ratify_status":0,"amount":"10","order_status":0,"times":"22时18分","create_date":"2016年12月06日","create_dates":"2016-12-06","create_time":"2016-12-06 22:18:47 +0800","fee_str":"该笔手续费由彩球承担","ratify_status_str":"审核中","ratify_status_group":[{"status":"0","is_true":"1","name":"申请提现"},{"status":"1","is_true":"1","name":"审核中"},{"status":"2","is_true":"0","name":"银行处理"},{"status":"3","is_true":"0","name":"已到账"}],"day_over":"预计一个工作日内到账","card_no":null,"bank_short_name":null}]}]
     * get_last_day : 2016-12-05
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
         * title : 2016年12月06日
         * flows : [{"order_id":"21481033927230978","ratify_status":0,"amount":"10","order_status":0,"times":"22时18分","create_date":"2016年12月06日","create_dates":"2016-12-06","create_time":"2016-12-06 22:18:47 +0800","fee_str":"该笔手续费由彩球承担","ratify_status_str":"审核中","ratify_status_group":[{"status":"0","is_true":"1","name":"申请提现"},{"status":"1","is_true":"1","name":"审核中"},{"status":"2","is_true":"0","name":"银行处理"},{"status":"3","is_true":"0","name":"已到账"}],"day_over":"预计一个工作日内到账","card_no":null,"bank_short_name":null}]
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
             * order_id : 21481033927230978
             * ratify_status : 0
             * amount : 10
             * order_status : 0
             * times : 22时18分
             * create_date : 2016年12月06日
             * create_dates : 2016-12-06
             * create_time : 2016-12-06 22:18:47 +0800
             * fee_str : 该笔手续费由彩球承担
             * ratify_status_str : 审核中
             * ratify_status_group : [{"status":"0","is_true":"1","name":"申请提现"},{"status":"1","is_true":"1","name":"审核中"},{"status":"2","is_true":"0","name":"银行处理"},{"status":"3","is_true":"0","name":"已到账"}]
             * day_over : 预计一个工作日内到账
             * card_no : null
             * bank_short_name : null
             */
            private String title;
            private int type;
            private String order_id;
            private int ratify_status;
            private String amount;
            private int order_status;
            private String times;
            private String create_date;
            private String create_dates;
            private String create_time;
            private String fee_str;
            private String ratify_status_str;
            private String day_over;
            private String card_no;
            private String bank_short_name;
            private List<RatifyStatusGroupBean> ratify_status_group;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getOrder_id() {
                return order_id;
            }

            public void setOrder_id(String order_id) {
                this.order_id = order_id;
            }

            public int getRatify_status() {
                return ratify_status;
            }

            public void setRatify_status(int ratify_status) {
                this.ratify_status = ratify_status;
            }

            public String getAmount() {
                return amount;
            }

            public void setAmount(String amount) {
                this.amount = amount;
            }

            public int getOrder_status() {
                return order_status;
            }

            public void setOrder_status(int order_status) {
                this.order_status = order_status;
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

            public String getCreate_dates() {
                return create_dates;
            }

            public void setCreate_dates(String create_dates) {
                this.create_dates = create_dates;
            }

            public String getCreate_time() {
                return create_time;
            }

            public void setCreate_time(String create_time) {
                this.create_time = create_time;
            }

            public String getFee_str() {
                return fee_str;
            }

            public void setFee_str(String fee_str) {
                this.fee_str = fee_str;
            }

            public String getRatify_status_str() {
                return ratify_status_str;
            }

            public void setRatify_status_str(String ratify_status_str) {
                this.ratify_status_str = ratify_status_str;
            }

            public String getDay_over() {
                return day_over;
            }

            public void setDay_over(String day_over) {
                this.day_over = day_over;
            }

            public String getCard_no() {
                return card_no;
            }

            public void setCard_no(String card_no) {
                this.card_no = card_no;
            }

            public String getBank_short_name() {
                return bank_short_name;
            }

            public void setBank_short_name(String bank_short_name) {
                this.bank_short_name = bank_short_name;
            }

            public List<RatifyStatusGroupBean> getRatify_status_group() {
                return ratify_status_group;
            }

            public void setRatify_status_group(List<RatifyStatusGroupBean> ratify_status_group) {
                this.ratify_status_group = ratify_status_group;
            }



            public static class RatifyStatusGroupBean implements Parcelable {
                /**
                 * status : 0
                 * is_true : 1
                 * name : 申请提现
                 */

                private String status;
                private String is_true;
                private String name;

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public String getIs_true() {
                    return is_true;
                }

                public void setIs_true(String is_true) {
                    this.is_true = is_true;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }


                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(Parcel dest, int flags) {
                    dest.writeString(this.status);
                    dest.writeString(this.is_true);
                    dest.writeString(this.name);
                }

                public RatifyStatusGroupBean() {
                }

                protected RatifyStatusGroupBean(Parcel in) {
                    this.status = in.readString();
                    this.is_true = in.readString();
                    this.name = in.readString();
                }

                public static final Creator<RatifyStatusGroupBean> CREATOR = new Creator<RatifyStatusGroupBean>() {
                    @Override
                    public RatifyStatusGroupBean createFromParcel(Parcel source) {
                        return new RatifyStatusGroupBean(source);
                    }

                    @Override
                    public RatifyStatusGroupBean[] newArray(int size) {
                        return new RatifyStatusGroupBean[size];
                    }
                };
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.title);
                dest.writeInt(this.type);
                dest.writeString(this.order_id);
                dest.writeInt(this.ratify_status);
                dest.writeString(this.amount);
                dest.writeInt(this.order_status);
                dest.writeString(this.times);
                dest.writeString(this.create_date);
                dest.writeString(this.create_dates);
                dest.writeString(this.create_time);
                dest.writeString(this.fee_str);
                dest.writeString(this.ratify_status_str);
                dest.writeString(this.day_over);
                dest.writeString(this.card_no);
                dest.writeString(this.bank_short_name);
                dest.writeList(this.ratify_status_group);
            }

            public FlowsBean() {
            }

            protected FlowsBean(Parcel in) {
                this.title = in.readString();
                this.type = in.readInt();
                this.order_id = in.readString();
                this.ratify_status = in.readInt();
                this.amount = in.readString();
                this.order_status = in.readInt();
                this.times = in.readString();
                this.create_date = in.readString();
                this.create_dates = in.readString();
                this.create_time = in.readString();
                this.fee_str = in.readString();
                this.ratify_status_str = in.readString();
                this.day_over = in.readString();
                this.card_no = in.readString();
                this.bank_short_name = in.readString();
                this.ratify_status_group = new ArrayList<RatifyStatusGroupBean>();
                in.readList(this.ratify_status_group, RatifyStatusGroupBean.class.getClassLoader());
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
