package behaviour.composite.solution;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment {

    private Integer id;
    private String name;

    private List<Department> departments;

    public HeadDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.departments = new ArrayList<>();
    }
    public void printDepartmentName() {
        departments.forEach(Department::printDepartmentName);
    }
    public void addDepartment(Department o) {
        departments.add(o);
    }

    public void removeDepartment(Department o) {
        departments.remove(o);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}
