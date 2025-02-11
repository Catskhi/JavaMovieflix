package com.movieflix.controller.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDate;
import java.util.List;

public record MovieRequest(@Schema(type = "String", description = "Movie title")
                @NotEmpty(message = "Movie title is required.") String title,
                @Schema(type = "String", description = "Movie description")
                String description,
                @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
                @Schema(type = "date", description = "Release date of movie. e.g: 19/01/2001")
                LocalDate releaseDate,
                @Schema(type = "double", description = "Movie score. e.g: 7.8")
                double rating,
                @Schema(type = "array", description = "List of categories ids.")
                List<Long> categories,
                @Schema(type = "array", description = "List of streamings ids.")
                List<Long> streamings
) {
}
