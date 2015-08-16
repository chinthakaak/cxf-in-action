package com.examples;

import javax.xml.ws.Endpoint;

/**
 * Created by ka40215 on 8/1/15.
 */
public class Server {
    public static void main(String[] args) {
        HelloCXF helloCXF = new HelloCXF();
        Endpoint.publish("http://localhost:9000/hello", helloCXF);
        Endpoint.publish("http://localhost:9000/hello1", helloCXF);

    }
}
