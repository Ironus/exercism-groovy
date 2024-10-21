class PhoneNumber {
    static String clean(String input) {
        input = input.replaceAll("[^\\d]", "")
        input = input[0] != '1' ? input : input.substring(1, input.size())

        if (input.size() != 10 
                || input[0] == '0' || input[0] == '1'
                || input[3] == '0' || input[3] == '1')
            throw new Exception()

        input
    }
}
