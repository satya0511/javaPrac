package satya.prac.skillenza;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

public class noOfClassesPerDay implements Comparable<noOfClassesPerDay> {
	static int noOfDays;
	static int noOfSubs;
	static int count;
	public String subName;
	public LocalTime subStartTime;
	public LocalTime subEndTime;
	public long duration;
	
	public noOfClassesPerDay(String subName,LocalTime subStartTime,LocalTime subEndTime) {
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
        	Map<noOfClassesPerDay,Long> mp=new HashMap<>();
        	for(int j=0;j<noOfSubs;j++) {
        		String subName=sc.next();
        		String stTime=sc.next();
        		String[] stTm=stTime.split(":");
        		LocalTime st=LocalTime.of(Integer.parseInt(stTm[0]), Integer.parseInt(stTm[1]));
        		String endTime=sc.next();
        		String[] endTme=stTime.split(":");
        		LocalTime endt=LocalTime.of(Integer.parseInt(endTme[0]), Integer.parseInt(endTme[1]));
        		noOfClassesPerDay ncp=new noOfClassesPerDay(subName, st, endt);
        		
        		mp.put(ncp, ncp.duration);
     	    	}
        	Set keys=mp.keySet();
        	List<noOfClassesPerDay> list =new ArrayList<>();
        	int ind=0;
        	for(Object key:keys) {
        		noOfClassesPerDay ky=(noOfClassesPerDay) key;
        		System.out.println(ky.subName+"-"+ky.subStartTime.getHour()+":"+ky.subStartTime.getMinute()+"  "+ ky.subEndTime.getHour()+":"+ky.subEndTime.getMinute());
        		if(list.isEmpty()) {
        			list.add(ky);
        		}
        		LocalTime test=(list.get(list.size()-1).subStartTime.plusMinutes(list.get(list.size()-1).duration));
        		System.out.println(test);
        		if((ky.subStartTime.isAfter((list.get(list.size()-1).subStartTime)))&&ky.subStartTime.getHour()<24) {
        			list.add(ky);
        		}
        		System.out.println(list.get(ind));
        		ind++;
        		}
        	System.out.println(list.size());
        	}
        	
        	
        }
        


	/*@Override
	public int compareTo(noOfClassesPerDay ncp) {
		// TODO Auto-generated method stub
		int i=(int) (duration-ncp.duration);
		return ((i==0)?(subStartTime.compareTo(ncp.subStartTime)):i);
		
	}*/
	@Override
	public boolean equals(Object o) {
		noOfClassesPerDay np=(noOfClassesPerDay) o;
		
		return subName.equals(np.subName);
		
	}
	@Override
	public int hashCode() {
		return  (int) (duration*subStartTime.getHour());
	}

	@Override
	public int compareTo(noOfClassesPerDay o) {
		// TODO Auto-generated method stub
		return 0;
	}
    
   
}
