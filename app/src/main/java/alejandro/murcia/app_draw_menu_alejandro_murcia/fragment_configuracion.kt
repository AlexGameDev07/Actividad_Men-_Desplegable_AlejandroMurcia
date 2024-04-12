package alejandro.murcia.app_draw_menu_alejandro_murcia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class fragment_configuracion : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    //Aquí vamos a meter todo el código
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //se guarda el la vista infalda en una variable
        //Vista inflate es la union entre la vista y el codigo
        val root = inflater.inflate(R.layout.fragment_configuracion, container, false)

        //Mandar a llamar al botón btnIngresar
        val btnIngresar = root.findViewById<Button>(R.id.btnIngresar)

        btnIngresar.setOnClickListener {
            //pongo una alerta
            Toast.makeText(context,"Hola Mundo", Toast.LENGTH_LONG).show()
        }

        return root
    }

}