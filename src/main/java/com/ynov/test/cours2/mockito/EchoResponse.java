package com.ynov.test.cours2.mockito;

public class EchoResponse {
    private final String code;
    public EchoResponse(String code) {
        this.code = code;
    }

    public String getReturnCode() {
        return code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EchoResponse that = (EchoResponse) o;

        if (!code.equals(that.code)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }
}
