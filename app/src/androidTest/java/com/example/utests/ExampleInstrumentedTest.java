package com.example.utests;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>( MainActivity.class);

    @Test
    public void Correct() {
        // Type text and then press the button.
        onView(withId(R.id.nameField))
                .perform(typeText("Abil"));
        onView(withId(R.id.surnameField))
                .perform(typeText("Kuatbayev"));

        onView(withId(R.id.button)).perform(click());


//        // Check that the text was changed.
//        onView(withId(R.id.surnameField))
//                .check(matches(withText(stringToBetyped)));
    }

    @Test
    public void Incorrect() {
        // Type text and then press the button.
        onView(withId(R.id.nameField))
                .perform(typeText("abil"));
        onView(withId(R.id.surnameField))
                .perform(typeText("kuatbayev"));

        onView(withId(R.id.button)).perform(click());


//        // Check that the text was changed.
//        onView(withId(R.id.surnameField))
//                .check(matches(withText(stringToBetyped)));
    }
}
