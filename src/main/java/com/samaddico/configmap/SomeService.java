package com.samaddico.configmap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeService {

        @Autowired
        private ApplicationProperties applicationProperties;

        @Scheduled(fixedDelay = 5000)

    	@RequestMapping(value ="/readConfigMap")
    	public String readConfigMap() {
    		String values = "The balance url is " + this.applicationProperties.getGetbalance()
            +"The transfer url is " + this.applicationProperties.getTransferfund()+
            "The customerinfo url is " + this.applicationProperties.getCustomerinfo();
    		
    		return values;
        }


}
