package network;

import com.ggoreb.kakao_api.TranslateUtil;

public class Network5_trans {
	public static void main(String[] args) {
		TranslateUtil tu = new TranslateUtil("0a7c5408897da72ef62213f279237f86");
		String r = tu.sendText("kr", "en", "주문하신 음료 나왔습니다.");
		System.out.println(r);
	}
}
