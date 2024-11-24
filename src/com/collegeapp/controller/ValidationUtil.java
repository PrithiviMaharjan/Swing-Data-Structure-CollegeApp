package com.collegeapp.util;

import java.util.regex.Pattern;

public class ValidationUtil {

    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z]+$");
    private static final Pattern LMU_ID_PATTERN = Pattern.compile("^\\d{7}$");
    private static final Pattern PROGRAM_PATTERN = Pattern.compile("^(Computing|Multimedia|Networking)$");
    private static final Pattern CONTACT_PATTERN = Pattern.compile("^98\\d{8}$");
    
    /**
     * Validates if a string is null or empty.
     *
     * @param value the string to validate
     * @return true if the string is null or empty, otherwise false
     */
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    /**
     * Validates if the name contains only alphabets.
     *
     * @param name the name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidName(String name) {
        return !isNullOrEmpty(name) && NAME_PATTERN.matcher(name).matches();
    }

    /**
     * Validates if the LMU ID is exactly 7 digits.
     *
     * @param lmuId the LMU ID to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidLmuId(int lmuId) {
        return LMU_ID_PATTERN.matcher(String.valueOf(lmuId)).matches();
    }

    /**
     * Validates if the program is one of the allowed options.
     *
     * @param program the program to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidProgram(String program) {
        return !isNullOrEmpty(program) && PROGRAM_PATTERN.matcher(program).matches();
    }

    /**
     * Validates if the contact number starts with 98 and has 10 digits in total.
     *
     * @param contact the contact number to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidContact(String contact) {
        return !isNullOrEmpty(contact) && CONTACT_PATTERN.matcher(contact).matches();
    }

    /**
     * Validates if the age is between 18 and 70 (inclusive).
     *
     * @param age the age to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidAge(short age) {
        return age >= 18 && age <= 70;
    }
}