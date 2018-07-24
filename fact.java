//FACTORIAL
class fact

{
	public static void main(String args[])
	{
		int i ,n,fact=1;
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("enter :");
		for (i=1;i<=n;i++)
		{
			fact=fact*i;
		}
	System.out.println("factorial of a given number is :" + fact);
}
}