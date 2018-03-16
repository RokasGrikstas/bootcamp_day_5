import java.util.ArrayList;
import java.util.List;

public class PirmasUzdavinysCollection {

    public static void main(String[] args) {

        List <String> names = new ArrayList<>();

        names.add("Andrius");
        names.add("Jonas");
        names.add("Antanas");
        names.add("Aloyzas");
        names.add("Petras");
        names.add("Antanas");

        for(String name : names){
            if(name.length() >= 6){
                System.out.println(name);
            }else{
                System.out.println("vardas per trumpas pasikeisk");
            }


        }
        private static String getFirstElement(List<String> names){
            String fistName = names.get(0);

            return fistName;

    }

    private static  String getLastElement(List<String> names){
            String lastName = names.get(names.size() -1);
            return lastName;
        }



}
