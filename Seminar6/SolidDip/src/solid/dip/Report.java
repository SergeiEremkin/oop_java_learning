package solid.dip;

import java.util.ArrayList;
import java.util.List;

public class Report implements ReportOperations{
    

    // расчет отчетных данных
    public List<ReportItem> calculate(){
        List<ReportItem> items =  new ArrayList<ReportItem>();
        items.add(new ReportItem("First", (float)5));
        items.add(new ReportItem("Second", (float)6));
        return items;
    }

    
}