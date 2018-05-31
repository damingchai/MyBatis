package com.bdqn.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
/*
 * 把自己输入流转会为字符输入流
 */
public class InputStreamReaderTest {

	public static void main(String[] args) {
		BufferedInputStream bis=null;
       BufferedReader br=null;
		InputStreamReader isr=null;
		try {
			bis = new BufferedInputStream(new FileInputStream("d:/a.txt"));
			isr = new InputStreamReader(bis);
			br=new BufferedReader(isr);
			int a;
			while((a=br.read())!=-1) {
				System.out.print(a);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
