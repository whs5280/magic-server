package com.magic.common.util;

import cn.hutool.core.codec.Base64;
import cn.hutool.crypto.Mode;
import cn.hutool.crypto.Padding;
import cn.hutool.crypto.symmetric.AES;

public class AesUtil {
    private static final String goldKey = "87C631A7A0BE7DC1";
    private static final String iv = "b0f82e9c1a3b6d4f";

    public static String encrypt(String data)
    {
        AES aes = new AES(Mode.CBC, Padding.PKCS5Padding, goldKey.getBytes(), iv.getBytes());
        return Base64.encode(Base64.encode(aes.encrypt(data.getBytes())));
    }

    public static String decrypt(String encrypted){
        AES aes = new AES(Mode.CBC, Padding.PKCS5Padding, goldKey.getBytes(), iv.getBytes());
        return aes.decryptStr(new String (Base64.decode(encrypted.getBytes())));
    }
}
