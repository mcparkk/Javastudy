package network;

import com.ggoreb.kakao_api.TranslateUtil;

public class Network5_trans {
	public static void main(String[] args) {
		TranslateUtil tu = new TranslateUtil("0a7c5408897da72ef62213f279237f86");
		String r = tu.sendText("kr", "en", "�ֹ��Ͻ� ���� ���Խ��ϴ�.");
		System.out.println(r);
	}
}
