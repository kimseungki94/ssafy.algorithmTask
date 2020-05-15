package com.algo.self_200515;

import java.io.*;
import java.util.*;

public class bj_2609 {
	static int N, M,GCD,GMP;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;

		st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		gcd(N,M);
		GMP=(N*M)/GCD;
		bw.write(GCD+" "+GMP);
		bw.flush();
		bw.close();
		
	}

	private static void gcd(int a, int b) {
		if(b==0) {
			GCD = a;
			return;
		}else {
			int K = a%b;
			gcd(b,K);
		}
		
	}
}
