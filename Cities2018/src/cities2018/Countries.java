package cities2018;
import static java.lang.reflect.Array.set;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
public class Countries {
    private Map<String,String> countries = new HashMap();
   
    public Countries(){
        countries.put("Poland", "Warsaw");
        countries.put("Germany", "Berlin");
        countries.put("Russia", "Moscow");
        countries.put("Great Britan", "London");
        countries.put("France", "Paris");
        countries.put("Spain", "Madrid");
            
    }
    
    public Map <String,String> sortedByCountries()
    {
      TreeMap map = new TreeMap();
      map.putAll(countries);
      return map;
    }
     public Map <String,String> sortedByCapitals()
    {
       Map<String,String> map = new TreeMap();
       for(String key: countries.keySet())
       {
           String value = countries.get(key);
           map.put(value,key);
       }
       return map;
    }
    @Override
    public String toString(){
        return countries.toString();
    }
    public Collection<String> capitals()
    {
        return countries.values();
    }
    public Collection<String> countries()
    {
       return countries.keySet() ; 
    }
    public Collection<String> sortedCapitals()
    {
    TreeSet set = new TreeSet();
    set.addAll(countries.values());
    return set;
    }
    public Collection<String> sortedCountries()
    {
    TreeSet set = new TreeSet();
    set.addAll(countries());
    return set;
    }
   
    public static void main(String[] args){
        Countries c = new Countries();
        cities a = new cities();
        /*System.out.println(c);
        System.out.println(c.capitals());
        System.out.println(c.sortedCountries());
        System.out.println(c.sortedCapitals());
        System.out.println(c.sortedByCountries());
        System.out.println(c.sortedByCapitals()); */
        System.out.println(a.provinces); 
        System.out.println(a.cities("Pomorskie"));
        System.out.println(a.dodatkowa("Mazowieckie")); 
        System.out.println(a.cities());
        System.out.println(a.ktoreMiasto("Pomorskie",1));
        System.out.println(a.provinceWithOneCity());
    }
}
