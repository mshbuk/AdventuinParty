package pgdp.adventuin;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class AdventuinParty {
   public static Map<HatType, List <Adventuin>> groupByHatType(List<Adventuin> allAdventuins) {
         Map<HatType, List<Adventuin>> mapOfAdventuinsByHats = allAdventuins
                 .stream()
                 .collect(Collectors.groupingBy(Adventuin::getHatType));
         return mapOfAdventuinsByHats;
   }

   public static void printLocalizedChristmasGreetings(List<Adventuin> allAdventuins) {
         allAdventuins
                 .stream()
                 .sorted(Comparator.comparing(Adventuin::getHeight))
                 .forEach(adventuin -> System.out.println(adventuin
                         .getLanguage()
                         .getLocalizedChristmasGreeting(adventuin.getName())));

   }

   public static Map<HatType, List<Adventuin>> getAdventuinsWithLongestNamesByHatType(List<Adventuin> allAdventuins) {
      Map<HatType, List<Adventuin>> mapOfAdventuinsWithLongestNamesByHatType = new HashMap<>();
      int longestName = allAdventuins
              .stream()
              .max(Comparator.comparing(x -> x
                              .getName()
                              .length()))
              .get()
              .getName()
              .length();
       for (Map.Entry<HatType, List<Adventuin>> entry : groupByHatType(allAdventuins).entrySet()) {
           HatType adventuin = entry.getKey();
           List<Adventuin> namesOfPenguinsWithLongestName = entry.getValue();
           mapOfAdventuinsWithLongestNamesByHatType
                   .put(adventuin, namesOfPenguinsWithLongestName
                           .stream()
                           .filter(element -> element.getName().length() == longestName)
                           .collect(Collectors.toList()));
       }
       return mapOfAdventuinsWithLongestNamesByHatType;
   }

}
