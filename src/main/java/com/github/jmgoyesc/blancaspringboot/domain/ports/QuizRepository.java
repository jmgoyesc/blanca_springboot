package com.github.jmgoyesc.blancaspringboot.domain.ports;

import com.github.jmgoyesc.blancaspringboot.domain.exceptions.RepositoryException;
import com.github.jmgoyesc.blancaspringboot.domain.model.Quiz;

import java.util.List;

public interface QuizRepository {
    Quiz create(List<String> infinitiveVerbs) throws RepositoryException;
}
