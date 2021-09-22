
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lukutaitovertailu {
    
    public static void main(String[] args) {
        List<Country> list = readToList("lukutaito.csv");
        // eka vaihtoehto
        /* list.sort((c1, c2) -> Double.compare(c1.getReadingRate(), c2.getReadingRate())); */
        /* list.forEach(System.out::println); */
        // toka vaihtoehto
        /* Comparator<Country> comp = Comparator
            .comparing(Country::getReadingRate);
        Collections.sort(list, comp);
        list.forEach(System.out::println); */
        //kolmas
        list.stream().sorted((c1, c2) -> {
            return c1.getReadingRate() > c2.getReadingRate() ? 1
            : c1.getReadingRate() < c2.getReadingRate() ? -1
            : 0; 
        }).forEach(System.out::println);
        
        
    }
    public static List<Country> readToList(String file) {
        try {
            return Files.lines(Paths.get(file))
                .map(line -> line.split(","))
                .map(parts -> new Country(parts[3], Integer.valueOf(parts[4]), parts[2].replace("(%)", "").trim(), Double.valueOf(parts[5])))
                .collect(Collectors.toList());
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
