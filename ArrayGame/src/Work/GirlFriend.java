package Work;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
 
public class GirlFriend{
  public static void main(String[] args) throws Exception
  {
	Scanner a = new Scanner(System.in);
	String start = a.nextLine();
	

	SimpleDateFormat formatter = new SimpleDateFormat ( "yyyyMMdd");
	Date currentTime = new Date ( );
	String dTime = formatter.format ( currentTime );
	
    System.out.println(diffOfDate(start, dTime));
  }
 
  public static long diffOfDate(String begin, String end) throws Exception
  {
    SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
 
    Date beginDate = formatter.parse(begin);
    Date endDate = formatter.parse(end);
 
    long diff = endDate.getTime() - beginDate.getTime();
    long diffDays = diff / (24 * 60 * 60 * 1000);
 
    return diffDays;
  }
}