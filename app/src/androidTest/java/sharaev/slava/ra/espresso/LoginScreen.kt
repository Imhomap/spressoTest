package sharaev.slava.ra.espresso.screens

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import org.hamcrest.Matchers
import sharaev.slava.ra.espresso.R

object LoginScreen {

    operator fun invoke(block: LoginScreen.() -> Unit) {
        block(this)
    }

    fun checkLoginHint(loginHint: String) {
        Espresso.onView(ViewMatchers.withId(R.id.login_input))
            .check(
                ViewAssertions.matches(
                    Matchers.allOf(
                        ViewMatchers.isDisplayed(),
                        ViewMatchers.hasDescendant(
                            ViewMatchers.withHint(loginHint)
                        )
                    )
                )
            )
    }
}