package PracticeProblem6;

class Books {
    int BookId;
    String BookName;
    String BookAuthor;
    String YearofPub;
    float Price;
    String Status;

    void AddNewBooks() {
        System.out.println("Book Added");
    }
    void DeleteBooks() {
        System.out.println("Book Deleted");
    }
    void DisplayBookDetails() {
        System.out.println("Displaying Book");
    }
    void InquiryBook() {
        System.out.println("Inquiry Done");
    }
}

class Librarian {
    int Id;
    String Name;

    void SearchBook(String name) {
        System.out.println("Searching " + name);
    }
    boolean VerifyMember(int id) {
        return true;
    }
    void OrderBooks() {
        System.out.println("Order Placed");
    }
    void SellBooks() {
        System.out.println("Book Sold");
    }
}

class Publisher {
    int Id;
    String Name;
    String Adress;
    int PhoneNo;

    void AddPub() {
        System.out.println("Publisher Added");
    }
    void ModifyPub() {
        System.out.println("Publisher Modified");
    }
    void DeletePub() {
        System.out.println("Publisher Deleted");
    }
    void OrderStatus() {
        System.out.println("Status: Shipped");
    }
}

class User {
    int UserID;
    String UserName;
    String UserAddress;
    int PhoneNo;

    void ReturnBooks() {
        System.out.println("Book Returned");
    }
    int PayFine(String Dt) {
        return 0;
    }
    void AddNewUser() {
        System.out.println("User Added");
    }
    void DeleteUser() {
        System.out.println("User Deleted");
    }
    void UpdateDetails() {
        System.out.println("Details Updated");
    }
    void BookPurchase() {
        System.out.println("Book Purchased");
    }
}

public class PP6 {
    public static void main(String[] args) {
        Books b = new Books();
        b.AddNewBooks();

        Librarian l = new Librarian();
        l.OrderBooks();

        Publisher p = new Publisher();
        p.AddPub();

        User u = new User();
        u.AddNewUser();
    }
}