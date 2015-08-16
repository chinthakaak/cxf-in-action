package com.examples;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by ka40215 on 8/1/15.
 */
@WebService
public interface Hello {
    void hello(@WebParam(name = "text")  String text);
    void hello1();
}
