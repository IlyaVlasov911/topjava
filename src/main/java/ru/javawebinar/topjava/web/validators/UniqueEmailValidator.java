package ru.javawebinar.topjava.web.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.javawebinar.topjava.model.User;
import ru.javawebinar.topjava.repository.UserRepository;
import ru.javawebinar.topjava.to.UserTo;


@Component
public class UniqueEmailValidator implements Validator {
    private final UserRepository userRepository;

    @Autowired
    public UniqueEmailValidator(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return UserTo.class.equals(clazz) || User.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Integer id = null;
        String email = null;

        if (target instanceof User user) {
            id = user.getId();
            email = user.getEmail();
        } else if (target instanceof UserTo userTo) {
            id = userTo.getId();
            email = userTo.getEmail();
        }

        User actualUser = userRepository.getByEmail(email);
        if (email != null && actualUser != null && !actualUser.getId().equals(id)) {
            errors.rejectValue("email", "validation.users_unique_email_idx");
        }
    }
}
