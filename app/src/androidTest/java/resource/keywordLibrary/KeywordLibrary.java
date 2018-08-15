package resource.keywordLibrary;

import android.support.test.espresso.matcher.RootMatchers;

import resource.pageobjects.ObjectRepository;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class KeywordLibrary {

    ObjectRepository or = new ObjectRepository();

    public void enterText(String elementName, String textToType) {

        onView(or.getInstance().get(elementName)).perform(typeText(textToType));
    }

    public void clickElement(String elementName) {
        onView(or.getInstance().get(elementName)).perform(click());
    }

    public void verifyElement(String elementName) {
        onView(or.getInstance().get(elementName)).check(matches(isDisplayed()));
    }

    public void clearElement(String elementName) {
        onView(or.getInstance().get(elementName)).perform(clearText());
    }

    public void clearClickEnter(String elementName, String textToType) {

        clearElement(elementName);
        clickElement(elementName);
        enterText(elementName, textToType);
    }

    public void clickFromListByText(String elementName) {
        onView(withText(elementName))
                .inRoot(RootMatchers.isPlatformPopup())
                .perform(click());


    }

}