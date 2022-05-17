package com.myassistant.lotto.application.service;

import com.myassistant.common.Const;
import com.myassistant.lotto.application.port.in.CreateLottoTicketUseCase;
import com.myassistant.lotto.domain.LottoNumber;
import com.myassistant.lotto.domain.LottoTicket;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LottoTicketService implements CreateLottoTicketUseCase {


    @Override
    public LottoTicket createLottoTicket() {
        Set<LottoNumber> lottoNumbers = new HashSet<>();

        while(true) {
            lottoNumbers.add(LottoNumber.getRandomNumber());

            if (lottoNumbers.size() == Const.LOTTO_NUMBER_SIZE) {
                return new LottoTicket(new ArrayList<>(lottoNumbers));
            }
        }
    }
}
