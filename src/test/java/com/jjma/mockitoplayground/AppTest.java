package com.jjma.mockitoplayground;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

/**
 * Created by majo on 6/24/16.
 */
public class AppTest {

    App appObject;

    @Before
    public void create() {
        appObject = new App();
    }

    @Before
    public void mockitoCreate() {
        appObject = mock(App.class);
        when(appObject.add(1,2)).thenReturn(3);
        when(appObject.sub(4,3)).thenReturn(1);
        when(appObject.mult(3,5)).thenReturn(15);
        when(appObject.div(39,13)).thenReturn(3);
    }

    @Test
    public void testAdd() throws Exception {
        assertSame(3, appObject.add(1,2));

    }

    @Test
    public void testSub() throws Exception {
        assertSame(1, appObject.sub(4,3));
    }

    @Test
    public void testMult() throws Exception {
        assertSame(15, appObject.mult(3,5));
    }

    @Test
    public void testDiv() throws Exception {
        assertSame(3, appObject.div(39,13));
    }

    @After
    public void notifyComplete() {
        System.out.print("testing complete");
    }
}