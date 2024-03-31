public class CityInfo {
    private final String cityName;
    private String previousCity;
    private Double minDistance;
    private Boolean isVisited;

    public CityInfo(String cityName) {
        this.cityName = cityName;
        this.previousCity = null;
        this.minDistance = Double.POSITIVE_INFINITY;
        this.isVisited = false;
    }

    public String getCityName() {
        return cityName;
    }

    public String getPreviousCity() {
        return previousCity;
    }

    public Double getMinDistance() {
        return minDistance;
    }

    public Boolean getVisited() {
        return isVisited;
    }

    public void setPreviousCity(String previousCity) {
        this.previousCity = previousCity;
    }

    public void setMinDistance(Double minDistance) {
        this.minDistance = minDistance;
    }

    public void setVisited(Boolean visited) {
        isVisited = visited;
    }
}
