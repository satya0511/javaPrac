package satya.prac.DSnCollections;

public class josephus {
	
	int getjosephus(int n, int k)
	{
	  if (n == 1)
	    return 1;
	  else
	    /* The position returned by josephus(n - 1, k) is adjusted because the
	       recursive call josephus(n - 1, k) considers the original position 
	       k%n + 1 as position 1 */
		  	
	  System.out.println(n);
  	  System.out.println(k);	
  	  
  	  int temp=getjosephus(n - 1, k);
  	  System.out.println("temp in "+n+"'s call--"+temp);
  	  
  	  int temp2 = (temp+ k-1);
  	  int temp3 = n;
  	  System.out.println("temp2-"+temp2+"temp3-"+temp3);
  	  
  	  int temp4 = temp2%temp3;
  	  System.out.println("temp4-"+temp4);
		  
	  return temp4+1;  
	  // return (getjosephus(n - 1, k) + k-1	) % n + 1;
	}
	
	public static void main(String args[]){
		josephus j=new josephus();
		int i=j.getjosephus(5, 2);
		System.out.println(i);
	}
	
	
	
}
