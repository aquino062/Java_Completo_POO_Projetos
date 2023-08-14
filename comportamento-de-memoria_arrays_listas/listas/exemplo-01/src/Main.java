import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(3, 31);
        list.remove(1);

        System.out.println(list.size());

        for (int x : list) {
            System.out.println(x);
        }

        System.out.println("------------------------");

        List<String> listB = new ArrayList<>();

        listB.add("ana");
        listB.add("maria");
        listB.add("maicon");
        listB.add("paulo");
        listB.add("fernando");

        //encontro o primeiro elemento que atende ao predicato se não existir retorna nulo
        String name = listB.stream().filter(x -> x.charAt(0) == 'm').findFirst().orElse(null);
        System.out.println(name);

        System.out.println("------------------------");

        listB.removeIf(x -> x.charAt(0) == 'm');

        for (String x : listB) {
            System.out.println(x);
        }

        System.out.println("---------------");

        System.out.println("Index of fernando: " + listB.indexOf("fernando"));

        //cria uma nova lista e filtra elementos que começa com a
        List<String> result = listB.stream().filter(x -> x.charAt(0) == 'a').collect(Collectors.toList());

        for (String x : result) {
            System.out.println(x);
        }

    }
}
