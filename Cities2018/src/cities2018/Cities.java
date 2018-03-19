package cities2018;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Cities 
{
Map<String,List<String>> provinces = new HashMap();
public Cities()
{
    List<String> list = new ArrayList();
    list.add("Elblag");
    provinces.put("Warminsko-Mazurskie",list);
    List<String> list2 = Arrays.asList("Gdansk","Sopot","Gdynia");
    provinces.put("Pomorskie",list2);
 
}
public Collection<String> provinces()
{
    return provinces.keySet();
}
public Collection<String> cities(String province)
{
    return provinces.get(provinces);
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
public static void main(String[] args)
{
    Cities l = new Cities();
    System.out.println(l.provinces);
}
}

