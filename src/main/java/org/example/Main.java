package org.example;

import com.magic.common.util.AesUtil;

public class Main {
    public static void main(String[] args) {
        // 加密
        String encrypt = AesUtil.encrypt("89f7b7014063265955fcacc5284f8f41");
        System.out.println(encrypt);
    }
}