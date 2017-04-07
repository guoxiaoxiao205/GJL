package com.example.app.http.response;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by wanxin on 16/12/5.
 */

public class WithdrawShowListResponse {

    /**
     * account_info : {"balance":90400,"balancestr":"904元","withdraw_cnt":0,"withdraw_message":"该笔手续费由彩球承担"}
     * withdraw_list : [{"user_id":"01445521690334915078","channel_type":3,"channel_infos":[{"real_name":"玩心","card_no":"6225880154047683","bank_short_name":"招商银行","issuer_bank_province":"广东省","issuer_bank_city":"深圳市","sub_bank_name":"招商银行","bank_img_url":"http://7vzspj.com2.z0.glb.qiniucdn.com/cardbin%2F%E6%8B%9B%E5%95%86.png","card_type":1,"status":"1","withdraw_memo":"预计一个工作日内到账","mobile":"15210813371"}],"bound_count":2,"create_time":"2016-06-23 10:36:30 +0800","create_user":"01445521690334915078","update_user":"01445521690334915078","update_time":"2016-11-25 15:59:01 +0800","unbound_count":1,"unbound_infos":[{"real_name":"万新","card_no":"NjIxMjI2MDIwMDAyMjA1MDA3MA==","bank_short_name":"工商银行","issuer_bank_province":"北京","issuer_bank_city":"北京","sub_bank_name":"工商银行","bank_img_url":"http://7vzspj.com2.z0.glb.qiniucdn.com/cardbin%2F%E5%B7%A5%E5%95%86.png","card_type":1,"status":"0","withdraw_memo":"预计一个工作日内到账","mobile":"13121143026"}],"real_name":"万新","card_code":"110224********5032"}]
     */

    private AccountInfoBean account_info;
    private List<WithdrawListBean> withdraw_list;

    public AccountInfoBean getAccount_info() {
        return account_info;
    }

    public void setAccount_info(AccountInfoBean account_info) {
        this.account_info = account_info;
    }

    public List<WithdrawListBean> getWithdraw_list() {
        return withdraw_list;
    }

    public void setWithdraw_list(List<WithdrawListBean> withdraw_list) {
        this.withdraw_list = withdraw_list;
    }

    public static class AccountInfoBean {
        /**
         * balance : 90400
         * balancestr : 904元
         * withdraw_cnt : 0
         * withdraw_message : 该笔手续费由彩球承担
         */

        private int balance;
        private String balancestr;
        private int withdraw_cnt;
        private String withdraw_message;

        public int getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }

        public String getBalancestr() {
            return balancestr;
        }

        public void setBalancestr(String balancestr) {
            this.balancestr = balancestr;
        }

        public int getWithdraw_cnt() {
            return withdraw_cnt;
        }

        public void setWithdraw_cnt(int withdraw_cnt) {
            this.withdraw_cnt = withdraw_cnt;
        }

        public String getWithdraw_message() {
            return withdraw_message;
        }

        public void setWithdraw_message(String withdraw_message) {
            this.withdraw_message = withdraw_message;
        }
    }

    public static class WithdrawListBean {
        /**
         * user_id : 01445521690334915078
         * channel_type : 3
         * channel_infos : [{"real_name":"玩心","card_no":"6225880154047683","bank_short_name":"招商银行","issuer_bank_province":"广东省","issuer_bank_city":"深圳市","sub_bank_name":"招商银行","bank_img_url":"http://7vzspj.com2.z0.glb.qiniucdn.com/cardbin%2F%E6%8B%9B%E5%95%86.png","card_type":1,"status":"1","withdraw_memo":"预计一个工作日内到账","mobile":"15210813371"}]
         * bound_count : 2
         * create_time : 2016-06-23 10:36:30 +0800
         * create_user : 01445521690334915078
         * update_user : 01445521690334915078
         * update_time : 2016-11-25 15:59:01 +0800
         * unbound_count : 1
         * unbound_infos : [{"real_name":"万新","card_no":"NjIxMjI2MDIwMDAyMjA1MDA3MA==","bank_short_name":"工商银行","issuer_bank_province":"北京","issuer_bank_city":"北京","sub_bank_name":"工商银行","bank_img_url":"http://7vzspj.com2.z0.glb.qiniucdn.com/cardbin%2F%E5%B7%A5%E5%95%86.png","card_type":1,"status":"0","withdraw_memo":"预计一个工作日内到账","mobile":"13121143026"}]
         * real_name : 万新
         * card_code : 110224********5032
         */

        private String user_id;
        private int channel_type;
        private int bound_count;
        private String create_time;
        private String create_user;
        private String update_user;
        private String update_time;
        private int unbound_count;
        private String real_name;
        private String card_code;
        private List<ChannelInfosBean> channel_infos;

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public int getChannel_type() {
            return channel_type;
        }

        public void setChannel_type(int channel_type) {
            this.channel_type = channel_type;
        }

        public int getBound_count() {
            return bound_count;
        }

        public void setBound_count(int bound_count) {
            this.bound_count = bound_count;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public String getCreate_user() {
            return create_user;
        }

        public void setCreate_user(String create_user) {
            this.create_user = create_user;
        }

        public String getUpdate_user() {
            return update_user;
        }

        public void setUpdate_user(String update_user) {
            this.update_user = update_user;
        }

        public String getUpdate_time() {
            return update_time;
        }

        public void setUpdate_time(String update_time) {
            this.update_time = update_time;
        }

        public int getUnbound_count() {
            return unbound_count;
        }

        public void setUnbound_count(int unbound_count) {
            this.unbound_count = unbound_count;
        }

        public String getReal_name() {
            return real_name;
        }

        public void setReal_name(String real_name) {
            this.real_name = real_name;
        }

        public String getCard_code() {
            return card_code;
        }

        public void setCard_code(String card_code) {
            this.card_code = card_code;
        }

        public List<ChannelInfosBean> getChannel_infos() {
            return channel_infos;
        }

        public void setChannel_infos(List<ChannelInfosBean> channel_infos) {
            this.channel_infos = channel_infos;
        }


        public static class ChannelInfosBean implements Parcelable {
            /**
             * real_name : 玩心
             * card_no : 6225880154047683
             * bank_short_name : 招商银行
             * issuer_bank_province : 广东省
             * issuer_bank_city : 深圳市
             * sub_bank_name : 招商银行
             * bank_img_url : http://7vzspj.com2.z0.glb.qiniucdn.com/cardbin%2F%E6%8B%9B%E5%95%86.png
             * card_type : 1
             * status : 1
             * withdraw_memo : 预计一个工作日内到账
             * mobile : 15210813371
             */
            private boolean selectFlag;

            private String real_name;
            private String card_no;
            private String bank_short_name;
            private String issuer_bank_province;
            private String issuer_bank_city;
            private String sub_bank_name;
            private String bank_img_url;
            private int card_type;
            private String status;
            private String withdraw_memo;
            private String mobile;

            @Override
            public String toString() {
                return "[" +
                        "{" +
                        "\"real_name\": \"" + real_name + "\"," +
                        "\"card_no\": \"" + card_no + "\"," +
                        "\"bank_short_name\": \"" + bank_short_name + "\"," +
                        "\"issuer_bank_province\": \"" + issuer_bank_province + "\"," +
                        "\"issuer_bank_city\": \"" + issuer_bank_city + "\"," +
                        "\"sub_bank_name\": \"" + sub_bank_name + "\"," +
                        "\"bank_img_url\": \"" + bank_img_url + "\"," +
                        "\"card_type\": " + card_type + "," +
                        "\"status\": \"" + status + "\"," +
                        "\"withdraw_memo\": \"" + withdraw_memo + "\"," +
                        "\"mobile\": \"" + mobile + "\"" +
                        " }" +
                        "]";
            }

            public boolean isSelectFlag() {
                return selectFlag;
            }

            public void setSelectFlag(boolean selectFlag) {
                this.selectFlag = selectFlag;
            }

            public String getReal_name() {
                return real_name;
            }

            public void setReal_name(String real_name) {
                this.real_name = real_name;
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

            public String getIssuer_bank_province() {
                return issuer_bank_province;
            }

            public void setIssuer_bank_province(String issuer_bank_province) {
                this.issuer_bank_province = issuer_bank_province;
            }

            public String getIssuer_bank_city() {
                return issuer_bank_city;
            }

            public void setIssuer_bank_city(String issuer_bank_city) {
                this.issuer_bank_city = issuer_bank_city;
            }

            public String getSub_bank_name() {
                return sub_bank_name;
            }

            public void setSub_bank_name(String sub_bank_name) {
                this.sub_bank_name = sub_bank_name;
            }

            public String getBank_img_url() {
                return bank_img_url;
            }

            public void setBank_img_url(String bank_img_url) {
                this.bank_img_url = bank_img_url;
            }

            public int getCard_type() {
                return card_type;
            }

            public void setCard_type(int card_type) {
                this.card_type = card_type;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getWithdraw_memo() {
                return withdraw_memo;
            }

            public void setWithdraw_memo(String withdraw_memo) {
                this.withdraw_memo = withdraw_memo;
            }

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }


            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.real_name);
                dest.writeString(this.card_no);
                dest.writeString(this.bank_short_name);
                dest.writeString(this.issuer_bank_province);
                dest.writeString(this.issuer_bank_city);
                dest.writeString(this.sub_bank_name);
                dest.writeString(this.bank_img_url);
                dest.writeInt(this.card_type);
                dest.writeString(this.status);
                dest.writeString(this.withdraw_memo);
                dest.writeString(this.mobile);
            }

            public ChannelInfosBean() {
            }

            protected ChannelInfosBean(Parcel in) {
                this.real_name = in.readString();
                this.card_no = in.readString();
                this.bank_short_name = in.readString();
                this.issuer_bank_province = in.readString();
                this.issuer_bank_city = in.readString();
                this.sub_bank_name = in.readString();
                this.bank_img_url = in.readString();
                this.card_type = in.readInt();
                this.status = in.readString();
                this.withdraw_memo = in.readString();
                this.mobile = in.readString();
            }

            public static final Parcelable.Creator<ChannelInfosBean> CREATOR = new Parcelable.Creator<ChannelInfosBean>() {
                @Override
                public ChannelInfosBean createFromParcel(Parcel source) {
                    return new ChannelInfosBean(source);
                }

                @Override
                public ChannelInfosBean[] newArray(int size) {
                    return new ChannelInfosBean[size];
                }
            };
        }

    }
}
