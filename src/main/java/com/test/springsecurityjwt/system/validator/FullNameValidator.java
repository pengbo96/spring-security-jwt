package com.test.springsecurityjwt.system.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @ClassName FullNameValidator
 * @Author FuKua
 **/
public class FullNameValidator implements ConstraintValidator<FullName,String> {

    /**
     * 2 - 15 位字母 / 数字 / 简繁体字
     */
    private static final String FULL_NAME_REG_EXP = "(?!.*\\s$)((?=\\S)(?![0-9]+$)[\\u4E00-\\u9FA5A-Za-z0-9. ' ]{2,15})";

    @Override
    public boolean isValid(String fullNameField, ConstraintValidatorContext constraintValidatorContext) {
        if (fullNameField == null) {
            // can be null
            return true;
        }
        return fullNameField.matches(FULL_NAME_REG_EXP);

    }

}
