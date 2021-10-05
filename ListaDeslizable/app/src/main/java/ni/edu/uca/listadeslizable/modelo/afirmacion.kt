package ni.edu.uca.listadeslizable.modelo

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class afirmacion() {

    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
}