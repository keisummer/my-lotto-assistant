package com.myassistant.lotto.domain;

import com.myassistant.common.Const;
import lombok.Getter;
import lombok.ToString;

import java.util.HashSet;
import java.util.List;

@ToString
@Getter
public class LottoTicket {

    private final List<LottoNumber> lottoNumbers;

    public LottoTicket(List<LottoNumber> lottoNumbers) {
        validateSize(lottoNumbers);
        validateDuplicate(lottoNumbers);
        this.lottoNumbers = lottoNumbers;
    }

    private void validateDuplicate(List<LottoNumber> lottoNumbers) {
        if (lottoNumbers.size() != Const.LOTTO_NUMBER_SIZE) {
            throw new IllegalArgumentException("로또 번호는 6개만 가능합니다.");
        }
    }

    private void validateSize(List<LottoNumber> lottoNumbers) {
        HashSet<LottoNumber> hashSet = new HashSet<>(lottoNumbers);
        if (hashSet.size() != Const.LOTTO_NUMBER_SIZE) {
            throw new IllegalArgumentException("로또 번호는 중복될 수 없습니다.");
        }
    }
}
