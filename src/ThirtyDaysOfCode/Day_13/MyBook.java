package ThirtyDaysOfCode.Day_13;

public class MyBook extends Book{
    int price;

    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    public void display(){
        System.out.println("Title: " + this.title + "\nAuthor: " + this.author + "\nPrice: " + this.price);
    }
}
