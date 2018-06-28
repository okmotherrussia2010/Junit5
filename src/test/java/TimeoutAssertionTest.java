import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
 
import java.time.Duration;
 
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
 
@DisplayName("Writing assertions for the execution time of the system under test")
class TimeoutAssertionTest {
 
  @Test
  @DisplayName("Should return the correct message before timeout is exceeded")
  void shouldReturnCorrectMessageBeforeTimeoutIsExceeded() {
    final String message = assertTimeout(Duration.ofMillis(500), () -> {
        Thread.sleep(20);
        return "Hello World!";
    });
    assertEquals("Hello World!", message);
  }
  
  @Test
  @DisplayName("Should return the correct message before timeout is exceeded (or execution preemptively aborted )")
  void shouldReturnCorrectMessageBeforeTimeoutIsExceeded2() {
    final String message = assertTimeoutPreemptively(Duration.ofMillis(500), () -> {
        Thread.sleep(20);
        return "Hello World!";
    });
    assertEquals("Hello World!", message);
  }
    
}
