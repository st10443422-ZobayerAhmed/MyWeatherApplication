package com.example.myweatherapplication

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class MainScreenTest {

    @get:Rule
    val activityRule = ActivityTestRule(mainScreen::class.java)


    @Test
    fun testClearButton() {
        // Simulate a click on the clear button
        onView(withId(R.id.btnClear)).perform(click())

        // Verify that all EditText fields are cleared
        val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
        for (day in days) {
            val minTempId = activityRule.activity.resources.getIdentifier("${day}MinTemp", "id", activityRule.activity.packageName)
            val maxTempId = activityRule.activity.resources.getIdentifier("${day}MaxTemp", "id", activityRule.activity.packageName)
            val conditionId = activityRule.activity.resources.getIdentifier("${day}Condition", "id", activityRule.activity.packageName)

            onView(withId(minTempId)).check(matches(withText("")))
            onView(withId(maxTempId)).check(matches(withText("")))
            onView(withId(conditionId)).check(matches(withText("")))
        }
    }
}
