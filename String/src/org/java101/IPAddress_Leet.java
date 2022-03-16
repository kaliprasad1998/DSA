package org.java101;

https://leetcode.com/problems/defanging-an-ip-address/
class IPAddress_Leet {
    public static void main(String[] args) {
        String s = "1.1.1.1";
        String out = defangIPaddr(s);
        System.out.println(out);
    }
    public static String defangIPaddr(String address) {
        return address.replaceAll("[.]", "[.]");
    }
}