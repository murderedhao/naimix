package com.thesol.taro.models;

import java.util.HashMap;
import java.util.Map;

public class ZodiacCompatibility {

    private static final Map<ZodiacSign, ZodiacSign[]> compatibilityMap = new HashMap<>();

    static {
        compatibilityMap.put(ZodiacSign.ARIES, new ZodiacSign[]{ZodiacSign.LEO, ZodiacSign.SAGITTARIUS,
        ZodiacSign.CAPRICORN, ZodiacSign.LIBRA});

        compatibilityMap.put(ZodiacSign.TAURUS, new ZodiacSign[]{ZodiacSign.VIRGO, ZodiacSign.CAPRICORN,
                ZodiacSign.SCORPIO, ZodiacSign.CANCER});

        compatibilityMap.put(ZodiacSign.GEMINI, new ZodiacSign[]{ZodiacSign.LIBRA, ZodiacSign.AQUARIUS,
                ZodiacSign.CANCER, ZodiacSign.VIRGO});

        compatibilityMap.put(ZodiacSign.CANCER, new ZodiacSign[]{ZodiacSign.SCORPIO, ZodiacSign.AQUARIUS,
                ZodiacSign.ARIES, ZodiacSign.GEMINI});

        compatibilityMap.put(ZodiacSign.LEO, new ZodiacSign[]{ZodiacSign.ARIES, ZodiacSign.SAGITTARIUS,
                ZodiacSign.VIRGO, ZodiacSign.CAPRICORN});

        compatibilityMap.put(ZodiacSign.VIRGO, new ZodiacSign[]{ZodiacSign.TAURUS, ZodiacSign.CAPRICORN,
                ZodiacSign.GEMINI, ZodiacSign.SAGITTARIUS});

        compatibilityMap.put(ZodiacSign.LIBRA, new ZodiacSign[]{ZodiacSign.GEMINI, ZodiacSign.AQUARIUS,
                ZodiacSign.ARIES, ZodiacSign.CANCER});

        compatibilityMap.put(ZodiacSign.SCORPIO, new ZodiacSign[]{ZodiacSign.CANCER, ZodiacSign.PISCES,
                ZodiacSign.TAURUS, ZodiacSign.LEO});

        compatibilityMap.put(ZodiacSign.SAGITTARIUS, new ZodiacSign[]{ZodiacSign.ARIES, ZodiacSign.LEO,
                ZodiacSign.VIRGO, ZodiacSign.PISCES});

        compatibilityMap.put(ZodiacSign.CAPRICORN, new ZodiacSign[]{ZodiacSign.TAURUS, ZodiacSign.VIRGO,
                ZodiacSign.LEO, ZodiacSign.ARIES});

        compatibilityMap.put(ZodiacSign.AQUARIUS, new ZodiacSign[]{ZodiacSign.GEMINI, ZodiacSign.LIBRA,
                ZodiacSign.SCORPIO, ZodiacSign.CANCER});

        compatibilityMap.put(ZodiacSign.PISCES, new ZodiacSign[]{ZodiacSign.SCORPIO, ZodiacSign.CANCER,
                ZodiacSign.TAURUS, ZodiacSign.ARIES});
    }

    public static double checkCompatibility(ZodiacSign z1, ZodiacSign z2) {
        ZodiacSign[] zodiacSigns = compatibilityMap.get(z1);
        for(ZodiacSign z : zodiacSigns) {
            if(z.equals(z2)) return 0.3;
        }
        return 0;
    }

}
