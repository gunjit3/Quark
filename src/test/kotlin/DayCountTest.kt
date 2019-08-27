import com.quark.daycounters.Actual365
import com.quark.daycounters.Actual366
import org.junit.Assert
import org.junit.Test
import java.time.LocalDate

class DayCountTest {

    @Test
    fun testActual365Days() {
        val startDate = LocalDate.of(2019, 7,2)
        val endDate = LocalDate.of(2019, 12,5)
        val startDate1 = LocalDate.of(2019, 7,2)
        val endDate1 = LocalDate.of(2020, 12,5)

        Assert.assertEquals(Actual365.days(startDate, endDate), 156)
        Assert.assertEquals(Actual365.days(startDate1, endDate1), 522)
    }

    @Test
    fun testActual365YearFraction() {
        val startDate = LocalDate.of(2019, 7,2)
        val endDate = LocalDate.of(2019, 12,5)
        val startDate1 = LocalDate.of(2019, 7,2)
        val endDate1 = LocalDate.of(2020, 12,5)

        Assert.assertEquals(Actual365.yearFraction(startDate, endDate), 0.427397, 0.000001)
        Assert.assertEquals(Actual365.yearFraction(startDate1, endDate1), 1.430137, 0.000001)
    }

    @Test
    fun testActual366Days() {
        val startDate = LocalDate.of(2019, 7,2)
        val endDate = LocalDate.of(2019, 12,5)
        val startDate1 = LocalDate.of(2019, 7,2)
        val endDate1 = LocalDate.of(2020, 12,5)

        Assert.assertEquals(Actual366.days(startDate, endDate), 156)
        Assert.assertEquals(Actual366.days(startDate1, endDate1), 522)
    }

    @Test
    fun testActual366YearFraction() {
        val startDate = LocalDate.of(2019, 7,2)
        val endDate = LocalDate.of(2019, 12,5)
        val startDate1 = LocalDate.of(2019, 7,2)
        val endDate1 = LocalDate.of(2020, 12,5)

        Assert.assertEquals(Actual366.yearFraction(startDate, endDate), 0.42623, 0.000001)
        Assert.assertEquals(Actual366.yearFraction(startDate1, endDate1), 1.42623, 0.000001)
    }
}