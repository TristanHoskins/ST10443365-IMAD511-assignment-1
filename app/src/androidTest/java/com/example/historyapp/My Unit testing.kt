package com.example.historyapp

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MyUnitTesting {

    @get:Rule
    var activityRule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun clickMeButton_WithValidAge_DisplayCorrectAnswer() {
        // Type a valid age in the editTextNumber
        onView(withId(R.id.editTextNumber))
            .perform(typeText("30"), closeSoftKeyboard())

        // Click on the clickMeButton
        onView(withId(R.id.clickMeButton)).perform(click())

        // Check if the resultTextView displays the correct answer
        onView(withId(R.id.resultTextView))
            .check(matches(withText("Answer: Princess Diana died at age 32 \n She was the Princess of the united kingdom through marriage and a while known british public figure")))
    }

    @Test
    fun clickMeButton_WithInvalidAge_DisplayErrorMessage() {
        // Type an invalid age in the editTextNumber
        onView(withId(R.id.editTextNumber))
            .perform(typeText("15"), closeSoftKeyboard())

        // Click on the clickMeButton
        onView(withId(R.id.clickMeButton)).perform(click())

        // Check if the resultTextView displays the correct error message
        onView(withId(R.id.resultTextView))
            .check(matches(withText("Age is out of range. Please enter in a number between 20 and 100")))
    }
}
