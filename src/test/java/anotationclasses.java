import com.baseclasses.utilites.propertiesutils;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static com.baseclasses.baseuse.finalmethod;
import static com.baseclasses.baseuse.initmethod;

public class anotationclasses {

        @Before
        public void setup(){
            initmethod();
        }
        @After
        public void close() {
         finalmethod();

        }
    }


