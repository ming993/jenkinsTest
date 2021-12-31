package common.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**

 * SHA1不可逆加密工具

 */

public class Sha1Util {

    public static String getSha1(byte[] input) throws NoSuchAlgorithmException {
        MessageDigest mDigest = MessageDigest.getInstance("SHA-1");
        byte[] result = mDigest.digest(input);

        return byteToStr(result);
    }

    //将字节数组转换为十六进制字符串
    /**
     * @param byteArray
     *@return
     */
    private static String byteToStr(byte[] byteArray) {
        String strDigest = "";
        for (int i = 0; i < byteArray.length; i++) {
            strDigest += byteToHexStr(byteArray[i]);
        }
        return strDigest;
    }

    private static String byteToHexStr(byte mByte) {
        char[] Digit = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        char[] tempArr = new char[2];
        tempArr[0] = Digit[(mByte >>> 4) & 0X0F];
        tempArr[1] = Digit[mByte & 0X0F];
        String s = new String(tempArr);
        return s;
    }
}
