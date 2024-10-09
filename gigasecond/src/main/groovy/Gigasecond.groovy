import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Month
import java.util.Date

class Gigasecond {

    static final def GIGASECOND = 1_000_000_000

    static def add(LocalDate moment) {
        add(moment.atStartOfDay())
    }

    static def add(LocalDateTime moment) {
        moment.plusSeconds(GIGASECOND)
    }
}
