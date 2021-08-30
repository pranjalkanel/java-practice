package serializer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ASerializer {
	
	/*To make a Java object serializable we implement 
	 * the java.io.Serializable interface.
	 * 
	 * Only non-static data members are saved via Serialization process.
	 * 
	 *  Associated objects must be implementing Serializable interface*/
	public static void main(String[] args) {
		
		new ASerializer().serialize();
		new ASerializer().deserialize();
		
	}
	
	public void serialize() {
		try {
			Model obj = new Model("Pranjal", 1, 18000, "9861367460");
			
			// file outputstream generates a text file with byte stream serialized
			FileOutputStream fos = new FileOutputStream("modelinfo.txt");
			// object outputstream serializes the data 
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(obj);
			oos.flush();
			oos.close();
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
	
	public void deserialize() {
		try {
			// file input steram reads the serialized data
			FileInputStream fis = new FileInputStream("D:/Post College/Java/java-practice/modelinfo.txt");
            // object input stream reads the serialized data
			ObjectInputStream ois = new ObjectInputStream(fis);
            Model obj= (Model)ois.readObject();
            
            // printing the serialized data
            System.out.println(obj.name);
            System.out.println(obj.id);
            System.out.println(obj.salary);
            System.out.println(obj.contact);
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
