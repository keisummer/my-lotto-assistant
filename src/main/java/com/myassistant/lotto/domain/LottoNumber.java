package com.myassistant.lotto.domain;

import lombok.Value;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Random;

@Value
public class LottoNumber {

    @Min(value = 1, message = "로또 번호는 1보다 작을 수 없습니다.")
    @Max(value = 45, message = "로또 번호는 45보다 클 수 없습니다.")
    int number;

    public static LottoNumber getRandomNumber() {
        Random random = new Random();
        return new LottoNumber(random.nextInt(45) + 1);
    }
}
