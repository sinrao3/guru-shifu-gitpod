package com.thoughtworks.rectangle;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
class RectangleTest{

    @Test
    void shouldReturnAreaWhenLengthAndBreadthGiven(){
    Rectangle rectangle= new Rectangle(2.5,3.5);
    double result=rectangle.area();
        assertThat(result, is(closeTo(8.75,0.001)));
    }

    @Test
    void shouldReturPerimeterWhenLengthAndBreadthGiven(){
    Rectangle rectangle= new Rectangle(2.5,3.0);
    double result2=rectangle.perimeter();
    assertThat(result2, is(closeTo(11.0,0.001)));
    }
}
