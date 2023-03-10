public class Company implements Comparable,Node {
    private Integer id;
    private String name;
    private static Integer count =0 ;

    public Company(String name ) {
        this.name = name;
        id = count++;
    }

    @Override
    public int compareTo(Object o) {
        if (o == null ) throw new NullPointerException();
        if (!( o instanceof Company ))
            throw new ClassCastException ("Uncomparable objects!");
        Company company = (Company) o;
        return this.name.compareTo(company.name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
