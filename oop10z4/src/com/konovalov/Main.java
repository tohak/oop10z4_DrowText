package com.konovalov;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Map<String, String> map = text();
		map.forEach((key, value) -> drow(key, value));
	}

	public static void drow(String key, String value) {

		BufferedImage image = new BufferedImage(144, 32, BufferedImage.TYPE_INT_RGB);
		Graphics g = image.getGraphics();
		g.drawString(value, 6, 12);
		for (int y = 0; y < 32; y++) {
			StringBuilder sb = new StringBuilder();
			for (int x = 0; x < 144; x++)
				sb.append(image.getRGB(x, y) == -16777216 ? " " : key);
			if (sb.toString().trim().isEmpty())
				continue;
			System.out.println(sb);
		}
	}

	public static Map<String, String> text() {
		String text = "";
		String key = "*";
		Map<String, String> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input symbol drow");
		key = sc.nextLine();
		System.out.println("Input text drow");
		text = sc.nextLine();
		map.put(key, text);
		return map;
	}
}
