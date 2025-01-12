/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables.daos


import java.time.OffsetDateTime

import kotlin.collections.List

import link.kotlin.server.jooq.main.enums.KugEventStatusEnum
import link.kotlin.server.jooq.main.tables.KugEvent
import link.kotlin.server.jooq.main.tables.records.KugEventRecord

import org.jooq.Configuration
import org.jooq.impl.DAOImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class KugEventDao(configuration: Configuration?) : DAOImpl<KugEventRecord, link.kotlin.server.jooq.main.tables.pojos.KugEvent, Long>(KugEvent.KUG_EVENT, link.kotlin.server.jooq.main.tables.pojos.KugEvent::class.java, configuration) {

    /**
     * Create a new KugEventDao without any configuration
     */
    constructor(): this(null)

    override fun getId(o: link.kotlin.server.jooq.main.tables.pojos.KugEvent): Long? = o.id

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfId(lowerInclusive: Long?, upperInclusive: Long?): List<link.kotlin.server.jooq.main.tables.pojos.KugEvent> = fetchRange(KugEvent.KUG_EVENT.ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    fun fetchById(vararg values: Long): List<link.kotlin.server.jooq.main.tables.pojos.KugEvent> = fetch(KugEvent.KUG_EVENT.ID, *values.toTypedArray())

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    fun fetchOneById(value: Long): link.kotlin.server.jooq.main.tables.pojos.KugEvent? = fetchOne(KugEvent.KUG_EVENT.ID, value)

    /**
     * Fetch records that have <code>created BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfCreated(lowerInclusive: OffsetDateTime?, upperInclusive: OffsetDateTime?): List<link.kotlin.server.jooq.main.tables.pojos.KugEvent> = fetchRange(KugEvent.KUG_EVENT.CREATED, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>created IN (values)</code>
     */
    fun fetchByCreated(vararg values: OffsetDateTime): List<link.kotlin.server.jooq.main.tables.pojos.KugEvent> = fetch(KugEvent.KUG_EVENT.CREATED, *values)

    /**
     * Fetch records that have <code>updated BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfUpdated(lowerInclusive: OffsetDateTime?, upperInclusive: OffsetDateTime?): List<link.kotlin.server.jooq.main.tables.pojos.KugEvent> = fetchRange(KugEvent.KUG_EVENT.UPDATED, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>updated IN (values)</code>
     */
    fun fetchByUpdated(vararg values: OffsetDateTime): List<link.kotlin.server.jooq.main.tables.pojos.KugEvent> = fetch(KugEvent.KUG_EVENT.UPDATED, *values)

    /**
     * Fetch records that have <code>updated_by BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfUpdatedBy(lowerInclusive: Long?, upperInclusive: Long?): List<link.kotlin.server.jooq.main.tables.pojos.KugEvent> = fetchRange(KugEvent.KUG_EVENT.UPDATED_BY, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>updated_by IN (values)</code>
     */
    fun fetchByUpdatedBy(vararg values: Long): List<link.kotlin.server.jooq.main.tables.pojos.KugEvent> = fetch(KugEvent.KUG_EVENT.UPDATED_BY, *values.toTypedArray())

    /**
     * Fetch records that have <code>status BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfStatus(lowerInclusive: KugEventStatusEnum?, upperInclusive: KugEventStatusEnum?): List<link.kotlin.server.jooq.main.tables.pojos.KugEvent> = fetchRange(KugEvent.KUG_EVENT.STATUS, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    fun fetchByStatus(vararg values: KugEventStatusEnum): List<link.kotlin.server.jooq.main.tables.pojos.KugEvent> = fetch(KugEvent.KUG_EVENT.STATUS, *values)

    /**
     * Fetch records that have <code>kug_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfKugId(lowerInclusive: Long?, upperInclusive: Long?): List<link.kotlin.server.jooq.main.tables.pojos.KugEvent> = fetchRange(KugEvent.KUG_EVENT.KUG_ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>kug_id IN (values)</code>
     */
    fun fetchByKugId(vararg values: Long): List<link.kotlin.server.jooq.main.tables.pojos.KugEvent> = fetch(KugEvent.KUG_EVENT.KUG_ID, *values.toTypedArray())

    /**
     * Fetch records that have <code>title BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfTitle(lowerInclusive: String?, upperInclusive: String?): List<link.kotlin.server.jooq.main.tables.pojos.KugEvent> = fetchRange(KugEvent.KUG_EVENT.TITLE, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>title IN (values)</code>
     */
    fun fetchByTitle(vararg values: String): List<link.kotlin.server.jooq.main.tables.pojos.KugEvent> = fetch(KugEvent.KUG_EVENT.TITLE, *values)

    /**
     * Fetch records that have <code>latitude BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfLatitude(lowerInclusive: Double?, upperInclusive: Double?): List<link.kotlin.server.jooq.main.tables.pojos.KugEvent> = fetchRange(KugEvent.KUG_EVENT.LATITUDE, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>latitude IN (values)</code>
     */
    fun fetchByLatitude(vararg values: Double): List<link.kotlin.server.jooq.main.tables.pojos.KugEvent> = fetch(KugEvent.KUG_EVENT.LATITUDE, *values.toTypedArray())

    /**
     * Fetch records that have <code>longitude BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfLongitude(lowerInclusive: Double?, upperInclusive: Double?): List<link.kotlin.server.jooq.main.tables.pojos.KugEvent> = fetchRange(KugEvent.KUG_EVENT.LONGITUDE, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>longitude IN (values)</code>
     */
    fun fetchByLongitude(vararg values: Double): List<link.kotlin.server.jooq.main.tables.pojos.KugEvent> = fetch(KugEvent.KUG_EVENT.LONGITUDE, *values.toTypedArray())

    /**
     * Fetch records that have <code>version BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfVersion(lowerInclusive: Long?, upperInclusive: Long?): List<link.kotlin.server.jooq.main.tables.pojos.KugEvent> = fetchRange(KugEvent.KUG_EVENT.VERSION, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>version IN (values)</code>
     */
    fun fetchByVersion(vararg values: Long): List<link.kotlin.server.jooq.main.tables.pojos.KugEvent> = fetch(KugEvent.KUG_EVENT.VERSION, *values.toTypedArray())
}
