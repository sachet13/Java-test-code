import java.text.*;
import java.util.Date;
class timeconvert{
    public static void main(String[] args) {
        try{
        String time12="06:40:12 PM";
        String tconvert;
        SimpleDateFormat datef=new SimpleDateFormat("hh:mm:ss a");
        Date d=datef.parse(time12);
        
        SimpleDateFormat hour24=new SimpleDateFormat("HH:mm:ss");
        
        tconvert=hour24.format(d);

        System.out.println("Input Time: "+time12+" Converted Time To 24 Hours: "+tconvert);
        }catch(Exception e){
            System.out.println("Exception: "+e);
        }
    }
}