package com.demo.zjavawithaws;

public class MakeOutWord {

  

    public static void main(String[] args) {
    	
    	String out="<<>>";
    	String word="Yay";
    	String res = out.substring(0, 2) + word + out.substring(2, 4);
    	System.out.println(res);
    	
    	String out2="<<>>";
    	String word2="WooHoo";
    	String res2 = out2.substring(0, 2) + word2 + out2.substring(2, 4);
    	System.out.println(res2);
    	
    	String out3="[[]]";
    	String word3="word";
    	String res3 = out3.substring(0, 2) + word3 + out3.substring(2, 4);
    	System.out.println(res3);
        
        
    }
}
