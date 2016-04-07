package martinda

import java.net.URL
import org.junit.Test

public class MainTest {
    @Test
    public void testScript() throws Exception {
        URL url = getClass().getResource("/runme")
        String testScript = new File(url.getFile()).getAbsolutePath()
        println("Executing: "+testScript)
        testScript.execute()
    }
}
