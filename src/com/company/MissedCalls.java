package com.company;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MissedCalls {
    private Map<LocalDateTime, Contact> missedCalls = new TreeMap<>();

    /**
     * Добавление пропущенного вызова
     * @param contact Contact
     * @return bool
     */
    public Contact addMissedCall(Contact contact) {
        LocalDateTime nowDatetime = LocalDateTime.now();
        return missedCalls.put(nowDatetime, contact);
    }

    /**
     * Возвращение списка пропущенных вызовов
     * @return missedCalls TreeMap
     */
    public Map<LocalDateTime, Contact> getMissedCalls() {
        return missedCalls;
    }

    /**
     * Очистка пропущенных вызовов
     */
    public void clearMissedCalls() {
        missedCalls.clear();
    }

}
