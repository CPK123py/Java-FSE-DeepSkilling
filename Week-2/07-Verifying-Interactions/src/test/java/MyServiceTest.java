import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class MyServiceTest{

    @Test
    public void testVerifyInteraction(){

        ExternalApi mockApi=mock(ExternalApi.class);

        MyService obj=new MyService(mockApi);

        obj.fetchData();

        verify(mockApi).getData();
    }
}