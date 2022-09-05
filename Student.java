package assignemtn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;



// Main Parent class 
class StoreData {
	// method for input file of student details 
	 public static final String delimiter = ",";
	 public static void read(String csvFile) {
	      try {
	         File file = new File(csvFile);
	         FileReader fr = new FileReader(file);
	         BufferedReader br = new BufferedReader(fr);
	         String line = "";
	         String[] tempArr;
	         while((line = br.readLine()) != null) {
	            tempArr = line.split(delimiter);
	            for(String tempStr : tempArr) {
	               System.out.print(tempStr + " ");
	            }
	            System.out.println("\n");
	         }
	         br.close();
	         } catch(IOException ioe) {
	            ioe.printStackTrace();
	         }
	   }
	 
}
//  derived class for maths Student
class EnglishStudent extends StoreData {
	public double total;
	private static final DecimalFormat decfor = new DecimalFormat("0.00");
	public void Englishcal(){
		int tpaper, mterm,fexam;
		double percentagetpaper,percentagemter,percentagefexam,total;
		// scanner class for student input class for marks 
		Scanner opject = new Scanner(System.in);
		System.out.println("//Enter Marks of 'English'//\n");
		System.out.print("Enter Term Paper Marks: ");
		tpaper = opject.nextInt();
		System.out.print("Enter midterm marks: ");
		mterm = opject.nextInt();
		System.out.print("Enter final exam: \n");
		fexam = opject.nextInt();
		
		// percentage  calculation 
		percentagetpaper = (tpaper /100) * 30;
		percentagemter = (mterm /100) * 30;
		percentagefexam = (fexam /100) * 40;
		
		//total calculation 
		 total = percentagetpaper + percentagemter + percentagefexam;
		
		//print total
		
	    System.out.println("Total Marks: " + decfor.format(total));
	    
	    // code part calculate the grade part 
	   if(total > 90 && total <= 100 ) {
			System.out.println("Your Grade is: A\n");
		} else if (total > 80 && total <= 90) {
			System.out.println("Your Grade is: B\n");
		} else if (total > 70 && total <= 80) {
			System.out.println("Your Grade is: C\n");	
		} else if (total > 60 && total <= 70)
		{
			System.out.println("Your Grade is: D\n");
		} else if (total > 50 && total <= 60)
		{
			System.out.println("Your Grade is: E\n");
		} else 
		{
			System.out.println("Your Grade is: FAIL\n");
		}
			
	}
	
}

//derived class for science student 
class ScienceStudent extends StoreData{
	public double totalscience;
	private static final DecimalFormat decfor = new DecimalFormat("0.00");
	public void sciencecal() {
		int attedence, project, midterm,finalexam;
		double percentageattendence, percentagemidterm, percentageproject, percentagefinalexam ;
		//scanner class for enter marks 
		Scanner opject = new Scanner(System.in);
		System.out.println("//Enter Marks of 'Science'//\n");
		System.out.print("Enter Attendence : ");
		attedence = opject.nextInt();
		System.out.print("Enter project marks: ");
		project = opject.nextInt();
		System.out.print("Enter midterm exam: ");
		midterm = opject.nextInt();
		System.out.print("Enter finalexam exam: \n");
		finalexam = opject.nextInt();
		
		//percentage calculation 
		percentageattendence = (attedence / 100) * 10;
		percentagemidterm = (midterm / 100) * 30;
		percentageproject = (project / 100) * 30;
		percentagefinalexam = (finalexam / 100) * 30;
		
		// calculation for total 
		totalscience = percentageattendence + percentageproject +percentagemidterm + percentagefinalexam;
		// print total
		System.out.println("Total for Science is: " + decfor.format(totalscience));
		
		// code for grade 
		 if(totalscience > 90 && totalscience <= 100 ) {
				System.out.println("Your Grade is: A\n");
			} else if (totalscience > 80 && totalscience <= 90) {
				System.out.println("Your Grade is: B\n");
			} else if (totalscience > 70 && totalscience <= 80) {
				System.out.println("Your Grade is: C\n");	
			} else if (totalscience > 60 && totalscience <= 70)
			{
				System.out.println("Your Grade is: D\n");
			} else if (totalscience > 50 && totalscience <= 60)
			{
				System.out.println("Your Grade is: E\n");
			} else 
			{
				System.out.println("Your Grade is: FAIL\n");
			}
				
		
	}
	
	
}

// Derived Class for English Students 
 class MathsStudent extends StoreData{
		private static final DecimalFormat decfor = new DecimalFormat("0.00");
	public void mathscal() {
	
		int quiz1, quiz2, quiz3,quiz4,quiz5,test1,test2,finalexam;
		double quizaverage, percentagetest1, percentagetest2, percentagefinalexam, totalmaths,percentagequiz;
		//scanner class for student marks details 
		Scanner opject = new Scanner(System.in);
		System.out.println("//Enter Marks of 'Maths'//");
		System.out.print("Enter Marks of quiz1 : ");
		quiz1 = opject.nextInt();
		System.out.print("Enter Marks of quiz2 : ");
		quiz2 = opject.nextInt();
		System.out.print("Enter Marks of quiz3 : ");
		quiz3 = opject.nextInt();
		System.out.print("Enter Marks of quiz4 : ");
		quiz4 = opject.nextInt();
		System.out.print("Enter Marks of quiz5 : ");
		quiz5 = opject.nextInt();
		System.out.print("Enter test1 marks: ");
		test1 = opject.nextInt();
		System.out.print("Enter test2 marks: ");
		test2 = opject.nextInt();
		System.out.print("Enter finalexam exam: \n");
		finalexam = opject.nextInt();
		
		// calculation for percentage 
		quizaverage = (quiz1+quiz2+quiz3+quiz4+quiz5)/5;
		percentagequiz = (quizaverage / 100) * 15;
		percentagetest1 = (test1 / 100) * 30;
		percentagetest2 = (test2 / 100) * 20;
		percentagefinalexam = (finalexam /100) * 35;
		
		//calculation for total 
		totalmaths = percentagequiz + percentagetest1 + percentagetest2 + percentagefinalexam;
		// print function total
		System.out.println("Total for Maths is :" + decfor.format(totalmaths));
		// code for grade calculation 
		if(totalmaths > 90 && totalmaths <= 100 ) {
			System.out.println("Your Grade is: A\n");
		} else if (totalmaths > 80 && totalmaths <= 90) {
			System.out.println("Your Grade is: B\n");
		} else if (totalmaths > 70 && totalmaths <= 80) {
			System.out.println("Your Grade is: C\n");	
		} else if (totalmaths > 60 && totalmaths <= 70)
		{
			System.out.println("Your Grade is: D\n");
		} else if (totalmaths > 50 && totalmaths <= 60)
		{
			System.out.println("Your Grade is: E\n");
		} else 
		{
			System.out.println("Your Grade is: FAIL\n");
		}
			
		
			
	}
}

public class Student {
	
	public static void main(String[] args)  {
	 
		String name;
		String csvFile = "D:\\Nagarro\\studentdetail.csv";
		StoreData.read(csvFile);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student First Name and Last Name :\n");
		name = sc.next();
		EnglishStudent english = new EnglishStudent();
		english.Englishcal();
		
		ScienceStudent science = new ScienceStudent();
		science.sciencecal();
		
		MathsStudent maths = new MathsStudent();
		maths.mathscal();
		

}
}