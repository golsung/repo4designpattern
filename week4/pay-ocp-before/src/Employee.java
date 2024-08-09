public class Employee {
    private String id;
    private String name;
    private int workHours;
    private int overTimeHours;

    public String getId() {
        return id;
    }

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public int pay() {
        return 10000*workHours+15000*overTimeHours;
    }
    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }
    public void setOverTimeHours(int overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    public String getName() {
        return name;
    }
    public int getWorkHours() {
        return workHours;
    }
    public int getOverTimeHours() {
        return overTimeHours;
    }

}
