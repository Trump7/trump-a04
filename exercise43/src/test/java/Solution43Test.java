import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution43Test {
    WebsiteBuilder builder = new WebsiteBuilder();

    @Test
    void buildTest(){
        //figure out if the website directory was created properly
        String correct = "Created data/website/Trump";

        assertEquals(correct, builder.buildWebsite("Trump"));
    }
}
