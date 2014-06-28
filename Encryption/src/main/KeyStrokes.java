package main;

import java.util.ArrayList;

public class KeyStrokes {
	ArrayList passArray;
	Long t1;
	Long t2;
	public void passwordCapture(String passwordChar){
		t1=System.currentTimeMillis();
		String passwordComponent;
		if(t2==null){
			passwordComponent = passwordChar + "," + t1;
		}
		else{
			passwordComponent = passwordChar + "," + (t1-t2);
		}
		t2=t1;
	}
}
