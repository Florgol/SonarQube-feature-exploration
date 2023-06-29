import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ImportantClassTest {

    private ExpensiveClass expensiveClass;
    private ImportantClass importantClass;

    @BeforeEach
    public void setup() {
        // We create the mock object for ExpensiveClass
        expensiveClass = mock(ExpensiveClass.class);

        // When the expensiveMethod() of the mock object is called, 
        // we the value "Important data"
        when(expensiveClass.expensiveMethod()).thenReturn("Important data");

        // We create an instance of ImportantClass,
        // with the mock object passed to it
        importantClass = new ImportantClass(expensiveClass);
    }

    @Test
    public void testImportantMethod() {

        String result = importantClass.importantMethod();
        assertEquals("Important data, but more important", result);

        // We verify that the mock method for expensiveMethod() was indeed called
        verify(expensiveClass).expensiveMethod();
    }
}
