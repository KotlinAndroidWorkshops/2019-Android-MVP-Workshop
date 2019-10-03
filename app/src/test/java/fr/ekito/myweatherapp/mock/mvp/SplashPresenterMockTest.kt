package fr.ekito.myweatherapp.mock.mvp

import fr.ekito.myweatherapp.domain.entity.DailyForecast
import fr.ekito.myweatherapp.domain.repository.DailyForecastRepository
import fr.ekito.myweatherapp.util.MockitoHelper
import fr.ekito.myweatherapp.util.TestSchedulerProvider
import fr.ekito.myweatherapp.view.splash.SplashContract
import fr.ekito.myweatherapp.view.splash.SplashPresenter
import io.reactivex.Single
import org.junit.Before
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.MockitoAnnotations

class SplashPresenterMockTest {

    lateinit var presenter: SplashContract.Presenter
    @Mock
    lateinit var view: SplashContract.View
    @Mock
    lateinit var repository: DailyForecastRepository

    // TODO uncomment to use LiveData in Test
//    @get:Rule
//    val rule = InstantTaskExecutorRule()

    @Before
    fun before() {
        MockitoAnnotations.initMocks(this)

        presenter = SplashPresenter(repository, TestSchedulerProvider())
        presenter.view = view
    }

    @Test
    fun testGetLastWeather() {
        TODO("TO IMPLEMENT")
    }

    @Test
    fun testGetLasttWeatherFailed() {
        TODO("TO IMPLEMENT")
    }

    companion object {
        const val DEFAULT_LOCATION = "DEFAULT_LOCATION"
    }
}