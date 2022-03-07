import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		String path = "src/payphone.txt";
		BufferedReader reader = null;
		String line = null;

		try {
			FileReader fr = new FileReader(path); // Opening file stream
			reader = new BufferedReader(fr); // Wrapping buffer around it

			while (true) {
				line = reader.readLine(); // Reads a line from buffer
				if (line == null) // EOF
					break;
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader == null)
					reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
