package java_excercise_programs;

public class FirstProgram {
	
	public int fact(int n)
	{
		int ans;
		if(n==1 || n==0)
		{
			return 1;
		}
		else
		{
			ans= n * fact(n-1);
		}
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstProgram fp=new FirstProgram();
		System.out.println(fp.fact(5));
		
		
//		for(int i=0;i<=127;i++)
//		{
//			System.out.println(i+" "+(char)i);
//			
////			System.out.printf("%d : %c \n",i,i);
//		}

	}

}
