import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordCollectionTest {
    @Test
    public void wordCount() {
        WordCollection wordCollection = new WordCollection();
        assertEquals(5, wordCollection.wordCount());
    }
}
