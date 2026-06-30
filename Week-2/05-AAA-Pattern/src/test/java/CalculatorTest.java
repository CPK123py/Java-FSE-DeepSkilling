import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest{

    Calculator obj;

    @Before
    public void setup(){

        obj=new Calculator();
    }

    @After
    public void teardown(){

        obj=null;
    }

    @Test
    public void testAdd(){

        // Arrange
        int a=10;
        int b=20;

        // Act
        int ans=obj.add(a,b);

        // Assert
        assertEquals(30,ans);
    }
}