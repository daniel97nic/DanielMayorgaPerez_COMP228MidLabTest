package exercise1;
import javax.swing.*;

public class ChildrenBook extends Book
{
    public String genre = "Children";
    public ChildrenBook(String title, String isbn, String publisher, int year)
    {
        super(title, isbn, publisher, year);
    }

    @Override
    public void setPrice(double input)
    {
        price = input;
    }

    @Override
    public String getGenre()
    {
        return genre;
    }

}
