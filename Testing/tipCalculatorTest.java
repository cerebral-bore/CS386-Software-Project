package com.example.matthew.collegetoolkit;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 * Created by jjg297 on 4/20/2017.
 */
public class tipCalculatorTest {
    tipCalculator tip = mock(tipCalculator.class);
    Bundle state = new Bundle();

    @Test
    public void onCreate() throws Exception {
        tip.onCreate(state);
    }

    @Test
    public void onClick() throws Exception {
        View view = new View(tip.getBaseContext());
        tip.onClick(view);
    }

    @Test
    public void launchResultActivity() throws Exception {
        tip.launchResultActivity(100.0, 20.0);
    }

}