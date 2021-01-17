package com.github.jmgoyesc.blancaspringboot.domain.usecases;

import com.github.jmgoyesc.blancaspringboot.domain.exceptions.RepositoryException;
import com.github.jmgoyesc.blancaspringboot.domain.model.Language;
import com.github.jmgoyesc.blancaspringboot.domain.model.Quiz;
import com.github.jmgoyesc.blancaspringboot.domain.model.QuizConfiguration;
import com.github.jmgoyesc.blancaspringboot.domain.model.Verb;
import com.github.jmgoyesc.blancaspringboot.domain.ports.QuizRepository;
import com.github.jmgoyesc.blancaspringboot.domain.ports.VerbRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RequiredArgsConstructor
class GenerateQuizUseCase implements GenerateQuizPort {

    private final VerbRepository verbRepository;
    private final QuizRepository quizRepository;

    @Override
    public Quiz generate(QuizConfiguration configuration) throws RepositoryException {
        QuizCreator quizCreator = new QuizCreator(configuration);
        List<String> infinitiveVerbs = quizCreator.extractInfinitivesOfPreferredLanguage();
        return this.quizRepository.create(infinitiveVerbs);
    }

    private class QuizCreator {
        private final Language preferredLanguage;
        private final List<Verb> selectedVerbs;

        private QuizCreator(QuizConfiguration configuration) throws RepositoryException {
            this.selectedVerbs = verbRepository.findRandomVerbsByConfiguration(configuration);
            this.preferredLanguage = configuration.getPreferredLanguage();
        }

        private List<String> extractInfinitivesOfPreferredLanguage() {
            return this.selectedVerbs.stream()
                    .map(Verb::getTranslations)
                    .filter(Objects::nonNull)
                    .map(t -> t.get(this.preferredLanguage))
                    .collect(Collectors.toList());
        }

    }

}
