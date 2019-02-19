package validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourceCodeConstraintValidator implements ConstraintValidator<CourceCode, String> {

    private String coursePrefix;

    @Override
    public void initialize(CourceCode courceCode) {
        coursePrefix = courceCode.value();
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
        boolean result;
        if (theCode != null) {
            result = theCode.startsWith(coursePrefix);
        } else {
            result = true;
        }
        return result;
    }
}
