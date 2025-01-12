/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables.pojos


import java.io.Serializable
import java.time.OffsetDateTime


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class Topic(
    var id: Long? = null,
    var parentId: Long? = null,
    var name: String? = null,
    var description: String? = null,
    var created: OffsetDateTime? = null,
    var updated: OffsetDateTime? = null,
    var version: Long? = null
): Serializable {


    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        if (other == null)
            return false
        if (this::class != other::class)
            return false
        val o: Topic = other as Topic
        if (this.id == null) {
            if (o.id != null)
                return false
        }
        else if (this.id != o.id)
            return false
        if (this.parentId == null) {
            if (o.parentId != null)
                return false
        }
        else if (this.parentId != o.parentId)
            return false
        if (this.name == null) {
            if (o.name != null)
                return false
        }
        else if (this.name != o.name)
            return false
        if (this.description == null) {
            if (o.description != null)
                return false
        }
        else if (this.description != o.description)
            return false
        if (this.created == null) {
            if (o.created != null)
                return false
        }
        else if (this.created != o.created)
            return false
        if (this.updated == null) {
            if (o.updated != null)
                return false
        }
        else if (this.updated != o.updated)
            return false
        if (this.version == null) {
            if (o.version != null)
                return false
        }
        else if (this.version != o.version)
            return false
        return true
    }

    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        result = prime * result + (if (this.id == null) 0 else this.id.hashCode())
        result = prime * result + (if (this.parentId == null) 0 else this.parentId.hashCode())
        result = prime * result + (if (this.name == null) 0 else this.name.hashCode())
        result = prime * result + (if (this.description == null) 0 else this.description.hashCode())
        result = prime * result + (if (this.created == null) 0 else this.created.hashCode())
        result = prime * result + (if (this.updated == null) 0 else this.updated.hashCode())
        result = prime * result + (if (this.version == null) 0 else this.version.hashCode())
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder("Topic (")

        sb.append(id)
        sb.append(", ").append(parentId)
        sb.append(", ").append(name)
        sb.append(", ").append(description)
        sb.append(", ").append(created)
        sb.append(", ").append(updated)
        sb.append(", ").append(version)

        sb.append(")")
        return sb.toString()
    }
}
