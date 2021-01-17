package com.github.jmgoyesc.blancaspringboot.domain.model;

import lombok.Builder;

import java.util.List;

@Builder
public class Quiz {
    private final String id;
    private final List<String> infinitiveVerbs;
}
