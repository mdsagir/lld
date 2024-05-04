package behaviour.composite.problem;

public class Client {
    public static void main(String[] args) {
        FinancialDepartment financialDepartment=new FinancialDepartment(1,"A");
        SalesDepartment salesDepartment=new SalesDepartment(2,"B");

        HeadDepartment headDepartment=new HeadDepartment(1,"D");
        headDepartment.addDepartment(financialDepartment);
        headDepartment.addDepartment(salesDepartment);
        headDepartment.printDepartmentName();
    }
}
