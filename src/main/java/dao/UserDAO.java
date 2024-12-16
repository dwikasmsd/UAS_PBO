package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;
import model.User;

public class UserDAO extends baseDAO
{
    private static PreparedStatement st;
    private static Connection con;
    static int cekUser;
    static int cekPass;
    static int cekID;

    public static int validate(String username)
    {
        
        try
        {
            
            con = getCon();
            String query = "SELECT ID FROM user WHERE Nama = '%s'";
            query = String.format(query, username);
            st = con.prepareStatement(query);
            ResultSet resultSet = st.executeQuery();
            if (resultSet.next())
            {
                cekUser = 1;
            }
            else
            {
                cekUser = 0;
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            closeCon(con);
        }
        return cekUser;
    }

    public static void registerUser(User user) {
    // Query tanpa parameter langsung di dalam string
        String query = "INSERT INTO user (Nama, Password) VALUES (?, ?)";

        try (Connection con = getCon();
             PreparedStatement st = con.prepareStatement(query)) {

            // Set parameter menggunakan setXXX() sesuai dengan tipe data yang ada
            st.setString(1, user.getUsername());  // Mengatur Nama
            st.setString(2, user.getPassword());  // Mengatur Password

            // Eksekusi query
            st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("gagal");
        }
    }
    
    public static int CekPass(String username , String password)
    {
        try
        {
            
            con = getCon();
            String query = "SELECT Password FROM user WHERE Nama = '%s'";
            query = String.format(query, username);
            st = con.prepareStatement(query);
            ResultSet resultSet = st.executeQuery();
            resultSet.next();
            String pass = resultSet.getString("Password");
            if (pass.equals(password))
            {
                cekPass = 1;
            }
            else
            {
                cekPass = 0;
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            closeCon(con);
        }
        return cekPass;
    }

    public static int CekID(String username)
    {
        try
        {
            
            con = getCon();
            String query = "SELECT ID FROM user WHERE Nama = '%s'";
            query = String.format(query, username);
            st = con.prepareStatement(query);
            ResultSet resultSet = st.executeQuery();
            resultSet.next();
            cekID = resultSet.getInt("ID");
            
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            closeCon(con);
        }
        return cekID;
    }


}