package ChromeBrowser;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Stream {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Anne");
        names.add("Anja");
        names.add("Berta");
        names.add("Christoph");
        names.add("Albert");
        names.add("Adam");
        int count = 0;

        for (int i =0; i<names.size(); i++){
            if (names.get(i).startsWith("A")){
                count++;
            }
        }
        System.out.println(count);

        Long num = names.stream().filter(name -> name.startsWith("A")).count();
        System.out.println(num);

        java.util.stream.Stream.of("Anne", "Anja", "Adam", "Berta", "Christoph").filter(name ->
        {
            name.startsWith("A");
            return true;
        }).count();

        names.stream().filter(n -> n.length()<4).limit(1).forEach(s -> System.out.println(s));
        names.stream().filter(n -> n.endsWith("a")).map(s-> s.toUpperCase()).forEach( d -> System.out.println(d));

        //convert Arrays to ArrayList Arrays.asList

        List<String> newNames = Arrays.asList("Bertram", "Robert", "Lisa", "Samuel", "Yoav", "Ram");
        newNames.stream().sorted().map(s -> s.toUpperCase()).forEach(d -> System.out.println(d));

        java.util.stream.Stream<String> concatNames = java.util.stream.Stream.concat(names.stream(), newNames.stream());
        concatNames.sorted().forEach(s -> System.out.println(s));
        boolean adamPresent = concatNames.anyMatch(s-> s.equalsIgnoreCase("Adam"));
        Assert.assertTrue(adamPresent);

        //Collect
        List<String> ls = newNames.stream().sorted().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(ls.get(0));

        List<Integer> values = Arrays.asList(2,3,4,3,5,6,3);
        values.stream().distinct().forEach(s-> System.out.println(s));
        List<Integer> numb= values.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(numb.get(3));
    }


}
