package databinding.sample.com.sf0404.a20171122_sampledatabinding

import android.databinding.BaseObservable
import android.databinding.Bindable

class Repository(repositoryName: String?,
                 var repositoryOwner: String?,
                 var numberOfStars: Int?,
                 var hasIssues: Boolean = false) : BaseObservable() {

    @get:Bindable
    var repositoryName: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.repositoryName)
        }
}