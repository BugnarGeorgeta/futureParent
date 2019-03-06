package org.fasttrackit.persistence;

import org.fasttrackit.domain.Children;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ChildrenRepository {

    public void createChildren(Children children)throws ClassNotFoundException, IOException, SQLException {
        Connection connection=DatabaseConfiguration.getConnection();
        String insertSql = "INSERT INTO future_parent(levelOfMood, healthCondition, favoriteGame, feelingHungry, favoriteFood) VALUES (?,?,?,?,?)";
        PreparedStatement preparedStatement =connection.prepareStatement(insertSql);

        preparedStatement.setInt(1,children.getLevelOfMood());
        preparedStatement.setInt(2,children.getHealthCondition());
        preparedStatement.setString(3,children.getFavoriteGame());
        preparedStatement.setInt(4,children.getFeelingHungry());
        preparedStatement.setString(5,children.getFavoriteFood());

        preparedStatement.executeUpdate();


    }


}
