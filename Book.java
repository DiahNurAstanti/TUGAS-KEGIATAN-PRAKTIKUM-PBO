/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;


public class Book {

   public int id;
   private String authorName;
   private String title;
   
   public Book(String authorName, String title){
       this.title = title;
       this.authorName = authorName;
   }

    public Book() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public static void main(String[] args) {
        
        Book book1 = new Book("John Doe", "The Great Gatsby");
        book1.setId(1);

        System.out.println("Book ID: " + book1.getId());
        System.out.println("Author: " + book1.getAuthorName());
        System.out.println("Title: " + book1.getTitle());
    }
}
