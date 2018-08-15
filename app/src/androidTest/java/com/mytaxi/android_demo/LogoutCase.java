package com.mytaxi.android_demo;

import android.support.test.runner.AndroidJUnit4;

import com.mytaxi.android_demo.activities.MainActivity;
import resource.keywordLibrary.KeywordLibrary;
import resource.pageobjects.ObjectRepository;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onIdle;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
@RunWith(AndroidJUnit4.class)
public class LogoutCase{

    KeywordLibrary key = new KeywordLibrary();

    @Rule public final ActivityRule<MainActivity> mActivityRule = new ActivityRule<>(MainActivity.class);

    ObjectRepository or = new ObjectRepository();

    @Test
    public void Logout() throws InterruptedException {

        key.verifyElement("textSearch");
        Thread.sleep(2000);
        key.clickElement("left_nav_button");
        Thread.sleep(2000);
        key.clickElement("logout");

        /*
        onView(withId(R.id.textSearch)).check(matches(isDisplayed()));
        Thread.sleep(4000);
        onView(withContentDescription("Open navigation drawer")).perform(click());
        Thread.sleep(2000);
        onView(withText("Logout")).perform(click());*/

    }

}
