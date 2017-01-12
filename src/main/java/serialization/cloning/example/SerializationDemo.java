package serialization.cloning.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEname("name1");
		employee.setEid("eid1");
		employee.setDesignation("designation1");
		System.out.println(employee);
		try {
			FileOutputStream fileOut = new FileOutputStream( "employee.txt" );
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(employee);
			out.close();
			fileOut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
