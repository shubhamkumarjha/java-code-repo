public class Employee {
    private Integer id;
    private String name;


    public Integer getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        //this.name = name;
    }

    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
