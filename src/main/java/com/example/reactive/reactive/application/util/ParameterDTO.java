package com.example.reactive.reactive.application.util;

import static com.example.reactive.reactive.application.util.UtilText.applyTrim;

public class ParameterDTO {

    private String key;
    private String value;

    private ParameterDTO(String key, String value) {
        super();
        setkey(key);
        setvalue(value);
    }

    public static ParameterDTO create(String key, String value) {
        return new ParameterDTO(key, value);
    }

    private void setkey(String key) {
        this.key = applyTrim(key);
    }

    private void setvalue(String value) {
        this.value = applyTrim(value);
    }

    public String getkey() {
        return key;
    }

    public String getvalue() {
        return value;
    }
}
