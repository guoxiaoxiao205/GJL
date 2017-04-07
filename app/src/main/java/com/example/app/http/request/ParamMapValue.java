package com.example.app.http.request;

/**
 * Created by wanxin on 16/11/21.
 */

public class ParamMapValue {
    public static final String CMD_GET_ACCOUNT_AND_RED_BALANCE = "get_account_and_red_balance";
    public static final String CMD_USER_HEAD_IMG_LIST_SHOW = "user_head_img_list_show";
    public static final String CMD_USER_HEAD_IMG_CHANGE = "user_head_img_change";
    public static final String CMD_SELECT_CHANNEL_INFO_BY_TYPE = "select_channel_info_by_type";
    public static final String CMD_GET_CARD_BIN_BY_BANK_CARD = "get_card_bin_by_bank_card";
    public static final String CMD_SEND_VERIFY_CODE = "send_verify_code";
    public static final String CMD_MODIFY_CHANNEL_INFO_BY_TYPE = "modify_channel_info_by_type";
    public static final String CMD_GET_FILL_CONSTANT_LIST = "get_fill_constant_list";
    public static final String CMD_BIND_USER_REAL_INFORMATION = "bind_user_real_information";
    public static final String CMD_CREATE_PAY_PWD = "create_pay_pwd";
    public static final String CMD_CHECK_PAY_PWD = "check_pay_pwd";
    public static final String CMD_CREATE_ORDER_FOR_FILL = "create_order_for_fill";
    public static final String CMD_GET_RED_CONSTANT_LIST = "get_red_constant_list";
    public static final String CMD_CREATE_ORDER_FOR_RED = "create_order_for_red";
    public static final String CMD_UPDATE_ORDER_STATUS_RED_BY_BALANCE = "update_order_status_red_by_balance";
    public static final String CMD_ACCOUNT_FLOW_CASH_FOR_SHOW = "account_flow_cash_for_show";
    public static final String CMD_RED_USER_LIST_BY_PAGE = "red_user_list_by_page";
    public static final String CMD_GET_RED_INFO = "get_red_info";
    public static final String CMD_SHOW_LIST_FOR_WITHDRAW = "show_list_for_withdraw";
    public static final String CMD_CREATE_ORDER_FOR_WITHDRAW = "create_order_for_withdraw";
    public static final String CMD_USER_CASH_ORDER_LIST_WITHDRAW = "user_cash_order_list_withdraw";
    public static final String CMD_USER_NICK_NAME_CHANGE = "user_nick_name_change";
    public static final String CMD_USER_MOBILE_BIND = "user_mobile_bind";
    public static final String CMD_USER_INFO_SHOW = "user_info_show";
    public static final String CMD_USER_LOGIN = "user_login";
    public static final String CMD_CHECK_PWD = "check_pwd";
    public static final String CMD_CREATE_PWD = "create_pwd";
    public static final String CMD_SET_USER_FREE_PAY_PWD_QUOTA = "set_user_free_pay_pwd_quota";
    public static final String CMD_CHANGE_PAY_PWD = "change_pay_pwd";
    public static final String CMD_SHOW_FREE_PAY_PWD_QUOTA_LIST = "show_free_pay_pwd_quota_list";
    public static final String CMD_CHANGE_PWD = "change_pwd";
    public static final String CMD_GET_PAY_FOR_LIST_HAS_PRE_TOKEN_CASH = "get_pay_for_list_has_pre_token_cash";
    public static final String CMD_ACCOUNT_GET_THIRD_TOKEN_CASH_ONLY_RED = "account_get_third_token_cash_only_red";
    public static final String CMD_ACCOUNT_GET_THIRD_TOKEN_CASH_ONLY_PAY = "account_get_third_token_cash_only_pay";
    public static final String CMD_ACCOUNT_GET_THIRD_TOKEN_CASH_GROUP = "account_get_third_token_cash_group";
    public static final String CMD_GET_RED_INFO_DETAIL = "get_red_info_detail";
    public static final String CMD_USER_LOGIN_TOKEN_VERIFY = "user_login_token_verify";

    public static final String CAIQR_VERSION = "1.2";
    public static final String LOGIN_VERSION = "240";

    public static final String PAY_VERSION = "3.0";
    public static final String RECHARGE_PAY_VERSION = "3.0";
    public static final String NEW_CLIENT = "1";

    public static final String EAGLE_CLIENT = "0"; //老鹰接口用 0 代表android
   public static final String CAIQR_CLIENT_TYPE = "1000"; //彩球接口用 客户端类型 Android 1000
/*
//快三
    public static final String CAIQR_CLIENT_TYPE = "1010"; //彩球接口用 客户端类型 Android 1000
*/
}
