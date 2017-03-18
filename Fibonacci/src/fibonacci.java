import java.util.Scanner;

public class fibonacci
{
  public static void main(String[] args)
  {
	  
	  int n;
	  
	  System.out.println("Ile liczb Fibonacciego mam wyznaczyc: ");
	  Scanner in = new Scanner(System.in);
	  n = in.nextInt();
	  
	  long [] fib = new long [n];
	  
	  fib[0]=1;
	  fib[1]=1;
	  
	  for (int i=2; i<n; i++)
	  {
		  fib[i] = fib[i-1] + fib[i-2];
	  }
	  
	  for (int i=0; i<n; i++)
	  {
		  System.out.println("wyraz nr"+ (i+1) + ": " + fib[i]);
	  }
	  
	  
  }
}