package com.fls;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Exp1 {

	public static void main(String args[]) {
		Path path = Paths.get("src/bytetest.txt");
		try {
			String lines ="";
			Files.writeString(path, lines, StandardOpenOption.CREATE);
			//Customer obj = new Customer();
			List<Customer> obj = new ArrayList<>();
			
			Files.write(path, lines.getBytes(), StandardOpenOption.CREATE);
			//Files.write(path, obj);
			byte[] bs = Files.readAllBytes(path);
			List<String> linesData = Files.readAllLines(path);
			System.out.println("reading byte data : "+new String(bs));
			System.out.println("Reading list of lines : "+linesData);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
