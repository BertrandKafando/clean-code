package ma.enset;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

import ma.Calculator;

public class CalculatorTest {
  private Calculator calculator;

  @BeforeEach
  public void setUp() {
    calculator = new Calculator();
  }

  @AfterEach
  public void tearDown() {
    calculator = null;
  }

  @Test
  @Tag("add")
  @DisplayName("Test add  method with two positive numbers")
  public void testAddTwoPositiveNumbers() {
    // given
    int a = 2;
    int b = 3;
    // when
    int result = calculator.add(a, b);
    // then
    assertThat(result).isEqualTo(5);

  }

  @Test
  @Tag("add")
  @DisplayName("Test add  method with two negative numbers")
  public void testAddTwoNegativeNumbers() {
    // given
    int a = -2;
    int b = -3;
    // when
    int result = calculator.add(a, b);
    // then
    assertThat(result).isEqualTo(-5);
  }

  @Test
  @Tag("add")
  @DisplayName("Test add  method with one positive and one negative numbers")
  public void testAddTwoNegativeAndPositiveNumbers() {
    // given
    int a = -2;
    int b = 3;
    // when
    int result = calculator.add(a, b);
    // then
    assertThat(result).isEqualTo(1);
  }

  @Test
  @Tag("Multiply")
  @DisplayName("Test Multiply  method with two positive numbers")
  public void testMultiplyPositiveNumbers() {
    // given
    int a = 3;
    int b = 2;
    // when
    int result = calculator.multiply(a, b);
    // then
    assertThat(result).isEqualTo(6);

  }

}
