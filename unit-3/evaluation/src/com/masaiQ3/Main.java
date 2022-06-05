package com.masaiQ3;

import java.util.Scanner;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in);

	        ArrayList<PlayList> arr = new ArrayList<>();

	        for(int i = 1 ; i <= 4 ; i++) {
	            System.out.println("Enter the Song Name");
	            String song = sc.next();
	            System.out.println("Enter the Movie Name");
	            String movie = sc.next();
	         
	            PlayList p = new PlayList(song,movie);
	            arr.add(p);

	           }
	        }
	    }
				

	


