package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
// timed password changing 
// dynamic password

import java.io.InputStreamReader;

public class Encrypter {

	public static void main(String[] args) {
		// TODO corresponding alphabet to numbers
		File toBeEncrypted = new File("test1.txt");
		int fileTraverseFlag=1;//flag to exit encrypting flag
		InputStream ips;
		InputStreamReader ipsr;
		BufferedReader reader;
		String line;
		try {
			ips = new FileInputStream(toBeEncrypted);
			ipsr = new InputStreamReader(ips);
			reader = new BufferedReader(ipsr);
			EncrypAlgo obj = new EncrypAlgo();
			while(fileTraverseFlag!=0){
				while(reader.readLine()!=null){
					line = reader.readLine();
					obj.encryptingAlgo(line);
				}
			}
		} catch(Exception e){ 
		//catch (FileNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
	}

}
