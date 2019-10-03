package fr.ekito.myweatherapp.integration

import fr.ekito.myweatherapp.data.WeatherDataSource
import fr.ekito.myweatherapp.data.json.Geocode
import fr.ekito.myweatherapp.di.onlineTestWeatherApp
import fr.ekito.myweatherapp.domain.ext.getDailyForecasts
import fr.ekito.myweatherapp.domain.ext.getLocation
import io.reactivex.schedulers.Schedulers
import junit.framework.Assert.assertNotNull
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.test.KoinTest
import org.koin.test.inject

class WeatherWebServiceTest : KoinTest {

    val weatherWebService by inject<WeatherDataSource>()

    val address = "Toulouse, France"

    @Before
    fun before() {
        startKoin {
            modules(onlineTestWeatherApp)
        }
    }

    @After
    fun after() {
        stopKoin()
    }

    @Test
    fun `get geocode`() {
        // weatherWebService.geocode(address)
        // status is OK
        TODO("TO IMPLEMENT")
    }

    @Test
    fun `get weather`() {
        //weatherWebService.weather(location.lat, location.lng, "EN")
        // assertNotNull(weather.getDailyForecasts(address).isNotEmpty())
        TODO("TO IMPLEMENT")
    }

    @Test
    fun `get weather - functional`() {
        // combine both web service call, map, flatmap
        TODO("TO IMPLEMENT")
    }

    @Test
    fun `observe weather`() {
       // observe flow - print response
        TODO("TO IMPLEMENT")
    }
}