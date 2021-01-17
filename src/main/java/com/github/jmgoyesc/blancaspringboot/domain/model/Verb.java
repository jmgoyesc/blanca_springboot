package com.github.jmgoyesc.blancaspringboot.domain.model;

import lombok.Builder;
import lombok.Getter;

import java.util.Map;

@Builder
@Getter
public class Verb {
    private final String infinitive;
    private final String past;
    private final String perfect;
    private final Map<Language, String> translations;
}
