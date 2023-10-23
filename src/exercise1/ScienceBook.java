package exercise1;
import javax.swing.*;

public class ScienceBook extends Book
{
    String genre = "Science";

    public ScienceBook(String title, String isbn, String publisher, int year)
    {
        super(title, isbn, publisher, year);
    }

    @Override
    public void setPrice(double input)
    {
        price = input * 0.9;
    }

    @Override
    public String getGenre()
    {
        return genre;
    }
}
