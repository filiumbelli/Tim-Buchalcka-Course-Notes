package Map;

import java.util.HashMap;
import java.util.Map;

public class AdventureGame {
    private static Map<Integer,Location> locations = new HashMap<>();
    public static void main(String[] args) {
        locations.put(0,new Location(0,"Computer side"));
        locations.put(2,new Location(2,"Forest"));
        locations.put(1,new Location(1,"Highway"));
        locations.put(3,new Location(3,"Homew sweeet home"));
        locations.put(4,new Location(4,"Dark cave/ a Hill"));

    }
}
