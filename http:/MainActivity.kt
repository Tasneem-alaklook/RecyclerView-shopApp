import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rvProducts)
        rv.layoutManager = GridLayoutManager(this, 2)

        val products = listOf(
            Product(R.drawable.camera1, "Bitzwolf B-CC1 Camera 1080P Hd Webcame", "US$48.89"),
            Product(R.drawable.camera2, "Bitzwolf B-CC1 Camera 1080P Hd Webcame", "US$55.89"),
            Product(R.drawable.camera3, "Bitzwolf B-CC1 Camera 1080P Hd Webcame", "US$78.89"),
            Product(R.drawable.camera4, "Bitzwolf B-CC1 Camera 1080P Hd Webcame", "US$88.55"),
            Product(R.drawable.camera5, "Bitzwolf B-CC1 Camera 1080P Hd Webcame", "US$23.67"),
            Product(R.drawable.camera6, "Bitzwolf B-CC1 Camera 1080P Hd Webcame", "US$44.89")
        )
        rv.adapter = ProductAdapter(products)
    }
}
