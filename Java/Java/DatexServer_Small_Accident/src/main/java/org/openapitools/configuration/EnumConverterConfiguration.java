package org.openapitools.configuration;

import org.openapitools.model.AccidentCauseEnum;
import org.openapitools.model.AccidentTypeEnum;
import org.openapitools.model.AlertCDirectionEnum;
import org.openapitools.model.AltitudeAccuracyEnum;
import org.openapitools.model.CarriagewayEnum;
import org.openapitools.model.CollisionTypeEnum;
import org.openapitools.model.ComparisonOperatorEnum;
import org.openapitools.model.DangerousGoodsRegulationsEnum;
import org.openapitools.model.EmissionClassificationEuroEnum;
import org.openapitools.model.EmissionClassificationEuroEnumExtensionTypeG;
import org.openapitools.model.ExchangeReturnEnum;
import org.openapitools.model.ExchangeStatusEnum;
import org.openapitools.model.FuelTypeEnum;
import org.openapitools.model.HeightTypeEnum;
import org.openapitools.model.InformationStatusEnum;
import org.openapitools.model.InjuryStatusTypeEnum;
import org.openapitools.model.InvalidityReasonEnum;
import org.openapitools.model.InvolvementRolesEnum;
import org.openapitools.model.LaneEnum;
import org.openapitools.model.LaneEnumExtensionTypeG;
import org.openapitools.model.LinearDirectionEnum;
import org.openapitools.model.LoadTypeEnum;
import org.openapitools.model.LowEmissionLevelEnum;
import org.openapitools.model.ManagementTypeEnum;
import org.openapitools.model.MessageTypeEnum;
import org.openapitools.model.NamedAreaTypeEnum;
import org.openapitools.model.NutsCodeTypeEnum;
import org.openapitools.model.OperatingModeEnum;
import org.openapitools.model.PersonCategoryEnum;
import org.openapitools.model.PositionConfidenceCodedErrorEnum;
import org.openapitools.model.PredefinedServiceEnum;
import org.openapitools.model.ProbabilityOfOccurrenceEnum;
import org.openapitools.model.ProtocolTypeEnum;
import org.openapitools.model.RoadTypeEnum;
import org.openapitools.model.ServiceActionEnum;
import org.openapitools.model.ServiceActionStatusEnum;
import org.openapitools.model.SubdivisionTypeEnum;
import org.openapitools.model.UpdateMethodEnum;
import org.openapitools.model.ValidityStatusEnum;
import org.openapitools.model.VehicleEquipmentEnum;
import org.openapitools.model.VehicleStatusEnum;
import org.openapitools.model.VehicleTypeEnum;
import org.openapitools.model.VehicleTypeEnumExtensionTypeG;
import org.openapitools.model.VehicleUsageEnum;
import org.openapitools.model.WeightTypeEnum;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.accidentCauseEnumConverter")
    Converter<String, AccidentCauseEnum> accidentCauseEnumConverter() {
        return new Converter<String, AccidentCauseEnum>() {
            @Override
            public AccidentCauseEnum convert(String source) {
                return AccidentCauseEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.accidentTypeEnumConverter")
    Converter<String, AccidentTypeEnum> accidentTypeEnumConverter() {
        return new Converter<String, AccidentTypeEnum>() {
            @Override
            public AccidentTypeEnum convert(String source) {
                return AccidentTypeEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.alertCDirectionEnumConverter")
    Converter<String, AlertCDirectionEnum> alertCDirectionEnumConverter() {
        return new Converter<String, AlertCDirectionEnum>() {
            @Override
            public AlertCDirectionEnum convert(String source) {
                return AlertCDirectionEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.altitudeAccuracyEnumConverter")
    Converter<String, AltitudeAccuracyEnum> altitudeAccuracyEnumConverter() {
        return new Converter<String, AltitudeAccuracyEnum>() {
            @Override
            public AltitudeAccuracyEnum convert(String source) {
                return AltitudeAccuracyEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.carriagewayEnumConverter")
    Converter<String, CarriagewayEnum> carriagewayEnumConverter() {
        return new Converter<String, CarriagewayEnum>() {
            @Override
            public CarriagewayEnum convert(String source) {
                return CarriagewayEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.collisionTypeEnumConverter")
    Converter<String, CollisionTypeEnum> collisionTypeEnumConverter() {
        return new Converter<String, CollisionTypeEnum>() {
            @Override
            public CollisionTypeEnum convert(String source) {
                return CollisionTypeEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.comparisonOperatorEnumConverter")
    Converter<String, ComparisonOperatorEnum> comparisonOperatorEnumConverter() {
        return new Converter<String, ComparisonOperatorEnum>() {
            @Override
            public ComparisonOperatorEnum convert(String source) {
                return ComparisonOperatorEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.dangerousGoodsRegulationsEnumConverter")
    Converter<String, DangerousGoodsRegulationsEnum> dangerousGoodsRegulationsEnumConverter() {
        return new Converter<String, DangerousGoodsRegulationsEnum>() {
            @Override
            public DangerousGoodsRegulationsEnum convert(String source) {
                return DangerousGoodsRegulationsEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.emissionClassificationEuroEnumConverter")
    Converter<String, EmissionClassificationEuroEnum> emissionClassificationEuroEnumConverter() {
        return new Converter<String, EmissionClassificationEuroEnum>() {
            @Override
            public EmissionClassificationEuroEnum convert(String source) {
                return EmissionClassificationEuroEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.emissionClassificationEuroEnumExtensionTypeGConverter")
    Converter<String, EmissionClassificationEuroEnumExtensionTypeG> emissionClassificationEuroEnumExtensionTypeGConverter() {
        return new Converter<String, EmissionClassificationEuroEnumExtensionTypeG>() {
            @Override
            public EmissionClassificationEuroEnumExtensionTypeG convert(String source) {
                return EmissionClassificationEuroEnumExtensionTypeG.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.exchangeReturnEnumConverter")
    Converter<String, ExchangeReturnEnum> exchangeReturnEnumConverter() {
        return new Converter<String, ExchangeReturnEnum>() {
            @Override
            public ExchangeReturnEnum convert(String source) {
                return ExchangeReturnEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.exchangeStatusEnumConverter")
    Converter<String, ExchangeStatusEnum> exchangeStatusEnumConverter() {
        return new Converter<String, ExchangeStatusEnum>() {
            @Override
            public ExchangeStatusEnum convert(String source) {
                return ExchangeStatusEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.fuelTypeEnumConverter")
    Converter<String, FuelTypeEnum> fuelTypeEnumConverter() {
        return new Converter<String, FuelTypeEnum>() {
            @Override
            public FuelTypeEnum convert(String source) {
                return FuelTypeEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.heightTypeEnumConverter")
    Converter<String, HeightTypeEnum> heightTypeEnumConverter() {
        return new Converter<String, HeightTypeEnum>() {
            @Override
            public HeightTypeEnum convert(String source) {
                return HeightTypeEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.informationStatusEnumConverter")
    Converter<String, InformationStatusEnum> informationStatusEnumConverter() {
        return new Converter<String, InformationStatusEnum>() {
            @Override
            public InformationStatusEnum convert(String source) {
                return InformationStatusEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.injuryStatusTypeEnumConverter")
    Converter<String, InjuryStatusTypeEnum> injuryStatusTypeEnumConverter() {
        return new Converter<String, InjuryStatusTypeEnum>() {
            @Override
            public InjuryStatusTypeEnum convert(String source) {
                return InjuryStatusTypeEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.invalidityReasonEnumConverter")
    Converter<String, InvalidityReasonEnum> invalidityReasonEnumConverter() {
        return new Converter<String, InvalidityReasonEnum>() {
            @Override
            public InvalidityReasonEnum convert(String source) {
                return InvalidityReasonEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.involvementRolesEnumConverter")
    Converter<String, InvolvementRolesEnum> involvementRolesEnumConverter() {
        return new Converter<String, InvolvementRolesEnum>() {
            @Override
            public InvolvementRolesEnum convert(String source) {
                return InvolvementRolesEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.laneEnumConverter")
    Converter<String, LaneEnum> laneEnumConverter() {
        return new Converter<String, LaneEnum>() {
            @Override
            public LaneEnum convert(String source) {
                return LaneEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.laneEnumExtensionTypeGConverter")
    Converter<String, LaneEnumExtensionTypeG> laneEnumExtensionTypeGConverter() {
        return new Converter<String, LaneEnumExtensionTypeG>() {
            @Override
            public LaneEnumExtensionTypeG convert(String source) {
                return LaneEnumExtensionTypeG.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.linearDirectionEnumConverter")
    Converter<String, LinearDirectionEnum> linearDirectionEnumConverter() {
        return new Converter<String, LinearDirectionEnum>() {
            @Override
            public LinearDirectionEnum convert(String source) {
                return LinearDirectionEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.loadTypeEnumConverter")
    Converter<String, LoadTypeEnum> loadTypeEnumConverter() {
        return new Converter<String, LoadTypeEnum>() {
            @Override
            public LoadTypeEnum convert(String source) {
                return LoadTypeEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.lowEmissionLevelEnumConverter")
    Converter<String, LowEmissionLevelEnum> lowEmissionLevelEnumConverter() {
        return new Converter<String, LowEmissionLevelEnum>() {
            @Override
            public LowEmissionLevelEnum convert(String source) {
                return LowEmissionLevelEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.managementTypeEnumConverter")
    Converter<String, ManagementTypeEnum> managementTypeEnumConverter() {
        return new Converter<String, ManagementTypeEnum>() {
            @Override
            public ManagementTypeEnum convert(String source) {
                return ManagementTypeEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.messageTypeEnumConverter")
    Converter<String, MessageTypeEnum> messageTypeEnumConverter() {
        return new Converter<String, MessageTypeEnum>() {
            @Override
            public MessageTypeEnum convert(String source) {
                return MessageTypeEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.namedAreaTypeEnumConverter")
    Converter<String, NamedAreaTypeEnum> namedAreaTypeEnumConverter() {
        return new Converter<String, NamedAreaTypeEnum>() {
            @Override
            public NamedAreaTypeEnum convert(String source) {
                return NamedAreaTypeEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.nutsCodeTypeEnumConverter")
    Converter<String, NutsCodeTypeEnum> nutsCodeTypeEnumConverter() {
        return new Converter<String, NutsCodeTypeEnum>() {
            @Override
            public NutsCodeTypeEnum convert(String source) {
                return NutsCodeTypeEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.operatingModeEnumConverter")
    Converter<String, OperatingModeEnum> operatingModeEnumConverter() {
        return new Converter<String, OperatingModeEnum>() {
            @Override
            public OperatingModeEnum convert(String source) {
                return OperatingModeEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.personCategoryEnumConverter")
    Converter<String, PersonCategoryEnum> personCategoryEnumConverter() {
        return new Converter<String, PersonCategoryEnum>() {
            @Override
            public PersonCategoryEnum convert(String source) {
                return PersonCategoryEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.positionConfidenceCodedErrorEnumConverter")
    Converter<String, PositionConfidenceCodedErrorEnum> positionConfidenceCodedErrorEnumConverter() {
        return new Converter<String, PositionConfidenceCodedErrorEnum>() {
            @Override
            public PositionConfidenceCodedErrorEnum convert(String source) {
                return PositionConfidenceCodedErrorEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.predefinedServiceEnumConverter")
    Converter<String, PredefinedServiceEnum> predefinedServiceEnumConverter() {
        return new Converter<String, PredefinedServiceEnum>() {
            @Override
            public PredefinedServiceEnum convert(String source) {
                return PredefinedServiceEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.probabilityOfOccurrenceEnumConverter")
    Converter<String, ProbabilityOfOccurrenceEnum> probabilityOfOccurrenceEnumConverter() {
        return new Converter<String, ProbabilityOfOccurrenceEnum>() {
            @Override
            public ProbabilityOfOccurrenceEnum convert(String source) {
                return ProbabilityOfOccurrenceEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.protocolTypeEnumConverter")
    Converter<String, ProtocolTypeEnum> protocolTypeEnumConverter() {
        return new Converter<String, ProtocolTypeEnum>() {
            @Override
            public ProtocolTypeEnum convert(String source) {
                return ProtocolTypeEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.roadTypeEnumConverter")
    Converter<String, RoadTypeEnum> roadTypeEnumConverter() {
        return new Converter<String, RoadTypeEnum>() {
            @Override
            public RoadTypeEnum convert(String source) {
                return RoadTypeEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.serviceActionEnumConverter")
    Converter<String, ServiceActionEnum> serviceActionEnumConverter() {
        return new Converter<String, ServiceActionEnum>() {
            @Override
            public ServiceActionEnum convert(String source) {
                return ServiceActionEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.serviceActionStatusEnumConverter")
    Converter<String, ServiceActionStatusEnum> serviceActionStatusEnumConverter() {
        return new Converter<String, ServiceActionStatusEnum>() {
            @Override
            public ServiceActionStatusEnum convert(String source) {
                return ServiceActionStatusEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.subdivisionTypeEnumConverter")
    Converter<String, SubdivisionTypeEnum> subdivisionTypeEnumConverter() {
        return new Converter<String, SubdivisionTypeEnum>() {
            @Override
            public SubdivisionTypeEnum convert(String source) {
                return SubdivisionTypeEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.updateMethodEnumConverter")
    Converter<String, UpdateMethodEnum> updateMethodEnumConverter() {
        return new Converter<String, UpdateMethodEnum>() {
            @Override
            public UpdateMethodEnum convert(String source) {
                return UpdateMethodEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.validityStatusEnumConverter")
    Converter<String, ValidityStatusEnum> validityStatusEnumConverter() {
        return new Converter<String, ValidityStatusEnum>() {
            @Override
            public ValidityStatusEnum convert(String source) {
                return ValidityStatusEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.vehicleEquipmentEnumConverter")
    Converter<String, VehicleEquipmentEnum> vehicleEquipmentEnumConverter() {
        return new Converter<String, VehicleEquipmentEnum>() {
            @Override
            public VehicleEquipmentEnum convert(String source) {
                return VehicleEquipmentEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.vehicleStatusEnumConverter")
    Converter<String, VehicleStatusEnum> vehicleStatusEnumConverter() {
        return new Converter<String, VehicleStatusEnum>() {
            @Override
            public VehicleStatusEnum convert(String source) {
                return VehicleStatusEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.vehicleTypeEnumConverter")
    Converter<String, VehicleTypeEnum> vehicleTypeEnumConverter() {
        return new Converter<String, VehicleTypeEnum>() {
            @Override
            public VehicleTypeEnum convert(String source) {
                return VehicleTypeEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.vehicleTypeEnumExtensionTypeGConverter")
    Converter<String, VehicleTypeEnumExtensionTypeG> vehicleTypeEnumExtensionTypeGConverter() {
        return new Converter<String, VehicleTypeEnumExtensionTypeG>() {
            @Override
            public VehicleTypeEnumExtensionTypeG convert(String source) {
                return VehicleTypeEnumExtensionTypeG.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.vehicleUsageEnumConverter")
    Converter<String, VehicleUsageEnum> vehicleUsageEnumConverter() {
        return new Converter<String, VehicleUsageEnum>() {
            @Override
            public VehicleUsageEnum convert(String source) {
                return VehicleUsageEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.weightTypeEnumConverter")
    Converter<String, WeightTypeEnum> weightTypeEnumConverter() {
        return new Converter<String, WeightTypeEnum>() {
            @Override
            public WeightTypeEnum convert(String source) {
                return WeightTypeEnum.fromValue(source);
            }
        };
    }

}
