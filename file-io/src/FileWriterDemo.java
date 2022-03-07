import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) {
		String path = "src/Payphone.txt";
		BufferedWriter writer = null;

		try {
			writer = new BufferedWriter(new FileWriter(path));
			writer.write("If happy ever afters did exist");
			writer.newLine();
			writer.write("I would still be holding you like this;");
			writer.newLine();
			writer.write("And all those fairy tales are full of shit");
			writer.newLine();
			writer.write("One more fucking love song I'll be sick;");
			writer.newLine();
			writer.write("Oooh I'm at a payphone...");
			System.out.println("Writing to files is completed.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
