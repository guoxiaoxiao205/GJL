package com.example.app.http.response;

import java.util.List;

/**
 * Created by wanxin on 16/12/19.
 */

public class OrderNumTicketDetailResponse {


    /**
     * extraCn : 任选二
     * ticketVos : [{"bonus":0,"ifPassPeriod":1,"lotteryNumbers":["01 07","02 11","03 08","03 09","04 08"]
     * ,"orderId":"17020715JXD400019037578","prizeStatus":1,"ticketId":"170207154000034774","ticketNo":"A0873B97760AD0BFDF91F2DADADE3023",
     * "ticketStatus":4,"ticketStatusCn":"未中奖","times":1},{"bonus":0,"ifPassPeriod":1,"lotteryNumbers":["05 07","06 10","07 10","08 10","09 10"],
     * "orderId":"17020715JXD400019037578","prizeStatus":1,"ticketId":"170207154000034775","ticketNo":"F57EB0C3D7BD63C37178A53C3154632D","ticketStatus":4,"ticketStatusCn":"未中奖","times":1},{"bonus":0,"ifPassPeriod":1,"lotteryNumbers":["10 11"],"orderId":"17020715JXD400019037578","prizeStatus":1,"ticketId":"170207154000034776","ticketNo":"68AA930A6856B46A0654F60ADD42EFB3","ticketStatus":4,"ticketStatusCn":"未中奖","times":1},{"bonus":0,"ifPassPeriod":1,"lotteryNumbers":["01 08","04 06","04 11","05 10"],"orderId":"17020715JXD400019037578","prizeStatus":1,"ticketId":"170207154000034777","ticketNo":"E06E173CC2FF2F29A3477406D02BB100","ticketStatus":4,"ticketStatusCn":"未中奖","times":2}]
     */

    private String extraCn;
    private List<TicketVosBean> ticketVos;

    public String getExtraCn() {
        return extraCn;
    }

    public void setExtraCn(String extraCn) {
        this.extraCn = extraCn;
    }

    public List<TicketVosBean> getTicketVos() {
        return ticketVos;
    }

    public void setTicketVos(List<TicketVosBean> ticketVos) {
        this.ticketVos = ticketVos;
    }

    public static class TicketVosBean {
        public int getViewFloatType() {
            return ViewFloatType;
        }

        public void setViewFloatType(int viewFloatType) {
            ViewFloatType = viewFloatType;
        }

        /**
         * bonus : 0
         * ifPassPeriod : 1
         * lotteryNumbers : ["01 07","02 11","03 08","03 09","04 08"]
         * orderId : 17020715JXD400019037578
         * prizeStatus : 1
         * ticketId : 170207154000034774
         * ticketNo : A0873B97760AD0BFDF91F2DADADE3023
         * ticketStatus : 4
         * ticketStatusCn : 未中奖
         * times : 1
         */

        private String extraCn;
        private int ViewFloatType;
        private int bonus;
        private int ifPassPeriod;
        private String orderId;
        private int prizeStatus;
        private String ticketId;
        private String ticketNo;
        private int ticketStatus;
        private String ticketStatusCn;
        private int times;
        private List<String> lotteryNumbers;
        public String getExtraCn() {
            return extraCn;
        }

        public void setExtraCn(String extraCn) {
            this.extraCn = extraCn;
        }
        public int getBonus() {
            return bonus;
        }

        public void setBonus(int bonus) {
            this.bonus = bonus;
        }

        public int getIfPassPeriod() {
            return ifPassPeriod;
        }

        public void setIfPassPeriod(int ifPassPeriod) {
            this.ifPassPeriod = ifPassPeriod;
        }

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public int getPrizeStatus() {
            return prizeStatus;
        }

        public void setPrizeStatus(int prizeStatus) {
            this.prizeStatus = prizeStatus;
        }

        public String getTicketId() {
            return ticketId;
        }

        public void setTicketId(String ticketId) {
            this.ticketId = ticketId;
        }

        public String getTicketNo() {
            return ticketNo;
        }

        public void setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
        }

        public int getTicketStatus() {
            return ticketStatus;
        }

        public void setTicketStatus(int ticketStatus) {
            this.ticketStatus = ticketStatus;
        }

        public String getTicketStatusCn() {
            return ticketStatusCn;
        }

        public void setTicketStatusCn(String ticketStatusCn) {
            this.ticketStatusCn = ticketStatusCn;
        }

        public int getTimes() {
            return times;
        }

        public void setTimes(int times) {
            this.times = times;
        }

        public List<String> getLotteryNumbers() {
            return lotteryNumbers;
        }

        public void setLotteryNumbers(List<String> lotteryNumbers) {
            this.lotteryNumbers = lotteryNumbers;
        }
    }
}
