package org.ldv.savonapi.model.id

import jakarta.persistence.Embeddable
import java.io.Serializable

@Embeddable
class ResultatId (
    var caracteristiqueId:Long,
    var recetteId:Long
): Serializable {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ResultatId) return false

        if (caracteristiqueId != other.caracteristiqueId) return false
        if (recetteId != other.recetteId) return false

        return true
    }

    override fun hashCode(): Int {
        var result = caracteristiqueId.hashCode()
        result = 31 * result + recetteId.hashCode()
        return result
    }
}