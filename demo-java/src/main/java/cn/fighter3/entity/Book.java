import lombok.Data;
import java.util.Date;
import java.io.Serializable;

/**
 * (Book)实体类
 *
 */
@Data
public class Book implements Serializable {
    private static final long serialVersionUID = -62987918240031203L;
    
    private Integer bookid;
    
    private String bookname;
    
    private String bookauthor;
    
    private String bookpublisher;
    
    private String bookprice;
    
    private String bookspecies;
    
    private Date bookshelftime;
    
    private Integer bookrecommendedindex;
    
    private String bookifsalepromotion;
    
    private String booksalepromotionprice;
    
    private String bookpicture;


/*
    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }

    public String getBookpublisher() {
        return bookpublisher;
    }

    public void setBookpublisher(String bookpublisher) {
        this.bookpublisher = bookpublisher;
    }

    public String getBookprice() {
        return bookprice;
    }

    public void setBookprice(String bookprice) {
        this.bookprice = bookprice;
    }

    public String getBookspecies() {
        return bookspecies;
    }

    public void setBookspecies(String bookspecies) {
        this.bookspecies = bookspecies;
    }

    public Date getBookshelftime() {
        return bookshelftime;
    }

    public void setBookshelftime(Date bookshelftime) {
        this.bookshelftime = bookshelftime;
    }

    public Integer getBookrecommendedindex() {
        return bookrecommendedindex;
    }

    public void setBookrecommendedindex(Integer bookrecommendedindex) {
        this.bookrecommendedindex = bookrecommendedindex;
    }

    public String getBookifsalepromotion() {
        return bookifsalepromotion;
    }

    public void setBookifsalepromotion(String bookifsalepromotion) {
        this.bookifsalepromotion = bookifsalepromotion;
    }

    public String getBooksalepromotionprice() {
        return booksalepromotionprice;
    }

    public void setBooksalepromotionprice(String booksalepromotionprice) {
        this.booksalepromotionprice = booksalepromotionprice;
    }

    public String getBookpicture() {
        return bookpicture;
    }

    public void setBookpicture(String bookpicture) {
        this.bookpicture = bookpicture;
    }
*/

}