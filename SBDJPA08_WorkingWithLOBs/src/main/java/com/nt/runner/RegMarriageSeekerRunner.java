package com.nt.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.nt.entity.MarriageSeeker;
import com.nt.service.IMarriageSeekerService;

//@Component
public class RegMarriageSeekerRunner implements CommandLineRunner {


	@Autowired
	IMarriageSeekerService msService;

	@Override
	public void run(String... args) throws Exception {

		
		
		try(Scanner sc= new Scanner(System.in)) {
			
			//User Input
			System.out.println("Enter the Marriage Seeker Name!");
			String name=sc.next();
			System.out.println("Enter the Marriage Seeker Adrress!");
			String addr=sc.next();
			System.out.println("Is Marriage Seeker India?");
			boolean isIndia=sc.nextBoolean();
			System.out.println("Enter the Marriage Seeker Image Path");
			String imagePath=sc.next();
			System.out.println("Enter the Marriage Seeker BioData Path");
			String bioDataPath=sc.next();
			
			//Converting to byte[]
			@SuppressWarnings("resource")
			FileInputStream fis= new FileInputStream(imagePath);
			byte[] imageByte=fis.readAllBytes();
			
			//convert to char[]
			File file= new File(bioDataPath);
			int lenght=(int)file.length();
			@SuppressWarnings("resource")
			FileReader reader=new FileReader(file);
			char[] bioDataChars= new char[lenght];
			reader.read(bioDataChars);
			
			//Creating Entity class Object
			MarriageSeeker ms= new MarriageSeeker(name,addr,isIndia,imageByte,bioDataChars);
			String msg= msService.regMarriageSeeker(ms);
			System.out.println(msg);
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
