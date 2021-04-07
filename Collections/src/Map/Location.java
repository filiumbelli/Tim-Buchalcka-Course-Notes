package Map;

import java.util.HashMap;
import java.util.Map;

public class Location {

    private final int locationId;
    private final String description;
    private final Map<Integer ,String> locationExit = new HashMap();

    public Location(int locationId, String description) {
        this.locationId = locationId;
        this.description = description;
    }

    public void addLocation(int id,String desc){
        locationExit.put(id,desc);
    }

    public Map<Integer, String> getLocationExit() {
        return new HashMap<Integer,String>(locationExit);
    }
}
