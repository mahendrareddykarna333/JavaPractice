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
}
