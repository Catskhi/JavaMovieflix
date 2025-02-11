package com.movieflix.controller.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

import java.time.LocalDate;
import java.util.List;

@Builder
public record MovieResponse(@Schema(type = "long", description = "Movie id")
        Long id,
        @Schema(type = "String", description = "Movie title")
        String title,
        @Schema(type = "String", description = "Movie description")
        String description,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
        @Schema(type = "Date", description = "Release date of movie. e.g: 19/01/2001")
        LocalDate releaseDate,
        @Schema(type = "double", description = "Movie score. e.g: 7.8")
        double rating,
        @Schema(type = "array", description = "List of categories ids.")
        List<CategoryResponse> categories,
        @Schema(type = "array", description = "List of streamings ids.")
        List<StreamingResponse> streamings
) {
}
