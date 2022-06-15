package ru.javawebinar.topjava.web;

import static ru.javawebinar.topjava.util.MealsUtil.DEFAULT_CALORIES_PER_DAY;

public class SecurityUtil {

    private static int UserId = 1;

    public static int authUserId() {
        return UserId;
    }

    public static void setAuthUserId(int UserId) {
        SecurityUtil.UserId = UserId;
    }

    public static int authUserCaloriesPerDay() {
        return DEFAULT_CALORIES_PER_DAY;
    }
}