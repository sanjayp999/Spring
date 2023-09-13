package com.pas;

import pws_utils.PasswordLogic;

public class Security {
	public static void main(String[] args) {
	 PasswordLogic p = new PasswordLogic();
	 String encode = p.encode("sanjay");
	 System.out.println(encode);
	}

}
