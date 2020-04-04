package com.mohammadalsalkini.spring5recipeapp.converters;

import com.mohammadalsalkini.spring5recipeapp.commands.NotesCommand;
import com.mohammadalsalkini.spring5recipeapp.domain.Notes;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * @author Mohammad Alsakini
 * @project Recipe-app
 * @created 04.04.2020 - 19:12
 */
@Component
public class NotesCommandToNotes implements Converter<NotesCommand, Notes> {

    @Synchronized
    @Nullable
    @Override
    public Notes convert(NotesCommand source) {
        if(source == null) {
            return null;
        }

        final Notes notes = new Notes();
        notes.setId(source.getId());
        notes.setRecipeNotes(source.getRecipeNotes());
        return notes;
    }
}