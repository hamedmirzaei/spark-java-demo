package com.revolut.hm.task;

import static spark.Spark.*;

public class App  {
    public static void main( String[] args ) {
        port(8080);
        get("/hello", (req, res) -> "Hello World");
    }
}
