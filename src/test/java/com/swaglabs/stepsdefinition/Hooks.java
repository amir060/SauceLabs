package com.swaglabs.stepsdefinition;

import com.swaglabs.base.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
   @Before
    public void setup(){
       BasePage.init_Driver();
   }
   @After
    public void tearDown(){
       BasePage.tearDown();
   }

}
