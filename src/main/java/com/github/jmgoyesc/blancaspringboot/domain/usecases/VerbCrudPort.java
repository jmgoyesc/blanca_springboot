package com.github.jmgoyesc.blancaspringboot.domain.usecases;

import com.github.jmgoyesc.blancaspringboot.domain.exceptions.VerbCrudException;
import com.github.jmgoyesc.blancaspringboot.domain.model.Verb;

public interface VerbCrudPort {
    void create(Verb verb) throws VerbCrudException;

    void delete(Verb verb) throws VerbCrudException;

    void update(Verb verb) throws VerbCrudException;
}
