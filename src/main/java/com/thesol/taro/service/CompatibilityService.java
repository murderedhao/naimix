package com.thesol.taro.service;

import com.thesol.taro.models.ZodiacSign;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class CompatibilityService {



    public double getCompatibility() {
        double score = 0.0;
        // TODO: Доделать метод для высчитывания совместимости (доделать методы вычисления по картам таро)


        return score;
    }

    private double getTheAgeDifference(LocalDate dateUser1, LocalDate dateUser2) {
        Period period;
        if(dateUser1.isBefore(dateUser2)) {
            period = Period.between(dateUser1, dateUser2);
        } else if(dateUser1.isAfter(dateUser2)) {
            period = Period.between(dateUser2, dateUser1);
        } else {
            period = Period.ZERO;
        }

        if(period.getYears() > 15) return 0.0;
        else return 0.2;
    }

    private ZodiacSign getZodiacSign(LocalDate birthDate) {
        int day = birthDate.getDayOfMonth();
        int month = birthDate.getMonthValue();

        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return ZodiacSign.AQUARIUS;
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            return ZodiacSign.PISCES;
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return ZodiacSign.ARIES;
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return ZodiacSign.TAURUS;
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            return ZodiacSign.GEMINI;
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            return ZodiacSign.CANCER;
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return ZodiacSign.LEO;
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return ZodiacSign.VIRGO;
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            return ZodiacSign.LIBRA;
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            return ZodiacSign.SCORPIO;
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            return ZodiacSign.SAGITTARIUS;
        } else {
            return ZodiacSign.CAPRICORN;
        }
    }
}
