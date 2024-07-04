import java.util.Scanner;

public class Demo {
	
	
	
	public int add(int a, int b){		
		int c=a+b;
		System.out.println("sum = " +c);		
		return c;
	}
	
	public int sub(int a,int b)
	{
		int c =a-b;
		System.out.println("Difference = " +c);
		return c;	
	}
	
	public int mul (int a, int b) {
		int c= a*b;
		System.out.println("Multiplication result= " +c);
		return c;
	}
	
	public int div (int a, int b) {
		int c= a/b;
		System.out.println("Division result= " +c);
		return c;
	}
	
	public static void main(String[] args) {
		Demo obj =new Demo();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Value for X1 \n ");
		int x1= sc.nextInt();
		System.out.println("Enter value for X2 \n");		
		int x2= sc.nextInt();
		int sum = obj.add(x1, x2);
		System.out.println("Enter value for X3\n");
		int x3 = sc.nextInt();
		int diff =obj.sub(sum,x3);
		System.out.println("Enter value for X4\n");
		int x4 =sc.nextInt();
		int sum2= obj.add(diff, x4);
		System.out.println("Enter value for X5\n");
		int x5 =sc.nextInt();
		int mul = obj.mul(sum2,x5);
		System.out.println("Enter value for X6\n");
		int x6 =sc.nextInt();	
		int div =obj.div(mul,x6);
				
			// TODO Auto-generated method stub
	}

}
