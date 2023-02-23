package org.response;

/**
 * @author xuanyu peng
 * @description:
 * @date 2023/2/23 23:08
 */
public class CommonResponse<T> {
    private String code;

    private String msg;

    private T data;

    public CommonResponse(final String code, final String msg, final T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public CommonResponse(final T data) {
        this.data = data;

    }

    public CommonResponse() {
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(final String code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(final String msg) {
        this.msg = msg;
    }

    public T getData() {
        return this.data;
    }

    public void setData(final T data) {
        this.data = data;
    }
}
