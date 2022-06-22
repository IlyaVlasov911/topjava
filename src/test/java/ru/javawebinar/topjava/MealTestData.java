package ru.javawebinar.topjava;

import ru.javawebinar.topjava.model.Meal;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.javawebinar.topjava.model.AbstractBaseEntity.START_SEQ;

public class MealTestData {
    public static int MEAL_ID = START_SEQ + 3;

    public static final int NOT_FOUND = 10;

    public static final Meal userMeal = new Meal(MEAL_ID, LocalDateTime.of(2020, Month.JANUARY, 30, 10, 0), "Завтрак", 500);

    public static final Meal[] userMeals = {
            userMeal,
            new Meal(MEAL_ID + 1, LocalDateTime.of(2020, Month.JANUARY, 30, 13, 0), "Обед", 1000),
            new Meal(MEAL_ID + 2, LocalDateTime.of(2020, Month.JANUARY, 30, 20, 0), "Ужин", 500),
            new Meal(MEAL_ID + 3, LocalDateTime.of(2020, Month.JANUARY, 31, 0, 0), "Еда на граничное значение", 100),
            new Meal(MEAL_ID + 4, LocalDateTime.of(2020, Month.JANUARY, 31, 10, 0), "Завтрак", 1000),
            new Meal(MEAL_ID + 5, LocalDateTime.of(2020, Month.JANUARY, 31, 13, 0), "Обед", 500),
            new Meal(MEAL_ID + 6, LocalDateTime.of(2020, Month.JANUARY, 31, 20, 0), "Ужин", 410),
    };

    public static final Meal[] adminMeals = {
            new Meal(MEAL_ID + 7, LocalDateTime.of(2020, Month.JANUARY, 30, 10, 0), "Завтрак (2)", 500),
            new Meal(MEAL_ID + 8, LocalDateTime.of(2020, Month.JANUARY, 30, 13, 0), "Обед (2)", 1000),
    };

    public static Meal getNew() {
        return new Meal(null, LocalDateTime.of(2022, Month.JANUARY, 31, 15, 0), "Ланч", 250);
    }

    public static Meal getUpdated() {
        final Meal meal = new Meal(userMeal);
        meal.setDateTime(LocalDateTime.of(2022, Month.JANUARY, 31, 15, 0));
        meal.setDescription("Ланч");
        meal.setCalories(550);
        return meal;
    }

    public static void assertMatch(Meal actual, Meal expected) {
        assertThat(actual).usingRecursiveComparison().isEqualTo(expected);
    }

    public static void assertMatch(Iterable<Meal> actual, Meal... expected) {
        assertMatch(actual, Arrays.asList(expected));
    }

    public static void assertMatch(Iterable<Meal> actual, Iterable<Meal> expected) {
        assertThat(actual).usingRecursiveComparison().isEqualTo(expected);
    }
}