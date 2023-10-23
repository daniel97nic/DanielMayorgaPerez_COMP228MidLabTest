package exercise1;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class BookDriver {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        boolean continueAddingBooks = true;
        while (continueAddingBooks) {
            String title = JOptionPane.showInputDialog("Enter book title:");
            String isbn = JOptionPane.showInputDialog("Enter ISBN:");
            String publisher = JOptionPane.showInputDialog("Enter publisher:");
            int year = Integer.parseInt(JOptionPane.showInputDialog("Enter publication year:"));
            String genre = JOptionPane.showInputDialog("Enter genre (Science or Children): ");

            if (genre.equalsIgnoreCase("science")) {
                ScienceBook book = new ScienceBook(title, isbn, publisher, year);
                double inputPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter price: "));
                book.setPrice(inputPrice);
                books.add(book);
                JOptionPane.showMessageDialog(null, "Book Information:\n\n" + book.toString());
            } else if (genre.equalsIgnoreCase("children")) {
                ChildrenBook book = new ChildrenBook(title, isbn, publisher, year);
                double inputPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter price: "));
                book.setPrice(inputPrice);
                books.add(book);
                JOptionPane.showMessageDialog(null, "Book Information:\n\n" + book.toString());
            } else {
                JOptionPane.showMessageDialog(null, "Invalid genre. Please enter Science or Children.");
            }

            int choice = JOptionPane.showConfirmDialog(null, "Do you want to add another book?", "Continue?", JOptionPane.YES_NO_OPTION);
            continueAddingBooks = (choice == JOptionPane.YES_OPTION);
        }

        StringBuilder bookInfo = new StringBuilder();
        for (Book book : books) {
            bookInfo.append(book.toString()).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, "All Book Information:\n\n" + bookInfo.toString());
    }
}
