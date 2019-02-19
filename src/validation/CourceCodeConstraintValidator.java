package validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourceCodeConstraintValidator implements ConstraintValidator<CourceCode, String> {

    private String[] coursePrefixes;

    @Override
    public void initialize(CourceCode courceCode) {
        coursePrefixes = courceCode.value();
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
        boolean result = false;
        if (theCode != null) {
            for (String tempPrefix : coursePrefixes){
            result = theCode.startsWith(tempPrefix);
            if (result) {
                break;
            }
            }
        } else {
            result = true;
        }
        return result;
    }
}
