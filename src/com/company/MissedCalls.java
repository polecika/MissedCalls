package com.company;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

public class MissedCalls {
    private Map<LocalDateTime, String> missedCalls = new TreeMap<>();

    /**
     * Добавление пропущенного вызова
     * @param contact Contact
     * @return bool
     */
    public boolean addMissedCall(Contact contact) {
        //TODO:rewrite
        return true;
    }

    /**
     * Возвращение списка пропущенных вызовов
     * @return missedCalls TreeMap
     */
    public Map<LocalDateTime, String> getMissedCalls() {
        return missedCalls;
    }

    /**
     * Очистка пропущенных вызовов
     */
    public void clearMissedCalls() {
        missedCalls.clear();
    }
}
