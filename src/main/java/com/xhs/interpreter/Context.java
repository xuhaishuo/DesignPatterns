package com.xhs.interpreter;

import java.util.StringTokenizer;

/**
 * @author haishuo.xu
 * @description 提供语法解析必须的方法
 * @create_at 2022/4/5 9:49
 * @since
 */
public class Context {
    private StringTokenizer tokenizer;
    private String currentToken;

    public Context(String text) {
        tokenizer = new StringTokenizer(text);
        nextToken();
    }

    /** 获取下一个标记 (前进至下一个标记) */
    public String nextToken() {
        if (tokenizer.hasMoreTokens()) {
            currentToken = tokenizer.nextToken();
        } else {
            currentToken = null;
        }
        return currentToken;
    }

    /** 获取当前标记 (不会前进至下一个标记) */
    public String currentToken() {
        return currentToken;
    }

    /** 先检查当前标记，然后获取下一个标记 (前进至下一个标记) */
    public void skipToken(String token) throws ParseException {
        if (!token.equals(currentToken)) {
            throw new ParseException("Warning: " + token + " is expected, but " + currentToken + " is found.");
        }
        nextToken();
    }

    /** 获取当前标记对应的值 (不会前进至下一个标记) */
    public int currentNumber() throws ParseException {
        int number = 0;
        try {
            number = Integer.parseInt(currentToken);
        } catch (NumberFormatException e) {
            throw new ParseException("Warning: " + e);
        }
        return number;
    }
}
