public class Person implements  Comparable,Node{
    private int id ;
    private String name ;
    private static int count =0 ;

    public Person(String name) {
        this.name = name;
        id = count++;
    }

    @Override
    public int compareTo(Object o) {
        if (o == null ) throw new NullPointerException();
        if (!( o instanceof Person ))
            throw new ClassCastException ("Uncomparable objects!");
        Person pers = (Person) o;
        return this.name.compareTo(pers.name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
