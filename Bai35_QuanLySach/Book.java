package OOP.Bai35_QuanLySach;

public class Book {
    private String nameOfTheBook;
    private double price;
    private int publishingYear;
    private Author authorName;
    public Book(String nameOfTheBook, double price, int publishingYear, Author authorName) {
        this.nameOfTheBook = nameOfTheBook;
        this.price = price;
        this.publishingYear = publishingYear;
        this.authorName = authorName;
    }
    public String getNameOfTheBook() {
        return nameOfTheBook;
    }
    public void setNameOfTheBook(String nameOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getPublishingYear() {
        return publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
    public Author getAuthorName() {
        return authorName;
    }
    public void setAuthorName(Author authorName) {
        this.authorName = authorName;
    }

    public void nameOfTheBook()
    {
        System.out.println(this.nameOfTheBook);
    }
    public Boolean checkTheSameYear(Book anotherBook)
    {
        return this.publishingYear == anotherBook.publishingYear;
    }
    public double priceAfterDiscount(double x)
    {
        return this.price - this.price*(x/100);
    }
}
