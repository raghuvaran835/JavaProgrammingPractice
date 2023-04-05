package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionsExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {4,4,5,4,2,4,7,1,2,5,8,7,5};
		
		HashMap<Integer,Integer> hp=new HashMap<Integer,Integer>();
		
		
		
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			
			if(!hp.containsKey(a[i]))
			{
				for(int j=0;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
					}
				}
				
				hp.put(a[i],count);
			}
		}
		
		System.out.println(hp);
		
		
		
		
		

	}

}
