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
@Table(name = "weather_data")
public class WeatherData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("request")
    @OneToOne(cascade = CascadeType.ALL)
    private WeatherRequest request;

    @JsonProperty("location")
    @OneToOne(cascade = CascadeType.ALL)
    private Location location;

    @JsonProperty("current")
    @OneToOne(cascade = CascadeType.ALL)
    private CurrentWeather current;
}
