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
 * @param type 
 * @param format 
 * @param version 
 * @param `data` 
 */
@Serializable

data class ChampionDetailData (

    @SerialName(value = "type") @Required val type: kotlin.String,

    @SerialName(value = "format") @Required val format: kotlin.String,

    @SerialName(value = "version") @Required val version: kotlin.String,

    @SerialName(value = "data") @Required val `data`: ChampionDetailDataData

)

