package ru.javawebinar.topjava.service.jdbs;

import org.springframework.test.context.ActiveProfiles;
import ru.javawebinar.topjava.Profiles;
import ru.javawebinar.topjava.service.AbstractMealServiceTest;

@ActiveProfiles(Profiles.JDBC)
public class JdbsMealServiceTest extends AbstractMealServiceTest {
}
