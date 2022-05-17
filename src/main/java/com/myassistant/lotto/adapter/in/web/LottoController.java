package com.myassistant.lotto.adapter.in.web;

import com.myassistant.lotto.application.port.in.CreateLottoTicketUseCase;
import com.myassistant.lotto.domain.LottoTicket;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LottoController {

    private final CreateLottoTicketUseCase createLottoTicketUseCase;

    @GetMapping("/hello")
    public String hello() {
        return "Hello Lotto";
    }

    @GetMapping("/lottoTickets/auto")
    public LottoTicket lottoTicket() {
        return createLottoTicketUseCase.createLottoTicket();
    }
}
