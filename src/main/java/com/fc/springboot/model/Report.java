package com.fc.springboot.model;


import java.util.List;

/**
 * report
 *
 * @author since
 * @date 2021-01-25 09:12
 **/
public class Report<T> {
    /**
     * 是否成功
     */
    private boolean success;

    /**
     * 返回码，默认0成功
     */
    private int code;

    /**
     * 描述消息
     */
    private String msg;

    /**
     * 数据实体
     */
    private T data;

    /**
     * success with data
     *
     * @param data 数据
     * @param <T>  数据类型
     * @return 返回对象
     */
    public static <T> Report<T> ofSuccess(T data) {
        return new Report<T>().setSuccess(true).setMsg("success").setData(data);
    }

    /**
     * success with msg
     *
     * @param msg 描述消息
     * @param <T> 数据类型
     * @return 返回对象
     */
    public static <T> Report<T> ofSuccessMsg(String msg) {
        return new Report<T>().setSuccess(true).setMsg(msg);
    }

    /**
     * fail with code and msg
     *
     * @param code 返回码
     * @param msg  描述消息
     * @param <T>  数据类型
     * @return 返回对象
     */
    public static <T> Report<T> ofFail(int code, String msg) {
        Report<T> Report = new Report<>();
        Report.setSuccess(false);
        Report.setCode(code);
        Report.setMsg(msg);
        return Report;
    }

    /**
     * fail with code and exception
     *
     * @param code      返回码
     * @param throwable 异常
     * @param <T>       数据类型
     * @return 返回对象
     */
    public static <T> Report<T> ofThrowable(int code, Throwable throwable) {
        Report<T> Report = new Report<>();
        Report.setSuccess(false);
        Report.setCode(code);
        Report.setMsg(throwable.getClass().getName() + ", " + throwable.getMessage());
        return Report;
    }

    /**
     * 是否成功
     *
     * @return 是否成功
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * set success?
     *
     * @param success boolean
     * @return 返回对象
     */
    public Report<T> setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    /**
     * 获取返回码
     *
     * @return 返回码
     */
    public int getCode() {
        return code;
    }

    /**
     * 设置返回码
     *
     * @param code 返回码
     * @return 返回对象
     */
    public Report<T> setCode(int code) {
        this.code = code;
        return this;
    }

    /**
     * 获取描述消息
     *
     * @return 描述消息
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 设置描述消息
     *
     * @param msg 描述消息
     * @return 返回对象
     */
    public Report<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    /**
     * 获取数据
     *
     * @return 数据对象
     */
    public T getData() {
        return data;
    }

    /**
     * 设置返回数据对象
     *
     * @param data 数据对象
     * @return 返回对象
     */
    public Report<T> setData(T data) {
        if (data instanceof Page) {
            List list = (List) data;
            this.data = data;
        }
        else {
            this.data = data;
        }
        return this;
    }

    @Override
    public String toString() {
        return "Report{" + "success=" + success + ", code=" + code + ", msg='" + msg + '\'' + ", data=" + data + '}';
    }
}
