package com.jap.streams;

import java.util.*;
import java.util.stream.Collectors;

public class CricketService {

    /**
     * Given a country and a name, find the cricketer from the entire data list of cricket players
     */
    public Optional<Cricket> getCricketerName(List<Cricket> cricketList, String cricketerName, String countryName) {


        return cricketList.stream()
                .filter(c -> c.getName().equalsIgnoreCase(cricketerName)
                        && c.getCountry().getName().equalsIgnoreCase(countryName))
                .findFirst();
    }

    /**
     * Sort the list of cricketers in alphabetical order of their names belonging to a particular country.
     */
    public List<String> getCricketerNamesForCountry(List<Cricket> cricketList, String countryName) {


        if (cricketList == null || countryName == null || countryName.isEmpty()) return null;

        return cricketList.stream()
                .filter(c -> c.getCountry().getName().equalsIgnoreCase(countryName))
                .map(Cricket::getName)
                .sorted()
                .collect(Collectors.toList());
    }

    /**
     * Search for cricketers who have played more than 50 matches
     */
    public List<Cricket> getPlayerNamePlayedMoreThan50Matches(List<Cricket> cricketList) {


        return cricketList.stream()
                .filter(c -> c.getMatchesPlayed() > 50)
                .collect(Collectors.toList());
    }

    /**
     * Find the cricketers who have scored the highest runs for their country
     */
    public Integer getHighestRunsScoredByCricketer(List<Cricket> cricketList, String countryName) {


        if (cricketList == null || cricketList.isEmpty() || countryName == null || countryName.isEmpty()) {
            return 0;
        }

        return cricketList.stream()
                .filter(c -> c.getCountry() != null && c.getCountry().getName().equalsIgnoreCase(countryName))
                .map(Cricket::getHighestScore)
                .max(Integer::compareTo)
                .orElse(0);
    }


}
