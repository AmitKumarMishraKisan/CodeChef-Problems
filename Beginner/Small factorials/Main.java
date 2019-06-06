import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(System.out);
			short T = Short.parseShort(br.readLine());
			while (T-- > 0) {
				int n = Integer.parseInt(br.readLine());
				pw.println(findFact(n));
			}
			pw.close();
			br.close();
		} catch (Exception e) {
		}
	}
	
	private static BigInteger findFact(int n) {
		BigInteger fact = new BigInteger("1");
		for(int num = 2; num <= n; num++) {
			fact = fact.multiply(new BigInteger(Integer.toString(num)));
		}
		return fact;
	}
}
