package com.algo.self_200207;


import java.io.*;

class Main {


	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = changeInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			int len = s.length();

			int sum = 0;
			int score = 1;
			for (int j = 0; j < len; j++) {
				if (s.charAt(j) == 'O') {
					sum += score;
					score++;
				} else
					score = 1;
			}

			sb.append(sum + "\n");
		}

		System.out.print(sb);
	}
	
	static int changeInt(String s) {
		return Integer.parseInt(s);
	}
}