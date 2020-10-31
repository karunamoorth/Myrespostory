package myprograms;

import java.util.Comparator;

public class Mycomparator implements Comparator<Object> {
	

		@Override
		public int compare(Object arg0, Object arg1) {
			
			int a = (int) arg0;
			int b = (int) arg1;
			
			if(a<b)
			{
				return +1;
			}
			else if(a>b)
			{
				return -1;
			}
			else 
			{
			return 0;
			}
		}
		
	}

