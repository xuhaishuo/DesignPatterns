package com.xhs.visitor;

/**
 * @author haishuo.xu
 * @description 自定义异常类
 * @create_at 2022/4/1 11:04
 * @since
 */
public class FileTreatmentException extends RuntimeException {
    public FileTreatmentException() {
    }

    public FileTreatmentException(String msg) {
        super(msg);
    }
}
