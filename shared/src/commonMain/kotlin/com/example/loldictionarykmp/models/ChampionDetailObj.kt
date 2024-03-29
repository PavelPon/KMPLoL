/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.loldictionarykmp.models

import kotlinx.serialization.*

/**
 * 
 *
 * @param id 
 * @param key 
 * @param name 
 * @param title 
 * @param image 
 * @param skins 
 * @param lore 
 * @param blurb 
 * @param allytips 
 * @param enemytips 
 * @param tags 
 * @param partype 
 * @param info 
 * @param stats 
 * @param spells 
 * @param passive 
 */
@Serializable

data class ChampionDetailObj (

    @SerialName(value = "id") @Required val id: kotlin.String,

    @SerialName(value = "key") @Required val key: kotlin.String,

    @SerialName(value = "name") @Required val name: kotlin.String,

    @SerialName(value = "title") @Required val title: kotlin.String,

    @SerialName(value = "image") @Required val image: ImageObj,

    @SerialName(value = "skins") @Required val skins: kotlin.collections.List<ChampionDetailObjSkinsInner>,

    @SerialName(value = "lore") @Required val lore: kotlin.String,

    @SerialName(value = "blurb") @Required val blurb: kotlin.String,

    @SerialName(value = "allytips") @Required val allytips: kotlin.collections.List<kotlin.String>,

    @SerialName(value = "enemytips") @Required val enemytips: kotlin.collections.List<kotlin.String>,

    @SerialName(value = "tags") @Required val tags: kotlin.collections.List<kotlin.String>,

    @SerialName(value = "partype") @Required val partype: kotlin.String,

    @SerialName(value = "info") @Required val info: InfoObj,

    @SerialName(value = "stats") @Required val stats: StatsObj,

    @SerialName(value = "spells") @Required val spells: kotlin.collections.List<ChampionDetailObjSpellsInner>,

    @SerialName(value = "passive") @Required val passive: PassiveObj

)

