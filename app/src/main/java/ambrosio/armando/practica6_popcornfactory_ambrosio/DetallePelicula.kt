package ambrosio.armando.practica6_popcornfactory_ambrosio

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DetallePelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)


        val bundle = intent.extras

        if(bundle!=null){

            iv_pelicula_imagen.setImageResource(bundle.getInt("header"))
            tv_nombre_pelicula.setText(bundle.getString("titulo"))
            tv_pelicula_desc.setText(bundle.getString("sinopsis"))
        }
    }
}