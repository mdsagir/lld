package behaviour.composite.solution;

public class Client {
    public static void main(String[] args) {
        Department financialDepartment=new FinancialDepartment(1,"A");
        Department salesDepartment=new SalesDepartment(2,"B");
        Department itDepartment=new ITDepartment(3,"C");

        HeadDepartment headDepartment=new HeadDepartment(1,"D");
        headDepartment.addDepartment(financialDepartment);
        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(itDepartment);
        headDepartment.printDepartmentName();
    }
}
