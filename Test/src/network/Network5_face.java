package network;

import com.ggoreb.kakao_api.VisionUtil;

public class Network5_face {
	public static void main(String[] args) {
		VisionUtil vu = new VisionUtil("0a7c5408897da72ef62213f279237f86");
		String result = vu.sendFile("c:/dev/d.jpg");
		System.out.println(result);
	}
}
