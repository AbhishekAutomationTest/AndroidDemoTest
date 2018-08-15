package com.mytaxi.android_demo;

import android.support.test.runner.AndroidJUnit4;

import com.mytaxi.android_demo.activities.MainActivity;
import resource.keywordLibrary.KeywordLibrary;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withHint;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
//import static com.mytaxi.android_demo.activities.RecordedTest.childAtPosition;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.hasToString;
import static org.hamcrest.Matchers.is;

@RunWith(AndroidJUnit4.class)
public class SearchDriverAndCall {

    LoginCase login = new LoginCase();
    LogoutCase logout = new LogoutCase();
    KeywordLibrary key = new KeywordLibrary();

    @Rule
    public final ActivityRule<MainActivity> mActivityRule = new ActivityRule<>(MainActivity.class);

    @Test
    public void launchMainScreen() throws InterruptedException {

        login.Login();

        key.clearClickEnter("textSearch", "sa");
        Thread.sleep(4000);


        key.clickFromListByText("Sarah Scott");

        Thread.sleep(2000);

        key.verifyElement("Sarah Scott");
        key.clickElement("floatingActionButton");



        /*onView(withText("Sarah Scott"))
                .inRoot(RootMatchers.isPlatformPopup())
                .perform(click());*/

    }
}



