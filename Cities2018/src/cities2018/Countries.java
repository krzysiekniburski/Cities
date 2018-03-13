
package cities2018;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
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
    public Collection<String> capitals()
    {
        return countries.values();
    }
    public Collection<String> countries()
    {
        return countries.keySet();
    }
    public Collection<String> sortedCapitals()
    {
        TreeSet nowa = new TreeSet();
        nowa.addAll(capitals());
        return nowa;
    }
    public Collection<String> sortedCountries()
    {
        TreeSet nowa = new TreeSet();
        nowa.addAll(countries());
        return nowa;
    }
    public Map<String,String> sortedByCapitals()
    {
        TreeMap nowa = new TreeMap(countries);
        return nowa;
    }
    public Map<String,String> sortedByCountries()
    {
        Map<String,String> map = new TreeMap();
        for(String key : countries.keySet())
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
    public static void main(String[] args){
        Countries c = new Countries();
        System.out.println(c);
        System.out.println(c.capitals());
        System.out.println(c.countries());
        System.out.println(c.sortedCapitals());
        System.out.println(c.sortedCountries());
        System.out.println(c.sortedByCapitals());
        System.out.println(c.sortedByCountries());
        
    }
}
