class PhoneNumber {
    static String clean(String input) {
        def matcher = input =~ ~$/^(?>[\+\D1]*)([2-9]\d{2})\D*?([2-9]\d{2})\D*?(\d{4})\D*?$/$

        if (!matcher) throw new Exception ()

        matcher.group(1) + matcher.group(2) + matcher.group(3)
    }
}
