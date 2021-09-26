import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uk.ifelse.IfElseConditionalStatement;

public class TestIfElseConditionalStatement {


    @Test
    public void shouldReturnLargeWhenFirstInputIsLarger() {
        Assertions.assertEquals(400, IfElseConditionalStatement.getLarge(400, 200));
    }

    @Test
    public void shouldTestGreaterThan() {
        Assertions.assertEquals(400, IfElseConditionalStatement.getLarge(200, 400));
    }


    @Test
    public void shouldReturnLargeInThreeNumbers() {
        Assertions.assertEquals(400, IfElseConditionalStatement.getLargestInThreeNumbers(400,300,200));
        Assertions.assertEquals(400, IfElseConditionalStatement.getLargestInThreeNumbers(300,400,200));
        Assertions.assertEquals(400, IfElseConditionalStatement.getLargestInThreeNumbers(300,200,400));
        Assertions.assertEquals(400, IfElseConditionalStatement.getLargestInThreeNumbers(400,400,400));
        Assertions.assertEquals(111111111, IfElseConditionalStatement.getLargestInThreeNumbers(111111111,400,400));


    }


}