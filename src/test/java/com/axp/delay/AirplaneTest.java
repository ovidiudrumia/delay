package com.axp.delay;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class AirplaneTest {

    @Test
    public void getMinutesDelayed_givenAirplaneAndMinutesDelayed_correctMinutesDelayedReturned() {
        Airplane airplane = new Airplane(2);

        assertThat(airplane.getMinutesDelayed()).isEqualTo(2);
    }
}
