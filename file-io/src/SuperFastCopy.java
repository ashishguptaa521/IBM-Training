import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class SuperFastCopy {
	public static void main(String[] args) {

		FileInputStream inFile = null;
		FileOutputStream outFile = null;
		FileChannel inChannel = null;
		FileChannel outChannel = null;

		try {
			inFile = new FileInputStream("C:\\Users\\ashis\\Downloads\\02 Payphone (feat. Wiz Khalifa).m4a"); // 8 MB
																												// approx
																												// 12 ms
			outFile = new FileOutputStream("C:\\Users\\ashis\\Downloads\\03 Payphone-copy.m4a");
			inChannel = inFile.getChannel();
			outChannel = outFile.getChannel();
			ByteBuffer buffer = ByteBuffer.allocate(1024 * 16); // Creating 16 KB common buffer in JVM
			long ms1 = System.currentTimeMillis();

			while (true) {
				int count = inChannel.read(buffer);
				if (count == -1)
					break;
				buffer.flip(); // Placing cursor back to the start of the buffer
				outChannel.write(buffer);
				buffer.clear();
			}
			long ms2 = System.currentTimeMillis();
			System.out.println("File succesfully copied by buffer copying in " + (ms2 - ms1) + " miliseconds.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				inChannel.close();
				outChannel.close();
				inFile.close();
				outFile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
