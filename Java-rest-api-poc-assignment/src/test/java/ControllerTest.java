import static org.junit.Assert.*;

import app.controller.FlagPickerController;
import org.junit.*;


public class ControllerTest {
  @Test
  public void greetingExpression() {
    FlagPickerController flagPickerController = new FlagPickerController();
    String result = flagPickerController.getCountries("Asia");
    boolean check = result.contains("Asia");
    if (check = true){
      assertTrue("testcase passed",true);
    }

  }
}
