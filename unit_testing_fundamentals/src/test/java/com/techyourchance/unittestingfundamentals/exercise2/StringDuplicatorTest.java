package com.techyourchance.unittestingfundamentals.exercise2;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringDuplicatorTest {
    private StringDuplicator stringDuplicator;
    @Before
    public void setUp() throws Exception
    {
        stringDuplicator = new StringDuplicator();
    }

    @Test
    public void duplicate_suplicateString_returnDuplicated3times()
    {
        String result = stringDuplicator.duplicate("walla");
        Assert.assertThat(result, Is.is("wallawallawalla"));
    }

    @Test
    public void duplicate_suplicateString_returnDuplicated3times2()
    {
        String result = stringDuplicator.duplicate("");
        Assert.assertThat(result, Is.is(""));
    }

    @Test
    public void duplicate_suplicateString_returnDuplicated3times3()
    {
        String result = stringDuplicator.duplicate("1");
        Assert.assertThat(result, Is.is("111"));
    }
}