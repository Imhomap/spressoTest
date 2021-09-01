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

@RunWith(AndroidJUnit4::class)
class EspressoTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(LoginActivity::class.java)

    @Test
    fun checkLoginFieldDisplayed() {
        onView(withId(R.id.login_input))
            .check(
                ViewAssertions.matches(
                    allOf(
                        isDisplayed(),
                        hasDescendant(
                            withHint("login")
                        )
                    )
                )
            )
    }

    @Test
    fun checkPassFieldDisplayed() {
        onView(withId(R.id.password_input))
            .check(
                ViewAssertions.matches(
                    allOf(
                        isDisplayed(),
                        hasDescendant(
                            withHint("password")
                        )
                    )
                )
            )
    }

    @Test
    fun checkLoginBtnDisplayed() {
        onView(withId(R.id.login_button))
            .check(
                ViewAssertions.matches(
                    allOf(
                        isDisplayed(),
                        isClickable(),
                        withText("LOGIN")

                    )
                )
            )
    }

    @Test
    fun clickLoginBtn() {
        onView(withId(R.id.login_button))
            .perform(
                click()
            )
        onView(withId(R.id.login_input))
    }

 }