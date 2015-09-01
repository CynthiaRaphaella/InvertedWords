import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class InvertWordsTest {

    InvertWord invertWord;

    @Before
    public void setUp() throws Exception {
        invertWord = new InvertWord();
    }

    @Test
    public void shouldKeepNullWhenReceiveANullPhrase() {
        String phrase = null;
        String inertedPhrase = invertWord.revert(phrase);
        assertNull(inertedPhrase);
    }

    @Test
    public void shouldReturnTheSameWhenIsJustOneWord() {
        String phrase = "Word";
        String inertedPhrase = invertWord.revert(phrase);
        assertTrue(phrase.equals(inertedPhrase));
    }
}
