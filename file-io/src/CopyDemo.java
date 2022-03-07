import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {
	public static void main(String[] args) {
		FileInputStream inFile = null;
		FileOutputStream outFile = null;
		try {
			inFile = new FileInputStream("C:\\Users\\ashis\\Downloads\\02 Payphone (feat. Wiz Khalifa).m4a"); // 8 MB
																												// approx
																												// 24869
																												// ms
			outFile = new FileOutputStream("C:\\Users\\ashis\\Downloads\\02 Payphone-copy");
			System.out.println("Copying file...");
			int ch = 0;
			long ms1 = System.currentTimeMillis();
			while (true) {
				ch = inFile.read();
				if (ch == -1)
					break;
				outFile.write(ch);
			}
			long ms2 = System.currentTimeMillis();
			System.out.println("File succesfully copied in " + (ms2 - ms1) + " miliseconds.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				inFile.close();
				outFile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
