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
public class LoginCase{

    KeywordLibrary key = new KeywordLibrary();

    @Rule public final ActivityRule<MainActivity> mActivityRule = new ActivityRule<>(MainActivity.class);

    ObjectRepository or = new ObjectRepository();

    @Test
    public void Login() throws InterruptedException {

        key.enterText("userName","crazydog335");
        key.enterText("Password","venture");
        Thread.sleep(2000);
        key.clickElement("login");
        Thread.sleep(4000);
        key.verifyElement("textSearch");


        /*onView(withId(R.id.edt_username)).perform(typeText("crazydog335"));
        onView(withId(R.id.edt_password)).perform(typeText("venture"));
        onView(withId(R.id.btn_login)).perform(click());
        Thread.sleep(2000);
        onView(withId(R.id.textSearch)).check(matches(isDisplayed()));*/



    }

}
