package sharaev.slava.ra.espresso.screens

import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
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

    fun checkPassHint(passHint: String) {
        Espresso.onView(ViewMatchers.withId(R.id.password_input))
            .check(
                ViewAssertions.matches(
                    Matchers.allOf(
                        ViewMatchers.isDisplayed(),
                        ViewMatchers.hasDescendant(
                            ViewMatchers.withHint(passHint)
                        )
                    )
                )
            )
    }

    fun checkLoginBtn(loginBtnLable: String) {
        Espresso.onView(ViewMatchers.withId(R.id.login_button))
            .check(
                ViewAssertions.matches(
                    Matchers.allOf(
                        ViewMatchers.isDisplayed(),
                        ViewMatchers.isClickable(),
                        ViewMatchers.withText(loginBtnLable)


                    )
            )
        )

    }

    fun typeTextLogin(loginText: String) {
        Espresso.onView(ViewMatchers.withId(R.id.login_et))
            .perform(
                ViewActions.click(), ViewActions.typeText(loginText), ViewActions.closeSoftKeyboard()
            )

    }

    fun typePass(passText: String) {
        Espresso.onView(ViewMatchers.withId(R.id.password_input))
            .perform(
                ViewActions.click(),
                ViewActions.typeText(passText),
                ViewActions.closeSoftKeyboard()
            )


    }

    fun loginBtnClick() {
        Espresso.onView(ViewMatchers.withId(R.id.login_button))
            .perform(
                ViewActions.click()
            )

    }
}