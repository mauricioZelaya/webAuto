import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class test_makeComplement {
        @Test
        public void test01() {
            assertEquals("TTTT", DNAComplement.makeComplement("AAAA"));
        }
        @Test
        public void test02() {
            assertEquals("TAACG", DNAComplement.makeComplement("ATTGC"));
        }
        @Test
        public void test03() {
            assertEquals("CATA", DNAComplement.makeComplement("GTAT"));
        }
}

