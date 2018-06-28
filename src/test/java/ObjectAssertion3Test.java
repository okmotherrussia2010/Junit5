import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
 
import static org.assertj.core.api.Assertions.assertThat;
 
@DisplayName("Writing assertions for objects 3")
class ObjectAssertion3Test {
 
  @Nested
  @DisplayName("When object is null")
  class WhenObjectIsNull {

    private final Object NULL = null;

    @Test
    @DisplayName("Should be null")
    void shouldBeNull() {
      assertThat(NULL).isNull();
    }
      
  }
  
  @Nested
  @DisplayName("When object is not null")
  class WhenObjectIsNotNotNull {

    @Test
    @DisplayName("Should not be null")
    void shouldNotBeNull() {
      assertThat(new Object()).isNotNull();
    }
      
  }
  
  @Nested
  @DisplayName("When two objects are equal")
  class WhenTwoObjectsAreEqual {

    @Nested
    @DisplayName("When objects are integers")
    class WhenObjectsAreIntegers {

      private final Integer ACTUAL = 9;
      private final Integer EXPECTED = 9;

      @Test
      @DisplayName("Should be equal")
      void shouldBeEqual() {
        assertThat(ACTUAL).isEqualByComparingTo(EXPECTED);
      }
        
    }
      
  }

  @Nested
  @DisplayName("When two objects aren't equal")
  class WhenTwoObjectsAreNotEqual {

    @Nested
    @DisplayName("When objects are integers")
    class WhenObjectsAreIntegers {

      private final Integer ACTUAL = 9;
      private final Integer EXPECTED = 4;

      @Test
      @DisplayName("Should not be equal")
      void shouldNotBeEqual() {
        assertThat(ACTUAL).isNotEqualByComparingTo(EXPECTED);
      }
        
    }
      
  }
    
}
