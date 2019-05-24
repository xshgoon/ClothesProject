package com.xp.clothes.util;

import org.springframework.util.DigestUtils;

public class PasswordUtil {
	public static String md5(String ...strings) {
		String s="";
		for ( String string : strings) {
			if(string != null && !string.isEmpty()) {
				s+=string;
			}
		}
		return DigestUtils.md5DigestAsHex(s.getBytes());
	}

}
