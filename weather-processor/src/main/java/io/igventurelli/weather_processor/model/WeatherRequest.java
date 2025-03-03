package io.igventurelli.weather_processor.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "weather_request")
public class WeatherRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("type")
    private String type;

    @JsonProperty("query")
    private String query;

    @JsonProperty("language")
    private String language;

    @JsonProperty("unit")
    private String unit;
}