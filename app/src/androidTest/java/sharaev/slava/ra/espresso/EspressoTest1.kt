package sharaev.slava.ra.espresso

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.Matchers.allOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import sharaev.slava.ra.ui.LoginActivity
import sharaev.slava.ra.ui.MainActivity

@RunWith(AndroidJUnit4::class)
class EspressoTest1 {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun checkLoginFieldDisplayed() {
        onView(withId(R.id.loading_view))
            .check(
                ViewAssertions.matches(
                    allOf(
                        isDisplayed(),

                    )
                )
            )
    }

 }