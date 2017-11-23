package databinding.sample.com.sf0404.a20171122_sampledatabinding

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableField

class MainViewModel : ViewModel() {
    var repoModel: RepoModel = RepoModel()
    val text = ObservableField("Old data")
    val isLoading = ObservableField(false)

    private val onDataReadyCallback = object : OnDataReadyCallback {
        override fun onDataReady(data: String) {
            isLoading.set(false)
            text.set(data)
        }
    }

    fun refresh() {
        isLoading.set(true)
        repoModel.refreshData(onDataReadyCallback)
    }
}