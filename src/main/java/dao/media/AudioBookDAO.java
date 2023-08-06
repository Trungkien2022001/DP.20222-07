package dao.media;

import entity.db.AIMSDB;
import entity.media.AudioBook;
import entity.media.Media;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 * @author
 */
public class AudioBookDAO extends MediaDAO {

    @Override
    public Media getMediaById(int id) throws SQLException {
        String sql = "SELECT * FROM "+
                "aims.AudioBook " +
                "INNER JOIN aims.Media " +
                "ON Media.id = AudioBook.id " +
                "where Media.id = " + id + ";";
        Statement stm = AIMSDB.getConnection().createStatement();
        ResultSet res = stm.executeQuery(sql);
        if(res.next()) {

            // from Media table
            String title = "";
            String type = res.getString("type");
            int price = res.getInt("price");
            String category = res.getString("category");
            int quantity = res.getInt("quantity");

            // from Book table
            String author = res.getString("author");
            String format = res.getString("format");
            String accent = res.getString("accent");
            String language = res.getString("language");
            String lengthInMinutes = res.getString("lengthInMinutes");

            return new Book(id, title, category, price, quantity, type,
                    author,  format, accent, language, lengthInMinutes);

        } else {
            throw new SQLException();
        }
    }
}
