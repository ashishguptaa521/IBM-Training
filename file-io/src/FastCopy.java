import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FastCopy {
	public static void main(String[] args) {
		FileInputStream inFile = null;
		FileOutputStream outFile = null;
		BufferedInputStream inBuffer = null;
		BufferedOutputStream outBuffer = null;

		try {
			inFile = new FileInputStream("C:\\Users\\ashis\\Downloads\\02 Payphone (feat. Wiz Khalifa).m4a"); // 8 MB
																												// approx
																												// 68 ms
			outFile = new FileOutputStream("C:\\Users\\ashis\\Downloads\\03 Payphone-copy.m4a");
			inBuffer = new BufferedInputStream(inFile, 1024 * 32); // Creating 16kb buffers
			outBuffer = new BufferedOutputStream(outFile, 1024 * 32);

			System.out.println("Copying file...");
			int ch = 0;
			long ms1 = System.currentTimeMillis();
			while (true) {
				ch = inBuffer.read();
				if (ch == -1)
					break;
				outBuffer.write(ch);
			}
			long ms2 = System.currentTimeMillis();
			System.out.println("File succesfully copied by buffer copying in " + (ms2 - ms1) + " miliseconds.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				inBuffer.close();
				outBuffer.close();
				inFile.close();
				outFile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
