package com.sch.myrule;

import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class MySelfRule {
	public IRule myRule() {
		System.out.println("进入了.......................");
		return new RandomRule();
	}

}
