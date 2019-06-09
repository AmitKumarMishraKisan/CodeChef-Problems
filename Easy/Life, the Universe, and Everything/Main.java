import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter printer = new PrintWriter(System.out);
    	String input = br.readLine();
    	while(Integer.parseInt(input) != 42) {
    		printer.println(input);
    		input = br.readLine();
    	}
    	printer.close();
    	br.close();
    }
}
