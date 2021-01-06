import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BusStopTest {

    private BusStop busStop;
    private Person person;
    private Bus bus;

    @Before
    public void before(){
        person = new Person();
        bus = new Bus();
        busStop = new BusStop("Queens Street");
    }

    @Test
    public void queueStartsEmpty(){
        assertEquals(0, busStop.personCount());
    }

    @Test
    public void canAddPersonToQueue(){
        busStop.addPerson(person);
        assertEquals(1, busStop.personCount());
    }
}
