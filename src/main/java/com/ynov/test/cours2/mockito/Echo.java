package com.ynov.test.cours2.mockito;

public interface Echo {
    EchoResponse echo();
    EchoResponse echo(String s);
    EchoResponse echo(EchoRequest req, String s);
}
