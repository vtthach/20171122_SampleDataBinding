package databinding.sample.com.sf0404.a20171122_sampledatabinding

import android.os.Handler

class RepoModel {
    fun refreshData(onDataReadyCallback: OnDataReadyCallback) {
        Handler().postDelayed({ onDataReadyCallback.onDataReady("Done refresh Data") },3000)
    }
}
