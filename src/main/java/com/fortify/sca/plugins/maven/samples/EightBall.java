package com.fortify.sca.plugins.maven.samples;

import java.io.FileReader;

// My password is 1234
public class EightBall {
	public static void main(String args[]) throws Exception {
		char[] buffer = new char[1024];
		String filename = args[0];
		try {
			filename = "" + (Integer.parseInt(filename) % 3);
		} catch (Exception e) {
			System.out.println("Invalid input.");
		}
		new FileReader(filename).read(buffer);
		System.out.println(buffer);
	}
}
