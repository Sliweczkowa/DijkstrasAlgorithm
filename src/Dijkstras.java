import java.util.ArrayList;
import java.util.List;

public class Dijkstras {
    public static Integer dijkstars(Input input) {
        List<CityInfo> cityInfo = new ArrayList<>();

        // First city initialisation
        cityInfo.add(new CityInfo(input.getStartingPoint()));
        cityInfo.get(0).setMinDistance(0d);
        cityInfo.get(0).setVisited(true);

        // Remaining cities initialisation
        int iterator = input.getCitiesNumber() - 1;
        for (int i = iterator; i < input.getConnections().size(); i += iterator) {
            cityInfo.add(new CityInfo(input.getConnections().get(i).getCity1()));
            iterator--;
        }

        List<String> currentlyConnectedCities = new ArrayList<>();

        return null;
    }
}
