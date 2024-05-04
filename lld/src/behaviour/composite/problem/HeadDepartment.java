package behaviour.composite.problem;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment {

    private Integer id;
    private String name;

    private List<Object> departments;

    public HeadDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.departments = new ArrayList<>();
    }
    public void printDepartmentName() {
        departments.forEach(o -> {
            if (o instanceof FinancialDepartment financialDepartment){
                financialDepartment.printDepartmentName();
            }
            if (o instanceof SalesDepartment salesDepartment){
                salesDepartment.printDepartmentName();
            }
        });
    }
    public void addDepartment(Object o) {
        departments.add(o);
    }

    public void removeDepartment(Object o) {
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

    public List<Object> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Object> departments) {
        this.departments = departments;
    }
}
