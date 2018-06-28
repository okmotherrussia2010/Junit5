import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
 
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.sameInstance;
 
@DisplayName("Writing assertions for objects 2")
class ObjectAssertion2Test {
 
  @Nested
  @DisplayName("When object is null")
  class WhenObjectIsNull {

    @Test
    @DisplayName("Should be null")
    void shouldBeNull() {
      assertThat(null, nullValue());
    }
      
  }
  
  @Nested
  @DisplayName("When object is not null")
  class WhenObjectIsNotNotNull {

    @Test
    @DisplayName("Should not be null")
    void shouldNotBeNull() {
      assertThat(new Object(), notNullValue());
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
        assertThat(ACTUAL, is(EXPECTED));
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
        assertThat(ACTUAL, not(EXPECTED));
      }
      
    }
  
  }
  
  @Nested
  @DisplayName("When two objects refer to the same object")
  class WhenTwoObjectsReferToSameObject {

    private final Object ACTUAL = new Object();
    private final Object EXPECTED = ACTUAL;

    @Test
    @DisplayName("Should refer to the same object")
    void shouldReferToSameObject() {
      assertThat(ACTUAL, sameInstance(EXPECTED));
    }
  
  }

  @Nested
  @DisplayName("When two objects don't refer to the same object")
  class WhenTwoObjectsDoNotReferToSameObject {

    private final Object ACTUAL = new Object();
    private final Object EXPECTED = new Object();

    @Test
    @DisplayName("Should not refer to the same object")
    void shouldNotReferToSameObject() {
      assertThat(ACTUAL, not(sameInstance(EXPECTED)));
    }
    
  }
    
}
