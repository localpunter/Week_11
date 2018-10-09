import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Books books;


    @Before
    public void before() {
        library = new Library();


    }

    @Test
    public void numberOfBooks() {
        assertEquals(0, library.getBooks());
    }

    @Test
    public void addNovel() {
        library.addNovel(books);
        assertEquals(1, library.getBooks());
    }

    @Test
    public void addNovelNoSpace() {
        library.addNovel(books);
        library.addNovel(books);
        library.addNovel(books);
        assertEquals(3, library.getBooks());
        assertEquals(false, library.addNovel(books));
    }

    @Test
    public void removeBook() {
        library.addNovel(books);
        assertEquals(1, library.getBooks());
        library.removeBook();
        assertEquals(0, library.getBooks());
    }
}
