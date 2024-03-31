public class Connection {
    private final String city1;
    private final String city2;
    private final Integer distance;

    public Connection(String city1, String city2, Integer distance) {
        this.city1 = city1;
        this.city2 = city2;
        this.distance = distance;
    }

    public String getCity1() {
        return city1;
    }

    public String getCity2() {
        return city2;
    }

    public Integer getDistance() {
        return distance;
    }
}
