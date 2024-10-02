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
    public partial class ServiceRequest : IEquatable<ServiceRequest>
    {
        /// <summary>
        /// Gets or Sets IdG
        /// </summary>
        [Required]
        [DataMember(Name="idG", EmitDefaultValue=false)]
        public string IdG { get; set; }

        /// <summary>
        /// Gets or Sets VersionG
        /// </summary>
        [Required]
        [DataMember(Name="versionG", EmitDefaultValue=false)]
        public string VersionG { get; set; }

        /// <summary>
        /// Gets or Sets ElementToProcessReference
        /// </summary>
        [DataMember(Name="elementToProcessReference", EmitDefaultValue=false)]
        public Reference ElementToProcessReference { get; set; }

        /// <summary>
        /// Gets or Sets ElementToProcessVersionedReference
        /// </summary>
        [DataMember(Name="elementToProcessVersionedReference", EmitDefaultValue=false)]
        public VersionedReference ElementToProcessVersionedReference { get; set; }

        /// <summary>
        /// Gets or Sets ExpiryTime
        /// </summary>
        [DataMember(Name="expiryTime", EmitDefaultValue=false)]
        public VersionedReference ExpiryTime { get; set; }

        /// <summary>
        /// Gets or Sets ExternalReference
        /// </summary>
        [MaxLength(1024)]
        [DataMember(Name="externalReference", EmitDefaultValue=false)]
        public string ExternalReference { get; set; }

        /// <summary>
        /// Gets or Sets NotPredefinedServiceName
        /// </summary>
        [MaxLength(1024)]
        [DataMember(Name="notPredefinedServiceName", EmitDefaultValue=false)]
        public string NotPredefinedServiceName { get; set; }

        /// <summary>
        /// Gets or Sets PredefinedService
        /// </summary>
        [Required]
        [DataMember(Name="predefinedService", EmitDefaultValue=false)]
        public PredefinedServiceEnumG PredefinedService { get; set; }

        /// <summary>
        /// Gets or Sets RequestedAction
        /// </summary>
        [Required]
        [DataMember(Name="requestedAction", EmitDefaultValue=false)]
        public ServiceActionEnumG RequestedAction { get; set; }

        /// <summary>
        /// Gets or Sets ServicerRequestCreationTime
        /// </summary>
        [Required]
        [DataMember(Name="servicerRequestCreationTime", EmitDefaultValue=true)]
        public DateTime ServicerRequestCreationTime { get; set; }

        /// <summary>
        /// Gets or Sets ServicerRequestVersionTime
        /// </summary>
        [Required]
        [DataMember(Name="servicerRequestVersionTime", EmitDefaultValue=true)]
        public DateTime ServicerRequestVersionTime { get; set; }

        /// <summary>
        /// Gets or Sets CustomServiceParameter
        /// </summary>
        [MaxLength(1024)]
        [DataMember(Name="customServiceParameter", EmitDefaultValue=false)]
        public string CustomServiceParameter { get; set; }

        /// <summary>
        /// Gets or Sets ServiceRequester
        /// </summary>
        [Required]
        [DataMember(Name="serviceRequester", EmitDefaultValue=false)]
        public Agent ServiceRequester { get; set; }

        /// <summary>
        /// Gets or Sets ServiceProvider
        /// </summary>
        [Required]
        [DataMember(Name="serviceProvider", EmitDefaultValue=false)]
        public List<Agent> ServiceProvider { get; set; }

        /// <summary>
        /// Gets or Sets ServiceRequestCondition
        /// </summary>
        [DataMember(Name="serviceRequestCondition", EmitDefaultValue=false)]
        public ServiceRequestCondition ServiceRequestCondition { get; set; }

        /// <summary>
        /// Gets or Sets ServiceRequestExtensionG
        /// </summary>
        [DataMember(Name="serviceRequestExtensionG", EmitDefaultValue=false)]
        public Dictionary<string, Object> ServiceRequestExtensionG { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ServiceRequest {\n");
            sb.Append("  IdG: ").Append(IdG).Append("\n");
            sb.Append("  VersionG: ").Append(VersionG).Append("\n");
            sb.Append("  ElementToProcessReference: ").Append(ElementToProcessReference).Append("\n");
            sb.Append("  ElementToProcessVersionedReference: ").Append(ElementToProcessVersionedReference).Append("\n");
            sb.Append("  ExpiryTime: ").Append(ExpiryTime).Append("\n");
            sb.Append("  ExternalReference: ").Append(ExternalReference).Append("\n");
            sb.Append("  NotPredefinedServiceName: ").Append(NotPredefinedServiceName).Append("\n");
            sb.Append("  PredefinedService: ").Append(PredefinedService).Append("\n");
            sb.Append("  RequestedAction: ").Append(RequestedAction).Append("\n");
            sb.Append("  ServicerRequestCreationTime: ").Append(ServicerRequestCreationTime).Append("\n");
            sb.Append("  ServicerRequestVersionTime: ").Append(ServicerRequestVersionTime).Append("\n");
            sb.Append("  CustomServiceParameter: ").Append(CustomServiceParameter).Append("\n");
            sb.Append("  ServiceRequester: ").Append(ServiceRequester).Append("\n");
            sb.Append("  ServiceProvider: ").Append(ServiceProvider).Append("\n");
            sb.Append("  ServiceRequestCondition: ").Append(ServiceRequestCondition).Append("\n");
            sb.Append("  ServiceRequestExtensionG: ").Append(ServiceRequestExtensionG).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ServiceRequest)obj);
        }

        /// <summary>
        /// Returns true if ServiceRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of ServiceRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ServiceRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    IdG == other.IdG ||
                    IdG != null &&
                    IdG.Equals(other.IdG)
                ) && 
                (
                    VersionG == other.VersionG ||
                    VersionG != null &&
                    VersionG.Equals(other.VersionG)
                ) && 
                (
                    ElementToProcessReference == other.ElementToProcessReference ||
                    ElementToProcessReference != null &&
                    ElementToProcessReference.Equals(other.ElementToProcessReference)
                ) && 
                (
                    ElementToProcessVersionedReference == other.ElementToProcessVersionedReference ||
                    ElementToProcessVersionedReference != null &&
                    ElementToProcessVersionedReference.Equals(other.ElementToProcessVersionedReference)
                ) && 
                (
                    ExpiryTime == other.ExpiryTime ||
                    ExpiryTime != null &&
                    ExpiryTime.Equals(other.ExpiryTime)
                ) && 
                (
                    ExternalReference == other.ExternalReference ||
                    ExternalReference != null &&
                    ExternalReference.Equals(other.ExternalReference)
                ) && 
                (
                    NotPredefinedServiceName == other.NotPredefinedServiceName ||
                    NotPredefinedServiceName != null &&
                    NotPredefinedServiceName.Equals(other.NotPredefinedServiceName)
                ) && 
                (
                    PredefinedService == other.PredefinedService ||
                    PredefinedService != null &&
                    PredefinedService.Equals(other.PredefinedService)
                ) && 
                (
                    RequestedAction == other.RequestedAction ||
                    RequestedAction != null &&
                    RequestedAction.Equals(other.RequestedAction)
                ) && 
                (
                    ServicerRequestCreationTime == other.ServicerRequestCreationTime ||
                    
                    ServicerRequestCreationTime.Equals(other.ServicerRequestCreationTime)
                ) && 
                (
                    ServicerRequestVersionTime == other.ServicerRequestVersionTime ||
                    
                    ServicerRequestVersionTime.Equals(other.ServicerRequestVersionTime)
                ) && 
                (
                    CustomServiceParameter == other.CustomServiceParameter ||
                    CustomServiceParameter != null &&
                    CustomServiceParameter.Equals(other.CustomServiceParameter)
                ) && 
                (
                    ServiceRequester == other.ServiceRequester ||
                    ServiceRequester != null &&
                    ServiceRequester.Equals(other.ServiceRequester)
                ) && 
                (
                    ServiceProvider == other.ServiceProvider ||
                    ServiceProvider != null &&
                    other.ServiceProvider != null &&
                    ServiceProvider.SequenceEqual(other.ServiceProvider)
                ) && 
                (
                    ServiceRequestCondition == other.ServiceRequestCondition ||
                    ServiceRequestCondition != null &&
                    ServiceRequestCondition.Equals(other.ServiceRequestCondition)
                ) && 
                (
                    ServiceRequestExtensionG == other.ServiceRequestExtensionG ||
                    ServiceRequestExtensionG != null &&
                    other.ServiceRequestExtensionG != null &&
                    ServiceRequestExtensionG.SequenceEqual(other.ServiceRequestExtensionG)
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
                    if (IdG != null)
                    hashCode = hashCode * 59 + IdG.GetHashCode();
                    if (VersionG != null)
                    hashCode = hashCode * 59 + VersionG.GetHashCode();
                    if (ElementToProcessReference != null)
                    hashCode = hashCode * 59 + ElementToProcessReference.GetHashCode();
                    if (ElementToProcessVersionedReference != null)
                    hashCode = hashCode * 59 + ElementToProcessVersionedReference.GetHashCode();
                    if (ExpiryTime != null)
                    hashCode = hashCode * 59 + ExpiryTime.GetHashCode();
                    if (ExternalReference != null)
                    hashCode = hashCode * 59 + ExternalReference.GetHashCode();
                    if (NotPredefinedServiceName != null)
                    hashCode = hashCode * 59 + NotPredefinedServiceName.GetHashCode();
                    if (PredefinedService != null)
                    hashCode = hashCode * 59 + PredefinedService.GetHashCode();
                    if (RequestedAction != null)
                    hashCode = hashCode * 59 + RequestedAction.GetHashCode();
                    
                    hashCode = hashCode * 59 + ServicerRequestCreationTime.GetHashCode();
                    
                    hashCode = hashCode * 59 + ServicerRequestVersionTime.GetHashCode();
                    if (CustomServiceParameter != null)
                    hashCode = hashCode * 59 + CustomServiceParameter.GetHashCode();
                    if (ServiceRequester != null)
                    hashCode = hashCode * 59 + ServiceRequester.GetHashCode();
                    if (ServiceProvider != null)
                    hashCode = hashCode * 59 + ServiceProvider.GetHashCode();
                    if (ServiceRequestCondition != null)
                    hashCode = hashCode * 59 + ServiceRequestCondition.GetHashCode();
                    if (ServiceRequestExtensionG != null)
                    hashCode = hashCode * 59 + ServiceRequestExtensionG.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ServiceRequest left, ServiceRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ServiceRequest left, ServiceRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
