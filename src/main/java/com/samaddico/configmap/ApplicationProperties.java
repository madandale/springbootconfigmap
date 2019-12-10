package com.samaddico.configmap;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Data
@Configuration
@ConfigurationProperties(prefix = "webservice.endpoint")
public class ApplicationProperties {

    public String getTransferfund() {
		return transferfund;
	}
	public void setTransferfund(String transferfund) {
		this.transferfund = transferfund;
	}
	public String getGetbalance() {
		return getbalance;
	}
	public void setGetbalance(String getbalance) {
		this.getbalance = getbalance;
	}
	public String getCustomerinfo() {
		return customerinfo;
	}
	public void setCustomerinfo(String customerinfo) {
		this.customerinfo = customerinfo;
	}
	private String transferfund;
    private String getbalance;
    private String customerinfo;

}
