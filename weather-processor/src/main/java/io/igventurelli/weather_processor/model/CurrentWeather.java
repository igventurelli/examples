package io.igventurelli.weather_processor.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "current_weather")
public class CurrentWeather {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("observation_time")
    private String observationTime;

    @JsonProperty("temperature")
    private Integer temperature;

    @JsonProperty("weather_code")
    private Integer weatherCode;

    @ElementCollection
    @JsonProperty("weather_icons")
    private List<String> weatherIcons;

    @ElementCollection
    @JsonProperty("weather_descriptions")
    private List<String> weatherDescriptions;

    @JsonProperty("wind_speed")
    private Integer windSpeed;

    @JsonProperty("wind_degree")
    private Integer windDegree;

    @JsonProperty("wind_dir")
    private String windDir;

    @JsonProperty("pressure")
    private Integer pressure;

    @JsonProperty("precip")
    private Double precip;

    @JsonProperty("humidity")
    private Integer humidity;

    @JsonProperty("cloudcover")
    private Integer cloudcover;

    @JsonProperty("feelslike")
    private Integer feelslike;

    @JsonProperty("uv_index")
    private Integer uvIndex;

    @JsonProperty("visibility")
    private Integer visibility;

    @JsonProperty("is_day")
    private String isDay;
}
