package com.feng.custom.util;

/**
 * TODO: 直接生成类文件, 添加相应注释信息
 */
public class GenerateClassName {

    public static void main(String[] args) {
        generateClassName("maximum-nesting-depth-of-the-parentheses", 1614);
    }

    private static void generateClassName(String origin, int order) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) (origin.charAt(0) - 32));
        for (int i = 1; i < origin.length(); i++) {
            if (origin.charAt(i) == '-') {
                sb.append((char) (origin.charAt(i + 1) - 32));
                i++;
            } else {
                sb.append(origin.charAt(i));
            }
        }
        sb.append('_').append(order);
        System.out.println(sb.toString());
    }
}
