package satya.prac.skillenza;
import java.util.*;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

class solution implements Comparable<solution> {
	static int noOfDays;
	static int noOfSubs;
	static int count;
	public String subName;
	public LocalTime subStartTime;
	public LocalTime subEndTime;
	public long duration;
	
	public solution(String subName,LocalTime subStartTime,LocalTime subEndTime) {
		this.subName=subName;
		this.subStartTime=subStartTime;
		this.subEndTime=subEndTime;
		this.duration=Duration.between(subStartTime, subEndTime).toMinutes();
			
		}
 	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        noOfDays=sc.nextInt();
        for(int i =0;i<noOfDays;i++) {
        	count=0;
        	noOfSubs=sc.nextInt();
        	Map<solution,Long> mp=new HashMap<>();
        	for(int j=0;j<noOfSubs;j++) {
        		String subName=sc.next();
        		String stTime=sc.next();
        		String[] stTm=stTime.split(":");
        		LocalTime st=LocalTime.of(Integer.parseInt(stTm[0]), Integer.parseInt(stTm[1]));
        		String endTime=sc.next();
        		String[] endTme=endTime.split(":");
        		LocalTime endt=LocalTime.of(Integer.parseInt(endTme[0]), Integer.parseInt(endTme[1]));
        		solution ncp=new solution(subName, st, endt);
        		//System.out.println(ncp.subName+"--"+ncp.subStartTime+"---"+ncp.subEndTime+"---"+ncp.duration);
        		mp.put(ncp, ncp.duration);
     	    	}
        	Set keys=mp.keySet();
        	List<solution> list =new ArrayList<>();
        	int ind=0;
        	for(Object key:keys) {
        		solution ky=(solution) key;
        	    System.out.println(ky.subName+"-"+ky.subStartTime.getHour()+":"+ky.subStartTime.getMinute()+"  "+ ky.subEndTime.getHour()+":"+ky.subEndTime.getMinute());
        		if(list.isEmpty()) {
        			list.add(ky);
        		}
        		LocalTime testTime=(list.get(list.size()-1).subStartTime.plusMinutes(list.get(list.size()-1).duration));
        		if((ky.subStartTime.isAfter(testTime))&&ky.subStartTime.getHour()<24) {
        		   // System.out.println(testTime);
        			list.add(ky);
        		}
        		if(ind<list.size()){
        		System.out.println(list.get(ind).subName);
        		ind++;}
        		}
        	System.out.println(list.size());
        	 //	count++;
        	//System.out.println(count);
        }
        
    }

	@Override
	public int compareTo(solution ncp) {
		// TODO Auto-generated method stub
		//return  (subStartTime.compareTo(ncp.subStartTime));
		//return (int) (duration-ncp.duration);
		int i=(subStartTime.compareTo(ncp.subStartTime));
		return ((i==0)?(int) (duration-ncp.duration):i);
	}
	@Override
	public boolean equals(Object o) {
		solution np=(solution) o;
		
		return subName.equals(np.subName);
		
	}
	@Override
	public int hashCode() {
	    return  (int) (duration*subStartTime.getHour());
	}
    
   
}