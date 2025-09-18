package com.nt.runner;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.MarriageSeeker;
import com.nt.service.IMarriageSeekerService;

@Component
public class GetMarriageSeekerRunner implements CommandLineRunner {


	@Autowired
	IMarriageSeekerService msService;

	@Override
	public void run(String... args) throws Exception {

		
		
		try(Scanner sc= new Scanner(System.in)) {
			
			//User Input
			System.out.println("Enter the Marriage Seeker id");
			Integer id= sc.nextInt();
			
			MarriageSeeker ms= msService.getMarriageSeeker(id);
			
			System.out.println("Merraiage Seeker id is: "+ ms.getMsId());
			System.out.println("Merraiage Seeker Name is: "+ ms.getMsName());
			System.out.println("Merraiage Seeker Address is: "+ ms.getMsAddr());
			System.out.println("Merraiage Seeker is Indian: "+ ms.getIsIndia());
			
			byte[] imageByte=ms.getMsImage();
			FileOutputStream fos= new FileOutputStream("msimage.png");
			fos.write(imageByte); fos.flush(); fos.close();
			System.out.println("Merraiage Seeker Image is saved with name: msimage.png");
			
			char[] bioDataChar=ms.getMsBiodata();
			FileWriter fw= new FileWriter("msdiodata.txt");
			fw.write(bioDataChar); fw.flush(); fw.close();
			System.out.println("Merraiage Seeker Biodata is saved with name: msdiodata.txt");
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
