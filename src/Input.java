import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Input {
    private final Integer citiesNumber;
    private final String startingPoint;
    private final List<Connection> connections = new ArrayList<>();

    public Input(String fileName) {
        File file = new File(fileName + ".txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String[] firstLine = br.readLine().split(" ");
            citiesNumber = Integer.parseInt(firstLine[0]);
            startingPoint = firstLine[1];

            String line;
            String[] splittedLine;
            while ((line = br.readLine()) != null) {
                splittedLine = line.split(" ");
                connections.add(new Connection(splittedLine[0], splittedLine[1], Integer.parseInt(splittedLine[2])));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Integer getCitiesNumber() {
        return citiesNumber;
    }

    public String getStartingPoint() {
        return startingPoint;
    }

    public List<Connection> getConnections() {
        return connections;
    }
}
