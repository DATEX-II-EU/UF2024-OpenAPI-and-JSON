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
    /// 
    /// </summary>
    [DataContract]
    public partial class LinearDirectionEnumG : IEquatable<LinearDirectionEnumG>
    {
        /// <summary>
        /// Gets or Sets Value
        /// </summary>
        [Required]
        [DataMember(Name="value", EmitDefaultValue=true)]
        public LinearDirectionEnum Value { get; set; }

        /// <summary>
        /// Gets or Sets ExtendedValueG
        /// </summary>
        [DataMember(Name="extendedValueG", EmitDefaultValue=false)]
        public string ExtendedValueG { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LinearDirectionEnumG {\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
            sb.Append("  ExtendedValueG: ").Append(ExtendedValueG).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (obj is null) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((LinearDirectionEnumG)obj);
        }

        /// <summary>
        /// Returns true if LinearDirectionEnumG instances are equal
        /// </summary>
        /// <param name="other">Instance of LinearDirectionEnumG to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LinearDirectionEnumG other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Value == other.Value ||
                    
                    Value.Equals(other.Value)
                ) && 
                (
                    ExtendedValueG == other.ExtendedValueG ||
                    ExtendedValueG != null &&
                    ExtendedValueG.Equals(other.ExtendedValueG)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    
                    hashCode = hashCode * 59 + Value.GetHashCode();
                    if (ExtendedValueG != null)
                    hashCode = hashCode * 59 + ExtendedValueG.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(LinearDirectionEnumG left, LinearDirectionEnumG right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(LinearDirectionEnumG left, LinearDirectionEnumG right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
