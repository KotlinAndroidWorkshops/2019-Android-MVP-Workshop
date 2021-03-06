package fr.ekito.myweatherapp.view.detail

import fr.ekito.myweatherapp.domain.repository.DailyForecastRepository
import fr.ekito.myweatherapp.util.mvp.RxPresenter
import fr.ekito.myweatherapp.util.rx.SchedulerProvider
import fr.ekito.myweatherapp.util.rx.with

class DetailPresenter(
    private val dailyForecastRepository: DailyForecastRepository,
    private val schedulerProvider: SchedulerProvider
) : RxPresenter<DetailContract.View>(), DetailContract.Presenter {

    override var view: DetailContract.View? = null

    override fun getDetail(id: String) {
//        launch {
//            // call repository for detail
//            dailyForecastRepository.getWeatherDetail(id)
//        }
        TODO("TO IMPLEMENT")
    }
}