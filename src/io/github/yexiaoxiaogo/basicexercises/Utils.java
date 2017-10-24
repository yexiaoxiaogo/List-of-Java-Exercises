package io.github.yexiaoxiaogo.basicexercises;

import java.util.Date;

import javax.xml.ws.http.HTTPBinding;

public class Utils {
	
	private static void post(String message, int level) {
//		http.post("/mongodb", {
//			body: {
//				message: message,
//				level: level,
//				time: Date.now()
//			}
//		})
	}
	public static void log(String message) {
		post(message, 1);
	}
	
	public static void err(String message) {
		post(message, 2);
	}
	
	
}
