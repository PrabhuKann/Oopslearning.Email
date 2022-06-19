import java.util.Random;

public class Main {
	static String sb() {
	String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%&";
	Random rnd = new Random();
	int len = 8;
	StringBuilder sb = new StringBuilder(len);
	for (int i = 0; i < len; i++)
		sb.append(chars.charAt(rnd.nextInt(chars.length())));
	return sb.toString();

}
}