package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static dao.baseDAO.getCon;

import model.tingkat_kesulitan;

public class tingkat_kesulitanDAO {

    public static List<tingkat_kesulitan> getTingkatKesulitanList() {
        List<tingkat_kesulitan> tingkatKesulitanList = new ArrayList<>();

        String query = "SELECT ID, tingkat_kesulitan FROM tingkat_kesulitan";
            try (Connection con = getCon();
             PreparedStatement st = con.prepareStatement(query);
             ResultSet resultSet = st.executeQuery()) {

                while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String namaTingkat = resultSet.getString("tingkat_kesulitan");
                tingkat_kesulitan tingkat = new tingkat_kesulitan(id, namaTingkat);
                tingkatKesulitanList.add(tingkat);
            }

        } catch (SQLException e)
            {
                
            }

        return tingkatKesulitanList;
    }
}
