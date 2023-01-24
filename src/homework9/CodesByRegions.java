package homework9;
import java.util.*;

// Custom Comparator to sort the map according to the natural ordering of its values
class CustomComparator<K,V extends Comparable> implements Comparator<K>
{
    private Map<K, V> map;

    public CustomComparator(Map<K, V> map) {
        this.map = new HashMap<>(map);
    }

    @Override

    public int compare(K s1, K s2) {
        return map.get(s1).compareTo(map.get(s2));
    }
}

class Main
{
    // Generic method to sort map by values using `TreeMap`
    public static <K, V> Map<K, V> sortByValues(Map<K, V> map)
    {
        Comparator<K> comparator = new CustomComparator(map);

        Map<K, V  > sortedMap = new TreeMap<>(comparator);
        sortedMap.putAll(map);

        return sortedMap;
    }

    public static void main(String[] args)
    {
        Map<String, String> codesAndRegions = new HashMap<>();

        codesAndRegions.put("37341", "Mirgorod");
        codesAndRegions.put("42960", "Sumy");
        codesAndRegions.put("65125", "Odessa");
        codesAndRegions.put("61001", "Kharkiv");
        codesAndRegions.put("08433", "Kyiv");
        codesAndRegions.put("20130", "Uman");
        codesAndRegions = sortByValues(codesAndRegions);

        System.out.println("Sorted map by values: " + codesAndRegions);
    }
}