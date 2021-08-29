package ru.zotov.carracing.common.constant;

/**
 * @author Created by ZotovES on 17.08.2021
 * Константы
 */
public interface Constants {
    String KAFKA_GROUP_ID = "car_racing_group_id";
    String KAFKA_RACE_TOPIC = "race_start";
    String KAFKA_RACE_CANCEL_TOPIC = "race_cancel";
    String EXPAND_FUEL_SUCCESS_KAFKA_TOPIC = "fuel_success";
    String EXPAND_FUEL_FAIL_KAFKA_TOPIC = "fuel_fail";
    String KAFKA_PLAYER_TOPIC = "player";
}
