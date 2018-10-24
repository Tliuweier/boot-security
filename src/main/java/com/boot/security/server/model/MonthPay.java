package com.boot.security.server.model;

import java.util.Date;

public class MonthPay extends BaseEntity<Long> {

	private String month;
	private String pay;
	private Integer paymoney;
	private Date paytime;
	private String ordercd;
	private String consumer;
	private String cashier;
	private String typename;
	private String trafficTravelMoney;//交通出行
	private String housingPayMentMoney;//住房缴费
	private String healthMoney;//健康
	private String dailyLifeMoney;//生活日用
	private String OtherCunsumptionMoney; //其他消费

	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getPay() {
		return pay;
	}
	public void setPay(String pay) {
		this.pay = pay;
	}
	public Integer getPaymoney() {
		return paymoney;
	}
	public void setPaymoney(Integer paymoney) {
		this.paymoney = paymoney;
	}
	public Date getPaytime() {
		return paytime;
	}
	public void setPaytime(Date paytime) {
		this.paytime = paytime;
	}
	public String getOrdercd() {
		return ordercd;
	}
	public void setOrdercd(String ordercd) {
		this.ordercd = ordercd;
	}
	public String getConsumer() {
		return consumer;
	}
	public void setConsumer(String consumer) {
		this.consumer = consumer;
	}
	public String getCashier() {
		return cashier;
	}
	public void setCashier(String cashier) {
		this.cashier = cashier;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public String getTrafficTravelMoney() {
		return trafficTravelMoney;
	}

	public void setTrafficTravelMoney(String trafficTravelMoney) {
		this.trafficTravelMoney = trafficTravelMoney;
	}

	public String getHousingPayMentMoney() {
		return housingPayMentMoney;
	}

	public void setHousingPayMentMoney(String housingPayMentMoney) {
		this.housingPayMentMoney = housingPayMentMoney;
	}

	public String getHealthMoney() {
		return healthMoney;
	}

	public void setHealthMoney(String healthMoney) {
		this.healthMoney = healthMoney;
	}

	public String getDailyLifeMoney() {
		return dailyLifeMoney;
	}

	public void setDailyLifeMoney(String dailyLifeMoney) {
		this.dailyLifeMoney = dailyLifeMoney;
	}

	public String getOtherCunsumptionMoney() {
		return OtherCunsumptionMoney;
	}

	public void setOtherCunsumptionMoney(String otherCunsumptionMoney) {
		OtherCunsumptionMoney = otherCunsumptionMoney;
	}
}
