package com.earlyretirement.web.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트(){

        //given
        String name = "";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        assertThat(dto.getName()).isEqualTo(name); //1, 2
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}