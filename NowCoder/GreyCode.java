import java.util.*;

/**
 * 格雷码： G(n) = B(n) XOR B(n+1), 这是格雷码和二进制码的转换公式
 *
 * 一般的，普通二进制码与格雷码可以按以下方法互相转换：
 *
 * 二进制码->格雷码（编码）：从最右边一位起，依次将每一位与左边一位异或（XOR），作为对应格雷码该位的值，最左边一位不变（相当于左边是0）；
 *
 * 格雷码-〉二进制码（解码）：从左边第二位起，将每位与左边一位解码后的值异或，作为该位解码后的值（最左边一位依然不变）。
 *
 * l_str   last_str,也就是后一次的GreyCode
 * f_str   first_str,前一次的GreyCode
 */
 class GrayCode {
    public String[] getGray(int n) {
        // write code here
        String[] l_str = null;
        if(n == 1){
            l_str = new String[]{"0","1"};
        }else{
            String[] f_str = getGray(n - 1);
            l_str = new String[2*f_str.length];//格雷码计算方式，前一次格雷码分两部分
            for(int i = 0;i < f_str.length;i++){
                l_str[i] = "0"+f_str[i];//前半部分的二进制码前加 0
                l_str[l_str.length-1-i] = "1"+f_str[i];//后半部分的二进制码前加 1
            }
        }
        return l_str;
    }
}