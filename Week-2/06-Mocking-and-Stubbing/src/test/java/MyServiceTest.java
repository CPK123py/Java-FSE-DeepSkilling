import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest{

    @Test
    public void testExternalApi(){

        ExternalApi mockApi=mock(ExternalApi.class);

        when(mockApi.getData()).thenReturn("Mock Data");

        MyService obj=new MyService(mockApi);

        String ans=obj.fetchData();

        assertEquals("Mock Data",ans);
    }
}