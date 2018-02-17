package com.myexample;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


@WebService  
@SOAPBinding(style = Style.RPC)  
public interface HelloWorld{  
    @WebMethod String getHelloWorldAsString(String name);  
    
    @WebMethod String thisIsMyOtherMethod();
}  