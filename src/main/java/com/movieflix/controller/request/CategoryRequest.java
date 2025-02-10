package com.movieflix.controller.request;

import jakarta.validation.constraints.NotEmpty;

public record CategoryRequest(@NotEmpty(message = "Category name is required") String name) {
}
