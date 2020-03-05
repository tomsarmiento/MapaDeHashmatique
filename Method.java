import java.util.HashMap;
import java.util.Set;
public class Method {
    public void method(){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Enter Sandman","Say your prayers little one. Don't forget, my son");
        trackList.put("Love Her Madly", "Don't you love her madly? Don't you need her badly?");
        trackList.put("The Unforgiven", "What I've felt. What I've known");
        trackList.put("FOR WHOM THE BELL TOLLS", "Make his fight on the hill in the early day");
        Set<String> keys = trackList.keySet();
        for(String key : keys){
            String list = key+": "+trackList.get(key);
            System.out.println(list);
        } 
    }
}