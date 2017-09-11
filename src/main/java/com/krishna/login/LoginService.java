package com.krishna.login;

public class LoginService {
	public boolean isUserValid(String user, String password) {
		if (user.equals("krishna")) {
			return true;
		}
		return false;
	}
}
