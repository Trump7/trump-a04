import baseline.WriteWords;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution45Test {

    @Test
    void testest() throws IOException {
        ArrayList<String> temp = new ArrayList<>();
        temp.add("utilize");


        WriteWords write = new WriteWords("test1out.txt", temp);

        write.writeFile();

        File file = new File("data/test1out.txt");

        assertTrue(file.exists());

    }
}
