package com.pluralsight.dealership.DataBase;

import com.pluralsight.dealership.models.SalesContract;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SalesDao {
    private DataSource dataSource;

    public SalesDao(DataSource dataSource) {

        this.dataSource = dataSource;
    }

    public void addSalesContract(SalesContract salesContract) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "INSERT INTO sales_contracts (contract_id, vin,sale_date, price) VALUES (?,?,?,?)")){

            statement.setInt(1, salesContract.getContractId());
            statement.setString(2, salesContract.getVin());
            statement.setDate(3,java.sql.Date.valueOf(salesContract.getSaleDate())); //Makes the sale date into a SQL format so it can be saved in the database
            statement.setDouble(4, salesContract.getPrice());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
