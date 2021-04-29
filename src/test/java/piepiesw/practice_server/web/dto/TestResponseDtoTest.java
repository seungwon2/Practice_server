package piepiesw.practice_server.web.dto;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestResponseDtoTest {
    @Test
    public void lomboktest(){
        //given
        String name = "test";
        int amount = 1000;
        //when
        TestResponseDto dto = new TestResponseDto(name, amount);
        //then
        Assertions.assertThat(dto.getName()).isEqualTo(name);
        Assertions.assertThat(dto.getAmount()).isEqualTo(amount);
    }

}