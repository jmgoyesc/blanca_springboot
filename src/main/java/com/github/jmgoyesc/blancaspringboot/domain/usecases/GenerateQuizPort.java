package com.github.jmgoyesc.blancaspringboot.domain.usecases;

import com.github.jmgoyesc.blancaspringboot.domain.exceptions.RepositoryException;
import com.github.jmgoyesc.blancaspringboot.domain.model.Quiz;
import com.github.jmgoyesc.blancaspringboot.domain.model.QuizConfiguration;

public interface GenerateQuizPort {
    Quiz generate(QuizConfiguration configuration) throws RepositoryException;
}
