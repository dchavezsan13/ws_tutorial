package com.myexample;

import javax.jws.WebService;

@WebService(endpointInterface = "com.myexample.HelloWorld")  
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String getHelloWorldAsString(String name) {
		// TODO Auto-generated method stub
		return "hello world jax-ws"+ name;
	}

	@Override
	public String thisIsMyOtherMethod() {
		// TODO Auto-generated method stub
		return "This is my other method";
	}

}
