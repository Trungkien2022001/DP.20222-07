package dao.media;

import entity.db.AIMSDB;
import entity.media.Book;
import entity.media.Media;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author
 */

//Single Responsibility Principle: class "MediaDAO" thực hiện quá nhiều chức năng
// Nó không chỉ lấy danh sách của tất cả các media và lấy thông tin của tùng media nó còn cập nhật thông tin của media
public class MediaDAO {

    public List getAllMedia() throws SQLException {
        Statement stm = AIMSDB.getConnection().createStatement();
        ResultSet res = stm.executeQuery("select * from Media");
        ArrayList medium = new ArrayList<>();
        while (res.next()) {
            Media media = new Media(
                    res.getInt("id"),
                    res.getString("title"),
                    res.getInt("quantity"),
                    res.getString("category"),
                    res.getString("imageUrl"),
                    res.getInt("price"),
                    res.getString("type"));
            medium.add(media);
        }
        return medium;
    }

//    public Media getMediaById(int id) throws SQLException {
//        String sql = "SELECT * FROM Media ;";
//        Statement stm = AIMSDB.getConnection().createStatement();
//        ResultSet res = stm.executeQuery(sql);
//
//        if (res.next()) {
//            return new Media(
//                    res.getInt("id"),
//                    res.getString("title"),
//                    res.getInt("quantity"),
//                    res.getString("category"),
//                    res.getString("imageUrl"),
//                    res.getInt("price"),
//                    res.getString("type"));
//        }
//        return null;
//    }
public Media getMediaById(int id) throws SQLException {
        String sql = "SELECT * FROM Media ;";
        Statement stm = AIMSDB.getConnection().createStatement();
        ResultSet res = stm.executeQuery(sql);

        if (res.next()) {
            return createMediaFromResultSet(res);
        }
        return null;
    }


    public void updateMediaFieldById(String tbname, int id, String field, Object value) throws SQLException {
        Statement stm = AIMSDB.getConnection().createStatement();
        if (value instanceof String){
            value = "\"" + value + "\"";
        }
        stm.executeUpdate(" update Media set" + " "
                + field + "=" + value + " "
                + "where id=" + id + ";");
    }

    protected Media createMediaFromResultSet(ResultSet res) throws SQLException {
        return new Media(
                res.getInt("id"),
                res.getString("title"),
                res.getInt("quantity"),
                res.getString("category"),
                res.getString("imageUrl"),
                res.getInt("price"),
                res.getString("type"));
    }
}
