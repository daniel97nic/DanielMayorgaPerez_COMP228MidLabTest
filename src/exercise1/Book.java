package exercise1;
public abstract class Book
{
    public String title;
    public String isbn;
    public String publisher;
    public double price;
    public int year;

    public Book(String title, String isbn, String publisher, int year)
    {
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
        this.year = year;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public String getPublisher()
    {
        return publisher;
    }

    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public abstract void setPrice(double price);
    public abstract String getGenre();

    @Override
    public String toString()
    {
        return "Title: " + title + "\nISBN: " + isbn + "\nPublisher: " + publisher +
                "\nPrice: $" + price + "\nYear: " + year;
    }
}
