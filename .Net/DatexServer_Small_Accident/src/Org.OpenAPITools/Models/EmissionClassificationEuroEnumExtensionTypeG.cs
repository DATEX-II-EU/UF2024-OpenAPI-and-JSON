/*
 * DATEX II Snapshot Pull API
 *
 * This is DATEX II Snapshot PULL API returning PayloadPublication.
 *
 * The version of the OpenAPI document: 1.0.2
 * Contact: you@your-company.com
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Linq;
using System.Text;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Org.OpenAPITools.Converters;

namespace Org.OpenAPITools.Models
{ 
        /// <summary>
        /// Gets or Sets EmissionClassificationEuroEnumExtensionTypeG
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<EmissionClassificationEuroEnumExtensionTypeG>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum EmissionClassificationEuroEnumExtensionTypeG
        {
            
            /// <summary>
            /// Enum Euro0Enum for euro0
            /// </summary>
            [EnumMember(Value = "euro0")]
            Euro0Enum = 1,
            
            /// <summary>
            /// Enum Euro1Enum for euro1
            /// </summary>
            [EnumMember(Value = "euro1")]
            Euro1Enum = 2,
            
            /// <summary>
            /// Enum Euro2Enum for euro2
            /// </summary>
            [EnumMember(Value = "euro2")]
            Euro2Enum = 3,
            
            /// <summary>
            /// Enum Euro3Enum for euro3
            /// </summary>
            [EnumMember(Value = "euro3")]
            Euro3Enum = 4,
            
            /// <summary>
            /// Enum Euro4Enum for euro4
            /// </summary>
            [EnumMember(Value = "euro4")]
            Euro4Enum = 5,
            
            /// <summary>
            /// Enum Euro6dEnum for euro6d
            /// </summary>
            [EnumMember(Value = "euro6d")]
            Euro6dEnum = 6,
            
            /// <summary>
            /// Enum Euro6dTempEnum for euro6dTemp
            /// </summary>
            [EnumMember(Value = "euro6dTemp")]
            Euro6dTempEnum = 7,
            
            /// <summary>
            /// Enum EuroIVEnum for euroIV
            /// </summary>
            [EnumMember(Value = "euroIV")]
            EuroIVEnum = 8,
            
            /// <summary>
            /// Enum EuroUnknownEnum for euroUnknown
            /// </summary>
            [EnumMember(Value = "euroUnknown")]
            EuroUnknownEnum = 9,
            
            /// <summary>
            /// Enum EuroIEnum for euroI
            /// </summary>
            [EnumMember(Value = "euroI")]
            EuroIEnum = 10,
            
            /// <summary>
            /// Enum EuroIIEnum for euroII
            /// </summary>
            [EnumMember(Value = "euroII")]
            EuroIIEnum = 11,
            
            /// <summary>
            /// Enum EuroIIIEnum for euroIII
            /// </summary>
            [EnumMember(Value = "euroIII")]
            EuroIIIEnum = 12
        }
}
