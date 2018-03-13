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
public Map<String,String> provinceWithOneCity()
{
    return null;
}
public Collection<String> cities()
{
    return null;
}
public static void main(String[] args)
{
    Cities l = new Cities();
    System.out.println(l.provinces);
}
}

