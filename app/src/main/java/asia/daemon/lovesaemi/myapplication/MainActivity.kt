package asia.daemon.lovesaemi.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

/**
 * ref https://dev.classmethod.jp/smartphone/android-kotlin-introduction-02/
 */
class MainActivity : AppCompatActivity() , View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        "Kotlin".hello()

        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener(this)
    }

    fun String.hello() {
        val msg = "Hello, $this!"
        Toast.makeText(this@MainActivity,msg, Toast.LENGTH_SHORT).show()
    }

    override fun onClick(v :View?){
        Toast.makeText(this, "Tapped", Toast.LENGTH_SHORT).show()
    }
}
