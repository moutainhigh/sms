package com.ppdai.ac.sms.provider.core.protocol.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by kiekiyang on 2017/5/18.
 */
public class ChangeMessageStatueResponse {
    @JsonProperty("ResultCode")
    private int resultCode;

    @JsonProperty("ResultMessage")
    private String resultMessage;

    @JsonProperty("ResultObject")
    private int resultObject;

    @ApiModelProperty(value = "返回值")
    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    @ApiModelProperty(value = "返回消息")
    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    @ApiModelProperty(value = "返回执行结果")
    public int getResultObject() {
        return resultObject;
    }

    public void setResultObject(int resultObject) {
        this.resultObject = resultObject;
    }
}