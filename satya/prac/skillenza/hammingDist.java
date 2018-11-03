package satya.prac.skillenza;

import java.util.*;

class hammingDist {

 	static int count;
 	static int limitThreshhold;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int n = 0; n < t; n++) { 
            Integer[] ecd=new Integer[3];
            for(int m=0;m<3;m++){
            	ecd[m]=sc.nextInt();
            }
            int noOfemp=ecd[0];
            int noOfChar=ecd[1];
            int threshHold=ecd[2];
            limitThreshhold=threshHold;
            List<List<Integer>> empList=new ArrayList<List<Integer>>();
            for(int emp=0;emp<=noOfemp;emp++) {
            	List<Integer> empChar=new ArrayList<Integer>();
            	for(int chr=0;chr<noOfChar;chr++) {
            		
            		empChar.add(sc.nextInt());
                 	}
            	empList.add(empChar);
            }
            List empQ=empList.get(0);
            System.out.println(empQ);
            for(int cmp=1;cmp<noOfemp+1;cmp++) {
            	System.out.println(empList.get(cmp));
            	int nmb= hammingDist(empQ,empList.get(cmp));
            	if(nmb<=threshHold) {
            		count++;
            	}
            }
            	
            System.out.println(count);
            count=0;
        }

    }
    
    static int  hammingDist(List str1, List str2)
    {
        int i = 0 ,cnt=0,smCnt=0,df=0;
        while (i < str1.size())
        {
            if (str1.get(i) != str2.get(i)){
                cnt++;
            }
            else{
                smCnt++;
                //df=str1.size()-smCnt;
            }
            if(smCnt>=limitThreshhold){
                System.out.println(limitThreshhold +"--"+smCnt);
                return limitThreshhold;
               // break;
            }
            i++;
        }
        return cnt;
    } 
}