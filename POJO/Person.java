import java.util.ArrayList;
import java.util.List;

public class Person {
    public static void main(String[] args) {
        PojoPerson obj = new PojoPerson();

        List<PojoPerson> list = new ArrayList<PojoPerson>();

        obj.setName("Pedro");
        obj.setLastname("Perez");
        list.add(obj);

        PojoPerson obj2 = new PojoPerson();
        obj2.setName("Juan");
        obj2.setLastname("Lopez");
        list.add(obj2);

        for( PojoPerson dto : list){
            System.out.println(dto.getName()+" "+dto.getLastname());
        }
    }
}
