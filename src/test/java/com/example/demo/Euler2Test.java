package com.example.demo;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Euler2Test {

    private Euler2 euler2;

    @Before
    public void init(){
        euler2 = new Euler2();
    }

    @Test
     public void shouldReturn2from7 (){
        //given
        int check = 7;

        //when
        int result = euler2.evenFibSum(7);

        //then
        assertThat(result,is(2));
    }

    @Test
    public void should10Returnfrom15(){
        //given
        int check = 15;

        //when
        int result = euler2.evenFibSum(15);

        //then
        assertThat(result,is(10));
    }

    @Test
    public void should44Returnfrom100(){
        //given
        int check = 100;

        //when
        int result = euler2.evenFibSum(100);

        //then
        assertThat(result,is(44));
    }
}
