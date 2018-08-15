package resource.pageobjects;

import com.mytaxi.android_demo.R;
import android.view.View;

import org.hamcrest.Matcher;
import java.util.HashMap;


import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class ObjectRepository {

    HashMap<String, Matcher<View>> elementMap;

    public ObjectRepository() {
        elementMap =  new HashMap<String, Matcher<View>>();
        setObjectRepository();
    }

    public HashMap<String, Matcher<View>> getInstance() {
        return elementMap;
    }

    public void setObjectRepository() {
        elementMap.put("userName", withId(R.id.edt_username));

        //System.out.println("*****************"+elementMap.get("userName"));

        elementMap.put("Password", withId(R.id.edt_password));
        elementMap.put("login", withId(R.id.btn_login));
        elementMap.put("textSearch",withId(R.id.textSearch));
        elementMap.put("left_nav_button",withContentDescription("Open navigation drawer"));
        elementMap.put("logout",withText("Logout"));
        elementMap.put("Sarah Scott",withText("Sarah Scott"));
        elementMap.put("floatingActionButton",withId(R.id.fab));
    }
}
