package coding.withze.chapterlimakmtiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coding.withze.chapterlimakmtiga.databinding.ActivityListCarBinding

class ListCarActivity : AppCompatActivity() {

    lateinit var binding : ActivityListCarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListCarBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}