package org.zerock.ex2.dto;

import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Data
public class PageResultDTO<DTO, EN> {

    private List<DTO> dtoList;

    public void PageRequestDTO(Page<EN> result, Function<EN, DTO> fn){
        dtoList = result.stream().map(fn).collect(Collectors.toList());
    }
}
