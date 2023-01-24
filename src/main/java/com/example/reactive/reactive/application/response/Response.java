package com.example.reactive.reactive.application.response;

import com.example.reactive.reactive.application.util.UtilObject;
import com.example.reactive.reactive.application.util.UtilText;

import java.util.ArrayList;
import java.util.List;

public class Response<T> {

    private ResponseEnum state;
    private List<String> messageResponse;
    private List<T> result;

    public void agregarMensaje(String mensaje) {
        if(!UtilText.isEmpty(mensaje)) {
            getmessageResponse().add(mensaje);
        }
    }

    public ResponseEnum getState() {
        if (UtilObject.objectIsNull(state)) {
            setstate(state);
        }
        return state;
    }

    public void setstate(ResponseEnum state) {
        this.state = UtilObject.getDefaultValue(state, ResponseEnum.ERROR);
    }

    public List<String> getmessageResponse() {
        if (UtilObject.objectIsNull(messageResponse)) {
            setmessageResponse(messageResponse);
        }
        return messageResponse;
    }

    public void setmessageResponse(List<String> messageResponse) {
        this.messageResponse = UtilObject.getDefaultValue(messageResponse, new ArrayList());
    }

    public List<T> getresult() {
        if (UtilObject.objectIsNull(result)) {
            setresult(result);
        }
        return result;
    }

    public void setresult(List<T> result) {
        this.result = UtilObject.getDefaultValue(result, new ArrayList());
    }
}
