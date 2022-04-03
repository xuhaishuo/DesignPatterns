package com.xhs.composite;

/**
 * @author haishuo.xu
 * @description 自定义异常类
 * @create_at 2022/3/31 12:18
 * @since
 */
public class FileTreatMentException extends RuntimeException {

    public FileTreatMentException() {
    }

    public FileTreatMentException(String msg) {
        super(msg);
    }
}
