import java.util.ArrayList;


public class Library {
    private ArrayList<Books> book;
    private int capacity;

    public Library() {
        this.book = new ArrayList<>();
        this.capacity = 3;
    }

    public int getBooks() {
        return book.size();
    }

    public boolean addNovel(Books books) {
        if (getBooks() < capacity) {
            book.add(books);
            return true;
        }

        return false;

    }

    public void removeBook() {
        book.remove(0);
    }

}
