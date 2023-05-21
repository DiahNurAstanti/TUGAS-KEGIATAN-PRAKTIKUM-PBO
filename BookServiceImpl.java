package book;
import config.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Book;

public class BookServiceImpl implements BookService{

    private Connection connection = Database.DBConnection();
    private PreparedStatement statement;
    
    @Override
    public void addBook(Book book) {
        // implementasi addBook
    }
    
    @Override
    public List<Book> findBookList() {
        // implementasi findBookList
        return null;
    }
    
    @Override
    public Book findBookById(int bookId){
        // implementasi findBookById
        return null;
    }
    
    @Override
    public void updateBook(Book book) {
        // implementasi updateBook
    }
    
    @Override
    public void removeBook(int id) {
        // implementasi removeBook
    }
    
    public static void main(String[] args) {
        // Contoh penggunaan BookServiceImpl
        BookService bookService = new BookServiceImpl();
        
        // Menambahkan buku baru
        Book book1 = new Book("John Doe", "The Great Gatsby");
        bookService.addBook(book1);
        
        // Menampilkan daftar buku
        List<Book> bookList = bookService.findBookList();
        System.out.println("Daftar Buku:");
        for (Book book : bookList) {
            System.out.println("ID: " + book.getId());
            System.out.println("Author: " + book.getAuthorName());
            System.out.println("Title: " + book.getTitle());
            System.out.println();
        }
        
        // Mencari buku berdasarkan ID
        int bookId = 1;
        Book foundBook = bookService.findBookById(bookId);
        if (foundBook != null) {
            System.out.println("Buku dengan ID " + bookId + " ditemukan:");
            System.out.println("Author: " + foundBook.getAuthorName());
            System.out.println("Title: " + foundBook.getTitle());
        } else {
            System.out.println("Buku dengan ID " + bookId + " tidak ditemukan.");
        }
        
        // Mengupdate informasi buku
        Book bookToUpdate = new Book("Jane Smith", "Pride and Prejudice");
        bookToUpdate.setId(1);
        bookService.updateBook(bookToUpdate);
        
        // Menghapus buku
        int bookIdToDelete = 1;
        bookService.removeBook(bookIdToDelete);
        System.out.println("Buku dengan ID " + bookIdToDelete + " telah dihapus.");
        
        // Menampilkan daftar buku setelah penghapusan
        bookList = bookService.findBookList();
        System.out.println("Daftar Buku Setelah Penghapusan:");
        for (Book book : bookList) {
            System.out.println("ID: " + book.getId());
            System.out.println("Author: " + book.getAuthorName());
            System.out.println("Title: " + book.getTitle());
            System.out.println();
        }
    }
}
