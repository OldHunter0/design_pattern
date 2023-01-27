package visitor;

import java.util.LinkedList;
import java.util.List;

public class BusinessReport {
    private List<Staff> staffList=new LinkedList<>();

    public BusinessReport(){
        staffList.add(new Manager("经理-A"));
        staffList.add(new Engineer("工程师-A"));
        staffList.add(new Engineer("工程师-B"));
        staffList.add(new Engineer("工程师-C"));
        staffList.add(new Manager("经理-B"));
        staffList.add(new Engineer("工程师-D"));
    }

    /**
     * 为访问者展示报表
     * @param visitor 公司高层，如CEO、CTO
     */
    public void showReport(Visitor visitor){
        for (Staff staff : staffList) {
            staff.accept(visitor);
        }
    }
}
