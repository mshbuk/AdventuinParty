package pgdp.adventuin;

import java.util.*;
import java.util.stream.Collectors;

public final class AdventuinParty {
    public static Map<HatType, List<Adventuin>> groupByHatType(List<Adventuin> allAdventuins) {
        Map<HatType, List<Adventuin>> mapOfAdventuinsByHats = allAdventuins
                .stream()
                .collect(Collectors.groupingBy(Adventuin::getHatType));
        return mapOfAdventuinsByHats;
    }

    public static void printLocalizedChristmasGreetings(List<Adventuin> allAdventuins) {
        if(!allAdventuins.isEmpty()) {
            allAdventuins
                    .stream()
                    .sorted(Comparator.comparing(Adventuin::getHeight))
                    .forEach(adventuin -> System.out.println(adventuin.getLanguage()
                            .getLocalizedChristmasGreeting(adventuin.getName())));
        }

    }

    public static Map<HatType, List<Adventuin>> getAdventuinsWithLongestNamesByHatType(List<Adventuin> allAdventuins) {
        Map<HatType, List<Adventuin>> mapOfAdventuinsWithLongestNamesByHatType = new HashMap<>();
        for (Map.Entry<HatType, List<Adventuin>> entry : groupByHatType(allAdventuins).entrySet()) {
            HatType adventuin = entry.getKey();
            List<Adventuin> namesOfPenguinsWithLongestName = entry.getValue();
            int longestName = allAdventuins
                    .stream()
                    .max(Comparator.comparing(x -> x
                            .getName()
                            .length()))
                    .get()
                    .getName()
                    .length();
            mapOfAdventuinsWithLongestNamesByHatType
                    .put(adventuin, namesOfPenguinsWithLongestName
                            .stream()
                            .filter(element -> element.getName().length() == longestName)
                            .collect(Collectors.toList()));

        }
        return mapOfAdventuinsWithLongestNamesByHatType;
    }

    public static Map<Integer, Double> getAverageColorBrightnessByHeight(List<Adventuin> allAdventuins) {
        Map<Integer, Double> map = new HashMap<>();
      return  map;
    }
    public static Map<HatType, Double> getDiffOfAvgHeightDiffsToPredecessorByHatType (List<Adventuin> allAdventuins){
        return null;
    }

}

