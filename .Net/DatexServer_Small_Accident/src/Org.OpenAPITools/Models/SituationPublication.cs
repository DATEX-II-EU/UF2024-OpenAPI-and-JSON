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
    public partial class SituationPublication : IEquatable<SituationPublication>
    {
        /// <summary>
        /// Gets or Sets Lang
        /// </summary>
        [Required]
        [DataMember(Name="lang", EmitDefaultValue=false)]
        public string Lang { get; set; }

        /// <summary>
        /// Gets or Sets PublicationTime
        /// </summary>
        [Required]
        [DataMember(Name="publicationTime", EmitDefaultValue=true)]
        public DateTime PublicationTime { get; set; }

        /// <summary>
        /// Gets or Sets PublicationCreator
        /// </summary>
        [Required]
        [DataMember(Name="publicationCreator", EmitDefaultValue=false)]
        public InternationalIdentifier PublicationCreator { get; set; }

        /// <summary>
        /// Gets or Sets Situation
        /// </summary>
        [DataMember(Name="situation", EmitDefaultValue=false)]
        public List<Situation> Situation { get; set; }

        /// <summary>
        /// Gets or Sets PayloadPublicationExtensionG
        /// </summary>
        [DataMember(Name="payloadPublicationExtensionG", EmitDefaultValue=false)]
        public Dictionary<string, Object> PayloadPublicationExtensionG { get; set; }

        /// <summary>
        /// Gets or Sets SituationPublicationExtensionG
        /// </summary>
        [DataMember(Name="situationPublicationExtensionG", EmitDefaultValue=false)]
        public Dictionary<string, Object> SituationPublicationExtensionG { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SituationPublication {\n");
            sb.Append("  Lang: ").Append(Lang).Append("\n");
            sb.Append("  PublicationTime: ").Append(PublicationTime).Append("\n");
            sb.Append("  PublicationCreator: ").Append(PublicationCreator).Append("\n");
            sb.Append("  Situation: ").Append(Situation).Append("\n");
            sb.Append("  PayloadPublicationExtensionG: ").Append(PayloadPublicationExtensionG).Append("\n");
            sb.Append("  SituationPublicationExtensionG: ").Append(SituationPublicationExtensionG).Append("\n");
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
            return obj.GetType() == GetType() && Equals((SituationPublication)obj);
        }

        /// <summary>
        /// Returns true if SituationPublication instances are equal
        /// </summary>
        /// <param name="other">Instance of SituationPublication to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SituationPublication other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Lang == other.Lang ||
                    Lang != null &&
                    Lang.Equals(other.Lang)
                ) && 
                (
                    PublicationTime == other.PublicationTime ||
                    
                    PublicationTime.Equals(other.PublicationTime)
                ) && 
                (
                    PublicationCreator == other.PublicationCreator ||
                    PublicationCreator != null &&
                    PublicationCreator.Equals(other.PublicationCreator)
                ) && 
                (
                    Situation == other.Situation ||
                    Situation != null &&
                    other.Situation != null &&
                    Situation.SequenceEqual(other.Situation)
                ) && 
                (
                    PayloadPublicationExtensionG == other.PayloadPublicationExtensionG ||
                    PayloadPublicationExtensionG != null &&
                    other.PayloadPublicationExtensionG != null &&
                    PayloadPublicationExtensionG.SequenceEqual(other.PayloadPublicationExtensionG)
                ) && 
                (
                    SituationPublicationExtensionG == other.SituationPublicationExtensionG ||
                    SituationPublicationExtensionG != null &&
                    other.SituationPublicationExtensionG != null &&
                    SituationPublicationExtensionG.SequenceEqual(other.SituationPublicationExtensionG)
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
                    if (Lang != null)
                    hashCode = hashCode * 59 + Lang.GetHashCode();
                    
                    hashCode = hashCode * 59 + PublicationTime.GetHashCode();
                    if (PublicationCreator != null)
                    hashCode = hashCode * 59 + PublicationCreator.GetHashCode();
                    if (Situation != null)
                    hashCode = hashCode * 59 + Situation.GetHashCode();
                    if (PayloadPublicationExtensionG != null)
                    hashCode = hashCode * 59 + PayloadPublicationExtensionG.GetHashCode();
                    if (SituationPublicationExtensionG != null)
                    hashCode = hashCode * 59 + SituationPublicationExtensionG.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(SituationPublication left, SituationPublication right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(SituationPublication left, SituationPublication right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
