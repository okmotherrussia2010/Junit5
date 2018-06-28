import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
 
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
 
@DisplayName("Writing assertions for exceptions")
class ExceptionAssertionTest {
 
  @Test
  @DisplayName("Should throw an exception that has the correct message")
  void shouldThrowAnExceptionWithCorrectMessage() {
    final NullPointerException thrown = assertThrows(
        NullPointerException.class,
        () -> {
          throw new NullPointerException("Hello World!");
        }
    );
    assertEquals("Hello World!", thrown.getMessage());
  }
    
}
