import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) throws Exception {
		Person p = new Person("Polo", 21);
		System.out.println(p);

		String path = "src/pers.dat";
		ObjectOutputStream oStream = null;
		ObjectInputStream iStream = null;

		// Serialization code
		oStream = new ObjectOutputStream(new FileOutputStream(path));
		oStream.writeObject(p); // Serializing object
		oStream.close();
		System.out.println("Objects are serialized.");

		// Deserialization code
		iStream = new ObjectInputStream(new FileInputStream(path));
		Object obj = iStream.readObject(); // Deserializing object
		System.out.println(obj);
		iStream.close();
	}
}
