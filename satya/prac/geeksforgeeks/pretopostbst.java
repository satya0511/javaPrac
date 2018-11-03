package satya.prac.geeksforgeeks;

import java.io.*;

class pretopostbst {
	
	public static void printPostFromPre (int [] preOrder) {
		
		//
		
		//for(int i=0;i<preOrder.length;i++){
		    //int size = sc.nextInt();
			
		    //int arr[]=new int[1000];
		    int size =preOrder.length;
		    pretopostbst c = new pretopostbst();
		    int check=c.postorder(preOrder,0,size-1);
		    if(check==0){System.out.print("Not a bst");}
		    System.out.println();
		//}
	}
	
	int postorder(int[] arr,int start,int end){
	    if(start==end){
	    	
	        System.out.print(arr[start]+" ");
	        return 1;
	    }
	    int start1=start;
	    if(arr[start+1]<arr[start]){
	    start1=start+1;}
	    while(start1<end){
	        if(arr[start1+1]<arr[start]){
	        start1++;
	        }
	        else{
	            break;
	        }
	    }
	    int check=start1+1;
	    while(check<=end){
	        if(arr[check]<=arr[start]){
	            return 0;
	        }
	        else{check++;}
	    }
	    int lcheck=1,rcheck=1;
	    if(start1!=start){
	       lcheck= postorder(arr,start+1,start1);
	    }
	    if(start1!=end){
	       rcheck= postorder(arr,start1+1,end);
	    }
	    if(lcheck==1&&rcheck==1){
	    
	    System.out.print(arr[start]+" ");}
	    else{
	        return 0;}
	    return 1;
	}

	public static void main(String[] args){
		
		int [] preOrder={7,9,6,1,4,2,3,40};
		
		printPostFromPre(preOrder);
		
	
	}	
}