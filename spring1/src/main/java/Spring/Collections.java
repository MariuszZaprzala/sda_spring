package Spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

    private Set<String> set1;
    private List<String> list1;
    private Map<Integer,String> map1;

    public Map<Integer, String> getMap1() {
       // System.out.println("Mapa elementow "+ map1);
        return map1;
    }

    public void setMap1(Map<Integer, String> map1) {
        this.map1 = map1;
    }

    public Set<String> getSet1() {
        return set1;
    }

    public void setSet1(Set<String> set1) {
        this.set1 = set1;
    }

    public List<String> getList1() {
        return list1;
    }

    public void setList1(List<String> list1) {
        this.list1 = list1;
    }



    public Collections() {
    }


}
