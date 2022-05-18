package Controllers;

import Views.*;
import Models.*;
import java.sql.*;
import javax.swing.table.*;
import java.util.ArrayList;

public class BillController {
    
    public static void BillScreenLoading(DefaultTableModel Orders, Object...BillData){
        Bill Screen = new Bill(Orders, BillData);
        Screen.setVisible(true);
    }
    
    public static void CancelBillScreenLoading(){
        CancelExistOrder Screen = new CancelExistOrder();
        Screen.setVisible(true);
    }
}
