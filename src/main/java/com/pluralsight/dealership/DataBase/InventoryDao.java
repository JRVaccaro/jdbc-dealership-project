package com.pluralsight.dealership.DataBase;

import java.sql.Connection;
import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InventoryDao {
    private DataSource dataSource;

    public InventoryDao(DataSource dataSource) {
        this.dataSource = dataSource;

    }

    public void addVehicleToInventory(String vin, int dealershipId) {

        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "INSERT INTO inventory (dealership_id, VIN) Values (?, ?)")) {

            statement.setInt(1, dealershipId);
            statement.setString(2, vin);

            statement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




    public void removeVehicleFromInventory(String vin) {
        // TODO: Implement the logic to remove a vehicle from the inventory
    }
}
