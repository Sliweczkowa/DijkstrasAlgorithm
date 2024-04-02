import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class Dijkstras {
    public static Integer dijkstars(Input input) {
        List<CityInfo> cityInfo = new ArrayList<>();

        // Cities initialisation
        for (Connection connection : input.getConnections()) {
            boolean isPresentCity1 = false;
            boolean isPresentCity2 = false;
            for (CityInfo connectionCityInfo : cityInfo) {
                if (connection.getCity1().equals(connectionCityInfo.getCityName())) {
                    isPresentCity1 = true;
                }
                if (connection.getCity2().equals(connectionCityInfo.getCityName())) {
                    isPresentCity2 = true;
                }
            }
            if (!isPresentCity1) {
                cityInfo.add(new CityInfo(connection.getCity1()));
            }
            if (!isPresentCity2) {
                cityInfo.add(new CityInfo(connection.getCity2()));
            }
        }

        // CityId - CityName bidirectional map
        BiMap<Integer, String> cities = HashBiMap.create();
        for (int i = 0; i < cityInfo.size(); i++) {
            cities.put(i, cityInfo.get(i).getCityName());
        }

        // First city as starting point
        cityInfo.get(cities.inverse().get(input.getStartingPoint())).setMinDistance(0d);
        cityInfo.get(cities.inverse().get(input.getStartingPoint())).setVisited(true);

        List<String> currentlyConnectedCities = new ArrayList<>();

        return null;
    }
}
