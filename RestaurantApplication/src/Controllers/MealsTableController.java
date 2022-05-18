package Controllers;

import Views.*;
import Models.*;
import java.sql.*;
import java.util.ArrayList;

//enum Index{DataFetchMode, DataFetchWith};

public class MealsTableController {
    public static ArrayList<Object> GetMealsData(Object...DataFetch)throws SQLException{
        ArrayList<Object> MealsData = new ArrayList<Object>();
        ResultSet ReturnedTableData = null;
        switch(Integer.parseInt(DataFetch[Index.DataFetchMode.ordinal()]+"")){
            case 0:
                ReturnedTableData = MealsTableQueries.SelectMealsData();
              break;
            case 1:
                ReturnedTableData = MealsTableQueries.SearchMealById(Integer.parseInt(DataFetch[Index.DataFetchWith.ordinal()] +""));
              break;
            case 2:
                ReturnedTableData = MealsTableQueries.SearchMealByName((String)DataFetch[Index.DataFetchWith.ordinal()]);
              break;
        }
        while(ReturnedTableData.next()){
        MealsData.add(ReturnedTableData.getString("ID"));
        MealsData.add(ReturnedTableData.getString("Name"));
        MealsData.add(ReturnedTableData.getString("price"));
        MealsData.add(ReturnedTableData.getString("quantity"));
        }
        return MealsData;
    }
    
    public static int UpdateMealsTable(int OperationType,Object...MealData)throws SQLException{
        int ResultOfOperation = -1;
        switch(OperationType){
            case 0:
                ResultOfOperation= MealsTableQueries.AddNewMeal(MealData);
                break;
            case 1:
                ResultOfOperation = MealsTableQueries.DeleteMealData(Integer.parseInt(MealData[0]+""));
                break;
            case 2:
                ResultOfOperation = MealsTableQueries.UpdateMealData(MealData);     
                break;
            case 3:
                ResultOfOperation = MealsTableQueries.UpdateMealPrice(MealData);
                break;
            case 4:
                ResultOfOperation = MealsTableQueries.UpdateMealQuantity(MealData);
                break;
        }return ResultOfOperation;
    }
}
