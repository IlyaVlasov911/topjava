package ru.javawebinar.topjava.web.meal;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.to.BaseTo;
import ru.javawebinar.topjava.to.MealTo;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import static ru.javawebinar.topjava.util.ValidationUtil.errorsToString;

@RestController
@RequestMapping(value = "/profile/meals", produces = MediaType.APPLICATION_JSON_VALUE)
public class MealUIController extends AbstractMealController {

    @Override
    @GetMapping
    public List<MealTo> getAll() {
        return super.getAll();
    }

    @Override
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id) {
        super.delete(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<String> createOrUpdate(@Valid CreateMealTo createMealTo, BindingResult result) {
        if (result.hasErrors()) {
            return ResponseEntity.unprocessableEntity().body(errorsToString(result.getFieldErrors()));
        }

        Meal meal = createMealTo.toMeal();
        if (meal.isNew()) {
            super.create(meal);
        } else {
            super.update(meal, meal.id());
        }

        return ResponseEntity.ok().build();
    }

    @Override
    @GetMapping("/filter")
    public List<MealTo> getBetween(
            @RequestParam @Nullable LocalDate startDate,
            @RequestParam @Nullable LocalTime startTime,
            @RequestParam @Nullable LocalDate endDate,
            @RequestParam @Nullable LocalTime endTime) {
        return super.getBetween(startDate, startTime, endDate, endTime);
    }

    @Override
    @GetMapping("/{id}")
    public Meal get(@PathVariable int id) {
        return super.get(id);
    }

    private static class CreateMealTo extends BaseTo {
        @NotNull
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        public LocalDateTime dateTime;

        @NotBlank
        @Size(min = 2, max = 120)
        public String description;

        @NotNull
        @Range(min = 10, max = 5000)
        public Integer calories;

        public CreateMealTo(Integer id, LocalDateTime dateTime, String description, Integer calories) {
            super(id);
            this.dateTime = dateTime;
            this.description = description;
            this.calories = calories;
        }

        public Meal toMeal() {
            return new Meal(id, dateTime, description, calories);
        }
    }
}