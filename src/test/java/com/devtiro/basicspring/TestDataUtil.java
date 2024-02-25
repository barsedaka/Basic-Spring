package com.devtiro.basicspring;

import com.devtiro.basicspring.domain.dto.AuthorDto;
import com.devtiro.basicspring.domain.dto.BookDto;
import com.devtiro.basicspring.domain.entities.AuthorEntity;
import com.devtiro.basicspring.domain.entities.BookEntity;

public final class TestDataUtil {

    private TestDataUtil() {

    }

    public static AuthorEntity createTestAuthorEntityA() {
        return AuthorEntity.builder()
                .id(1L)
                .name("Bar Sedaka")
                .age(26)
                .build();
    }

    public static AuthorDto createTestAuthorDtoA() {
        return AuthorDto.builder()
                .id(1L)
                .name("Bar Sedaka")
                .age(26)
                .build();
    }

    public static AuthorEntity createTestAuthorB() {
        return AuthorEntity.builder()
                .id(2L)
                .name("Avi Levi")
                .age(50)
                .build();
    }

    public static AuthorEntity createTestAuthorC() {
        return AuthorEntity.builder()
                .id(3L)
                .name("Moshe Cohen")
                .age(33)
                .build();
    }

    public static BookEntity createTestBookEntityA(final AuthorEntity authorEntity) {
        return BookEntity.builder()
                .isbn("978-1-2345-6789-0")
                .title("The Shadow in the Attic")
                .authorEntity(authorEntity)
                .build();
    }

    public static BookDto createTestBookDtoA(final AuthorDto authorDto) {
        return BookDto.builder()
                .isbn("978-1-2345-6789-0")
                .title("The Shadow in the Attic")
                .author(authorDto)
                .build();
    }

    public static BookEntity createTestBookB(final AuthorEntity authorEntity) {
        return BookEntity.builder()
                .isbn("978-1-2345-6789-1")
                .title("Beyond the Horizon")
                .authorEntity(authorEntity)
                .build();
    }

    public static BookEntity createTestBookC(final AuthorEntity authorEntity) {
        return BookEntity.builder()
                .isbn("978-1-2345-6789-2")
                .title("The Last Ember")
                .authorEntity(authorEntity)
                .build();
    }
}
