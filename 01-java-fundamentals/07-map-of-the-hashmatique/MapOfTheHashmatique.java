import java.util.HashMap;
import java.util.Set;

public class MapOfTheHashmatique{
    public static void main(String[] args) {

        HashMap<String, String> titleTrackList = new HashMap<String, String>();
        titleTrackList.put("War Pigs","Generals gathered in their masses, Just like witches at black masses, Evil minds that plot destruction, Sorcerers of death's construction");
        titleTrackList.put("Back In Black","Back in black, I hit the sack, I've been too long, I'm glad to be back, Yes, I'm let loose, From the noose, That's kept me hanging about");
        titleTrackList.put("The Beautiful People","And I don't want you and I don't need you Don't bother to resist, or I'll beat you It's not your fault that you're always wrong The weak ones are there to justify the strong");
        titleTrackList.put("You've Got Another Thing Coming", "One life I'm gonna live it up I'm takin' flight, I said, 'I'll never get enough' Stand tall I'm young and kind of proud I'm on the top, but as long as the music's loud");

        String name = titleTrackList.get("Back In Black");
        System.out.println(name);

        Set<String> keys = titleTrackList.keySet();
        for(String key: keys){
            System.out.println(key + ": " + titleTrackList.get(key));
        }
    }
}
