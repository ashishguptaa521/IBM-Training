import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {
	public static void main(String[] args) {

		Locale HINDI = new Locale("hi");

		// ResourceBundle bundle = ResourceBundle.getBundle("msgs", Locale.FRENCH);
		ResourceBundle bundle = ResourceBundle.getBundle("msgs", HINDI);
		System.out.println(bundle.getString("greeting"));
		System.out.println(bundle.getString("message"));
	}
}
