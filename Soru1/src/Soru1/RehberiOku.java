package Soru1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class RehberiOku {

	public static void main(String[] args) {
		
		
		 try 
			(BufferedReader reader=new BufferedReader(new FileReader("rehber.txt"))){
			 ArrayList<Rehber> rehber=new ArrayList<>();
			 System.out.println(rehber);
			 
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}