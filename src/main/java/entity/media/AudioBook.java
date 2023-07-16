package entity.media;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;

import entity.db.AIMSDB;

public class AudioBook extends Media {

    //// content
    String author;
    String format;
    String accent;
    String language;
    Int lengthInMinutes;
    public AudioBook() throws SQLException{

    }

    public AudioBook(int id, String title, String category, int price, int quantity, String type, String author,
            String format, String accent, String language,
            String lengthInMinutes) throws SQLException{
        super(id, title, category, price, quantity, type);
        this.author = author;
        this.format = format;
        this.accent = accent;
        this.language = language;
        this.lengthInMinutes = lengthInMinutes;
    }

    // getter and setter
    public int getId() {
        return this.id;
    }

    public String getAuthor() {
        return this.author;
    }

    public AudioBook setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getFormat() {
        return this.format;
    }

    public AudioBook setFormat(String format) {
        this.format = format;
        return this;
    }

    public String getAccent() {
        return this.accent;
    }

    public AudioBook setAccent(String accent) {
        this.accent = accent;
        return this;
    }

    public String getLanguage() {
        return this.language;
    }

    public AudioBook setLanguage(Date language) {
        this.language = language;
        return this;
    }

    public int lengthInMinutes() {
        return this.lengthInMinutes;
    }

    public AudioBook setLengthInMinutes(int lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
        return this;
    }
    @Override
    public String toString() {
        String basicInformation = "{" +
                " id='" + id + "'" +
                ", title='" + title + "'" +
                ", category='" + category + "'" +
                ", price='" + price + "'" +
                ", quantity='" + quantity + "'" +
                ", type='" + type + "'" +
                ", imageURL='" + imageURL + "'" +
                "}";
        return "{" +
            basicInformation +
            " author='" + author + "'" +
            ", format='" + format + "'" +
            ", accent='" + accent + "'" +
            ", language='" + language + "'" +
            ", lengthInMinutes='" + lengthInMinutes + "'" +
            "}";
    }
}
