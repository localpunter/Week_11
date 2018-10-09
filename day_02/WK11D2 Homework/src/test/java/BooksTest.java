import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BooksTest {
    Books books;

    @Before
    public void before() {
        books = new Books("Trainspotting", "Irvine Welsh", "Action");

    }

    @Test
    public void hasTitle() {
        assertEquals("Trainspotting", books.hasTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("Irvine Welsh", books.hasAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("Action", books.hasGenre());
    }
}
