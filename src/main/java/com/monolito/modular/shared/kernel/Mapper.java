package com.monolito.modular.shared.kernel;

public interface Mapper<I, O> {

  I toDto(O entity);

  O toEntity(I dto);
}
