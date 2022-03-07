import java.io.File;
import java.util.Date;

public class FileDemo {

	public static void main(String[] args) throws Exception {
		String path = "C:\\Users\\ashis\\Downloads\\peace-creative-uw1tUo7HzRI-unsplash.jpg";
		File file = new File(path);

		if (file.exists()) {
			System.out.println(file.getName());
			System.out.println(file.getCanonicalPath());
			System.out.println(file.getAbsolutePath());

			if (file.isFile()) {
				System.out.println(file.canRead());
				System.out.println(file.canWrite());
				System.out.println(file.canExecute());

				Date date = new Date(file.lastModified());
				System.out.println(date);

				System.out.println(file.length());
			} else {
				System.out.println("Contents of the directory: ");
				String[] content = file.list();
				for (String f : content)
					System.out.println(f);
			}
		} else {
			System.out.println("File doesn't exist.");
		}
	}
}
