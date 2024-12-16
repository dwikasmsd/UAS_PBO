package dao;
    
import static dao.baseDAO.getCon;
    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.util.UUID;
    import model.User;

public class game_sessionDAO {
    public static void registerUser(User user) {
   
        String query = "INSERT INTO user (Nama, Password) VALUES (?, ?)";

        try (Connection con = getCon();
             PreparedStatement st = con.prepareStatement(query)) {

          
            st.setString(1, user.getUsername());  // Mengatur Nama
            st.setString(2, user.getPassword());  // Mengatur Password

            
            
            
            st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("gagal");
        }
    }
}
