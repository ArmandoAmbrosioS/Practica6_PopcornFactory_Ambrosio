package ambrosio.armando.practica6_popcornfactory_ambrosio

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DetalleSerie : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_serie)

        var bundle = intent.extras

        if(bundle != null){


            iv_serie_imagen.setImageResource(bundle.getInt("header"))
            tv_nombre_serie.setText(bundle.getString("titulo"))
            tv_serie_desc.setText(bundle.getString("sinopsis"))

        }
    }
}