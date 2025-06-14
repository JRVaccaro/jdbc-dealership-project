package com.pluralsight.dealership.DataBase;

import com.pluralsight.dealership.models.LeaseContract;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LeaseDao {
    private DataSource dataSource;

    public LeaseDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void addLeaseContract(LeaseContract leaseContract) {
        // TODO: Implement the logic to add a lease contract
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "INSERT INTO lease_contract (contract_id, vin, lease_start, lease_end, monthly_pay) VALUES (?, ?, ?, ? ,?)")){

            statement.setInt(1, leaseContract.getContractId());
            statement.setString(2, leaseContract.getVin());
            statement.setDate(3, leaseContract.getLeaseStart(); //I'm unsure, will come back to
            statement.setDate (4, leaseContract.getLeaseEnd(); //I'm unsure, will come back to
            statement.setDouble(5, leaseContract.getMonthlyPayment());

            statement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
