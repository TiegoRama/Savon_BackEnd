package org.ldv.savonapi.model.id

import jakarta.persistence.Embeddable
import java.io.Serializable

@Embeddable
class LigneIngredientId (
    var ingredientId:Long,
    var recetteId:Long
): Serializable {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LigneIngredientId) return false

        if (ingredientId != other.ingredientId) return false
        if (recetteId != other.recetteId) return false

        return true
    }

    override fun hashCode(): Int {
        var result = ingredientId.hashCode()
        result = 31 * result + recetteId.hashCode()
        return result
    }
}