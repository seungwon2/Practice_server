package piepiesw.practice_server.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class TestResponseDto {
    private final String name;
    private final int amount;
}
