package app;

public class Main {

        public static void main(String[] args) {

            Person id1 = new Person(1, " John", 30, " Engineer");
            Person id2 = new Person(2, " Mary", 25, " Teacher");
            Person id3 = new Person(3, " Bob", 35, " Doctor");
            Person id4 = new Person(4, " Alice", 28, " Architect");
            Person idn = new Person();


            System.out.println(id1);
            System.out.println(id2);
            System.out.println(id3);
            System.out.println(idn);
            System.out.println();
            System.out.println(id4);

            id4.setProfession("Designer");
            System.out.println("After updating the profession:");
            System.out.println(id4);
            id4.toString();
        }
}









