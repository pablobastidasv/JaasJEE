package co.pablobastidasv.security;

import java.security.MessageDigest;

/**
 * Created by pbastidas on 31/03/15.
 */
public class PasswordGenerator {
	public static void main(String[] args) throws Exception {
		String password = "123";
		MessageDigest md = java.security.MessageDigest.getInstance("SHA-256");
		md.update(password.getBytes("UTF-8"));
		byte[] passwordDigest = md.digest();
		String encodedPasswordHash = new sun.misc.BASE64Encoder().encode(passwordDigest);
		System.out.println(encodedPasswordHash);
	}
}
