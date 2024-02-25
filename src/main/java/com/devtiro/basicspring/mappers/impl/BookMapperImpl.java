package com.devtiro.basicspring.mappers.impl;

import com.devtiro.basicspring.domain.dto.BookDto;
import com.devtiro.basicspring.domain.entities.BookEntity;
import com.devtiro.basicspring.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BookMapperImpl implements Mapper<BookEntity, BookDto> {

    private ModelMapper modelMapper;

    public BookMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public BookDto mapTo(BookEntity book) {
        return modelMapper.map(book, BookDto.class);
    }

    @Override
    public BookEntity mapFrom(BookDto bookDto) {
        return modelMapper.map(bookDto, BookEntity.class);
    }
}
