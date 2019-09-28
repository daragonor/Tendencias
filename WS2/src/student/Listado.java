package student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Listado {

	private static String[] lastNames= {"Perez","Juarez","Burga","Penaranda"};
	private static String[] firstNames= {"Luis","Maria","Jorge","Janet"};
	
public String listar() {
	List<student> studentList = new ArrayList<>();

	Random random= new Random();
	
	for(int i=0;i<=3;i++)
	{
		String tempFirstName= firstNames[random.nextInt(firstNames.length)];
		String tempLastName= lastNames[random.nextInt(lastNames.length)];
		
		int age= 18+random.nextInt(20);
		
		student tempstudent= new student(tempLastName, tempFirstName, age);
		studentList.add(tempstudent);
	}
	String cadena = "";
	for(student temp: studentList) {
		cadena= cadena+temp;
	}
	return cadena;
}
	
}
