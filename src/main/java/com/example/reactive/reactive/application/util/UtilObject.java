package com.example.reactive.reactive.application.util;


import org.apache.commons.lang3.ObjectUtils;

public class UtilObject {

    private UtilObject() {

    }

    public static <T> boolean objectIsNull(T object) {
        return object == null;
    }

    public static <T> T getDefaultValue(T valor, T defecto) {
        return ObjectUtils.defaultIfNull(valor, defecto);
    }


}
