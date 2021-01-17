package com.github.jmgoyesc.blancaspringboot.domain.model;

import lombok.Builder;

import java.util.Objects;

import static com.github.jmgoyesc.blancaspringboot.domain.model.Language.English;

@Builder
public class QuizConfiguration {
    private static final Language DEFAULT_LANGUAGE = English;
    private static final int DEFAULT_NUMBER_VERBS = 10;

    private final Language preferredLanguage;
    private final int numberOfVerbs;

    public Language getPreferredLanguage() {
        return Objects.requireNonNullElse(this.preferredLanguage, DEFAULT_LANGUAGE);
    }

    public int getNumberOfVerbs() {
        return Objects.requireNonNullElse(numberOfVerbs, DEFAULT_NUMBER_VERBS);
    }
}
