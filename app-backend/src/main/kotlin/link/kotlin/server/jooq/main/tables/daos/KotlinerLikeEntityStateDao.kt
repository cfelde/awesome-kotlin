/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables.daos


import java.time.OffsetDateTime

import kotlin.collections.List

import link.kotlin.server.jooq.main.enums.LikeStateEnum
import link.kotlin.server.jooq.main.tables.KotlinerLikeEntityState
import link.kotlin.server.jooq.main.tables.records.KotlinerLikeEntityStateRecord

import org.jooq.Configuration
import org.jooq.Record2
import org.jooq.impl.DAOImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class KotlinerLikeEntityStateDao(configuration: Configuration?) : DAOImpl<KotlinerLikeEntityStateRecord, link.kotlin.server.jooq.main.tables.pojos.KotlinerLikeEntityState, Record2<Long?, Long?>>(KotlinerLikeEntityState.KOTLINER_LIKE_ENTITY_STATE, link.kotlin.server.jooq.main.tables.pojos.KotlinerLikeEntityState::class.java, configuration) {

    /**
     * Create a new KotlinerLikeEntityStateDao without any configuration
     */
    constructor(): this(null)

    override fun getId(o: link.kotlin.server.jooq.main.tables.pojos.KotlinerLikeEntityState): Record2<Long?, Long?> = compositeKeyRecord(o.kotlinerId, o.entityId)

    /**
     * Fetch records that have <code>kotliner_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfKotlinerId(lowerInclusive: Long?, upperInclusive: Long?): List<link.kotlin.server.jooq.main.tables.pojos.KotlinerLikeEntityState> = fetchRange(KotlinerLikeEntityState.KOTLINER_LIKE_ENTITY_STATE.KOTLINER_ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>kotliner_id IN (values)</code>
     */
    fun fetchByKotlinerId(vararg values: Long): List<link.kotlin.server.jooq.main.tables.pojos.KotlinerLikeEntityState> = fetch(KotlinerLikeEntityState.KOTLINER_LIKE_ENTITY_STATE.KOTLINER_ID, *values.toTypedArray())

    /**
     * Fetch records that have <code>entity_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfEntityId(lowerInclusive: Long?, upperInclusive: Long?): List<link.kotlin.server.jooq.main.tables.pojos.KotlinerLikeEntityState> = fetchRange(KotlinerLikeEntityState.KOTLINER_LIKE_ENTITY_STATE.ENTITY_ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>entity_id IN (values)</code>
     */
    fun fetchByEntityId(vararg values: Long): List<link.kotlin.server.jooq.main.tables.pojos.KotlinerLikeEntityState> = fetch(KotlinerLikeEntityState.KOTLINER_LIKE_ENTITY_STATE.ENTITY_ID, *values.toTypedArray())

    /**
     * Fetch records that have <code>like_state BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfLikeState(lowerInclusive: LikeStateEnum?, upperInclusive: LikeStateEnum?): List<link.kotlin.server.jooq.main.tables.pojos.KotlinerLikeEntityState> = fetchRange(KotlinerLikeEntityState.KOTLINER_LIKE_ENTITY_STATE.LIKE_STATE, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>like_state IN (values)</code>
     */
    fun fetchByLikeState(vararg values: LikeStateEnum): List<link.kotlin.server.jooq.main.tables.pojos.KotlinerLikeEntityState> = fetch(KotlinerLikeEntityState.KOTLINER_LIKE_ENTITY_STATE.LIKE_STATE, *values)

    /**
     * Fetch records that have <code>adjustment BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfAdjustment(lowerInclusive: Int?, upperInclusive: Int?): List<link.kotlin.server.jooq.main.tables.pojos.KotlinerLikeEntityState> = fetchRange(KotlinerLikeEntityState.KOTLINER_LIKE_ENTITY_STATE.ADJUSTMENT, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>adjustment IN (values)</code>
     */
    fun fetchByAdjustment(vararg values: Int): List<link.kotlin.server.jooq.main.tables.pojos.KotlinerLikeEntityState> = fetch(KotlinerLikeEntityState.KOTLINER_LIKE_ENTITY_STATE.ADJUSTMENT, *values.toTypedArray())

    /**
     * Fetch records that have <code>created BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfCreated(lowerInclusive: OffsetDateTime?, upperInclusive: OffsetDateTime?): List<link.kotlin.server.jooq.main.tables.pojos.KotlinerLikeEntityState> = fetchRange(KotlinerLikeEntityState.KOTLINER_LIKE_ENTITY_STATE.CREATED, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>created IN (values)</code>
     */
    fun fetchByCreated(vararg values: OffsetDateTime): List<link.kotlin.server.jooq.main.tables.pojos.KotlinerLikeEntityState> = fetch(KotlinerLikeEntityState.KOTLINER_LIKE_ENTITY_STATE.CREATED, *values)

    /**
     * Fetch records that have <code>updated BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfUpdated(lowerInclusive: OffsetDateTime?, upperInclusive: OffsetDateTime?): List<link.kotlin.server.jooq.main.tables.pojos.KotlinerLikeEntityState> = fetchRange(KotlinerLikeEntityState.KOTLINER_LIKE_ENTITY_STATE.UPDATED, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>updated IN (values)</code>
     */
    fun fetchByUpdated(vararg values: OffsetDateTime): List<link.kotlin.server.jooq.main.tables.pojos.KotlinerLikeEntityState> = fetch(KotlinerLikeEntityState.KOTLINER_LIKE_ENTITY_STATE.UPDATED, *values)
}
