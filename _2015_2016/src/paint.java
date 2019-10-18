import java.util.*;
import java.io.*;
public class paint {
	static Scanner in;
	static PrintWriter out;
	static int a, b, c, d, e, f, count;
	static boolean[] s;
	public static void main(String[] args) throws IOException {
		in = new Scanner(new File("paint.in"));
		out = new PrintWriter(new File("paint.out"));
		init();
		solve();
		in.close();
		out.close();
	}
	public static void init() {
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		s = new boolean[11]; 
		e = 0;
		f = 0;
		count = 0;
	}
	public static void solve() {
		for(int i = a; i < b; i++) {
			s[i] = true;
		}
		for(int i = c; i < d; i++) {
			s[i] = true;
		}
		for(int i = 0; i < 11; i++) {
			if(s[i] == true) {
				count++;
			}
		}
		out.println(count);
	}
}
