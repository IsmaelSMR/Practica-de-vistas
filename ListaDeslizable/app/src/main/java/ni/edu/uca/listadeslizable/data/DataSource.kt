package ni.edu.uca.listadeslizable.data

import ni.edu.uca.listadeslizable.R
import ni.edu.uca.listadeslizable.modelo.afirmacion

class DataSource() {
}

fun DataSource(): List<afirmacion> {
    return listOf(
        afirmacion(R.string.afirmacion1, R.drawable.image1),
        afirmacion(R.string.afirmacion2, R.drawable.image2),
        afirmacion(R.string.afirmacion3, R.drawable.image3),
        afirmacion(R.string.afirmacion4, R.drawable.image4),
        afirmacion(R.string.afirmacion5, R.drawable.image5),
        afirmacion(R.string.afirmacion6, R.drawable.image6),
        afirmacion(R.string.afirmacion7, R.drawable.image7),
        afirmacion(R.string.afirmacion8, R.drawable.image8),
        afirmacion(R.string.afirmacion9, R.drawable.image9),
        afirmacion(R.string.afirmacion10, R.drawable.image10))
}

