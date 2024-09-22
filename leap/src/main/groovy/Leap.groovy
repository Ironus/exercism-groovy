class Leap {

    def year

    Leap(Integer year) {
        this.year = year
    }

    def isLeapYear() {
        (year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)
    }

}
