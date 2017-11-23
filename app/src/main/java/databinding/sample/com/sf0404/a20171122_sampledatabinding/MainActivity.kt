package databinding.sample.com.sf0404.a20171122_sampledatabinding

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import databinding.sample.com.sf0404.a20171122_sampledatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        binding . executePendingBindings ()
    }
}
