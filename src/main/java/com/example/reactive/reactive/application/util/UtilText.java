package com.example.reactive.reactive.application.util;

import org.apache.commons.lang3.StringUtils;

import static com.example.reactive.reactive.application.util.UtilObject.objectIsNull;

public class UtilText {

    private static final String PATTERN_ONLY_DIGITS = "[0-9]+";
    private static final String PATTERN_ONLY_LETTERS_AND_SPACES = "[A-Za-z������������ ]+";
    private static final String FORM_REGULAR_EXPRESSION = "^{1}$";
    public static final String EMPTY = "";

    private UtilText() {
    }

    public static String getDefaultValue(String valor, String defecto) {
        return StringUtils.defaultString(valor, defecto);
    }

    public static String applyTrim(String valor) {
        return StringUtils.trimToEmpty(valor);
    }

    public static boolean isEmpty(String valor) {
        return StringUtils.EMPTY.equals(applyTrim(valor));
    }

    public static String replace(String cadena, ParameterDTO... parametros) {
        String returnString = applyTrim(cadena);

        for (ParameterDTO ParameterDTO : parametros) {
            if (!objectIsNull(ParameterDTO)) {
                returnString = returnString.replace(applyTrim(ParameterDTO.getkey()), applyTrim(ParameterDTO.getvalue()));
            }
        }

        return returnString;
    }

    public static boolean compliesPatron(String cadena, String patron) {
        return applyTrim(cadena).matches(applyTrim(patron));
    }

    public static boolean containsOnlyDigits(String cadena) {
        String regularExpression = replace(FORM_REGULAR_EXPRESSION, ParameterDTO.create("{1}", PATTERN_ONLY_DIGITS));
        return compliesPatron(cadena, regularExpression);
    }

    public static boolean containsOnlyLettersSpaces(String cadena) {
        String regularExpression = replace(FORM_REGULAR_EXPRESSION, ParameterDTO.create("{1}", PATTERN_ONLY_LETTERS_AND_SPACES));
        return compliesPatron(cadena, regularExpression);
    }
}
