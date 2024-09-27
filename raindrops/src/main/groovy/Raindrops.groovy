class Raindrops {

    def convert(num) {
        String result = ''
        
        if (!(num % 3))
            result += 'Pling'
        if (!(num % 5))
            result += 'Plang'
        if (!(num % 7))
            result += 'Plong'
        if ((num % 3) && (num % 5) && (num % 7))
            result += num

        result
    }

}
