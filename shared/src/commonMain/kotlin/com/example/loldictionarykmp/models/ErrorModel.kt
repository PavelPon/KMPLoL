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
 * @param message 
 * @param code 
 */
@Serializable

data class ErrorModel (

    @SerialName(value = "message") @Required val message: kotlin.String,

    @SerialName(value = "code") @Required val code: kotlin.Int

)

