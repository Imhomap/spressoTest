package sharaev.slava.ra.espresso

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import sharaev.slava.ra.espresso.screens.LoginScreen
import sharaev.slava.ra.ui.LoginActivity

@RunWith(AndroidJUnit4::class)
class HomeworkSOTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(LoginActivity::class.java)

    @Test
    fun checkLoginFieldDisplayed() {
        LoginScreen {
            checkLoginHint("login")
        }
    }

 }