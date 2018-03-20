package cities2018;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class cities 
{
Map<String,List<String>> provinces = new HashMap();
public cities()
{
    List<String> list = new ArrayList();
    list.add("Elblag");
    list.add("Braniewo");
    provinces.put("Warminsko-Mazurskie",list);
    List<String> list4 = Arrays.asList("Szczecin");
    provinces.put("Zachodnio-pomorskie",list4);
    List<String> list2 = Arrays.asList("Gdansk","Sopot","Gdynia");
    provinces.put("Pomorskie",list2);
    List<String> list3 = Arrays.asList("Warszawa");
    provinces.put("Mazowieckie",list3);
 
}
public Collection<String> provinces()
{
   return provinces.keySet();
}
public List<String> cities(String province)
{
 return provinces.get(province);
}
public String ktoreMiasto(String province,int n)
{
    List<String> pom = new ArrayList();
    pom.addAll(provinces.get(province));
    return pom.get(n);
}
public Map<String,String> provinceWithOneCity()
{
    Map<String,String> one = new HashMap();
    for(String key : provinces.keySet())
    {
        if(provinces.get(key).size()==1)
        {
            one.put(key,ktoreMiasto(key,0));
        }
    }
    return one;
}
public Collection<String> cities()
{
    List<String> m = new ArrayList();
    for(String key : provinces.keySet())
    {
       m.addAll(provinces.get(key));
    }
    return m;
}
public int dodatkowa(String key)
{
    return provinces.get(key).size();
}
}
