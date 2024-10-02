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
    public partial class PointByCoordinates : IEquatable<PointByCoordinates>
    {
        /// <summary>
        /// Gets or Sets Bearing
        /// </summary>
        [DataMember(Name="bearing", EmitDefaultValue=true)]
        public int Bearing { get; set; }

        /// <summary>
        /// Gets or Sets PointCoordinates
        /// </summary>
        [Required]
        [DataMember(Name="pointCoordinates", EmitDefaultValue=false)]
        public PointCoordinates PointCoordinates { get; set; }

        /// <summary>
        /// Gets or Sets PointByCoordinatesExtensionG
        /// </summary>
        [DataMember(Name="pointByCoordinatesExtensionG", EmitDefaultValue=false)]
        public Dictionary<string, Object> PointByCoordinatesExtensionG { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PointByCoordinates {\n");
            sb.Append("  Bearing: ").Append(Bearing).Append("\n");
            sb.Append("  PointCoordinates: ").Append(PointCoordinates).Append("\n");
            sb.Append("  PointByCoordinatesExtensionG: ").Append(PointByCoordinatesExtensionG).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PointByCoordinates)obj);
        }

        /// <summary>
        /// Returns true if PointByCoordinates instances are equal
        /// </summary>
        /// <param name="other">Instance of PointByCoordinates to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PointByCoordinates other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Bearing == other.Bearing ||
                    
                    Bearing.Equals(other.Bearing)
                ) && 
                (
                    PointCoordinates == other.PointCoordinates ||
                    PointCoordinates != null &&
                    PointCoordinates.Equals(other.PointCoordinates)
                ) && 
                (
                    PointByCoordinatesExtensionG == other.PointByCoordinatesExtensionG ||
                    PointByCoordinatesExtensionG != null &&
                    other.PointByCoordinatesExtensionG != null &&
                    PointByCoordinatesExtensionG.SequenceEqual(other.PointByCoordinatesExtensionG)
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
                    
                    hashCode = hashCode * 59 + Bearing.GetHashCode();
                    if (PointCoordinates != null)
                    hashCode = hashCode * 59 + PointCoordinates.GetHashCode();
                    if (PointByCoordinatesExtensionG != null)
                    hashCode = hashCode * 59 + PointByCoordinatesExtensionG.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PointByCoordinates left, PointByCoordinates right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PointByCoordinates left, PointByCoordinates right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
