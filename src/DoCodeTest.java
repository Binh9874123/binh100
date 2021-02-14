import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoCodeTest {


        @Test
        public void Check ()
        {
            List<Integer> result = new ArrayList<Integer>();
            result.add((int)'x');
            result.add((int)'d');
            result.add((int)'c');
            result.add((int)'l');
            result.add((int)'v');
            result.add((int)'t');

            DoCode doCode = new DoCode("table.txt");

            List<Integer> b = doCode.getS2();



            assertEquals(b , result);
        }

    }


