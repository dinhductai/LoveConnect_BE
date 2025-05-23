package com.website.loveconnect.repository.query;

import org.springframework.stereotype.Component;


public class MatchQueries {
    public static final String GET_ALL_MATCH_BY_SENDER_ID =
            "SELECT m.match_id as matchId , m.match_date as matchDate, m.status as status , " +
                    "m.receiver_id as receiverId, up.full_name as fullName,\n" +
                    "up.gender as gender, up.description as description, p.photo_url as photoUrl\n" +
                    "FROM matches m \n" +
                    "left JOIN users u ON m.receiver_id = u.user_id \n" +
                    "Left join photos p on p.user_id =  u.user_id\n" +
                    "left JOIN user_profiles up ON u.user_id = up.user_id \n" +
                    "WHERE m.sender_id = :senderId and p.is_profile_picture = true and p.is_approved = true";

    public static final String GET_MATCH_BY_MATCH_ID =
            "SELECT m.match_date as matchDate, m.status as status ,up.full_name as fullName, " +
                    "up.gender as gender, up.description as description " +
                    "FROM matches m " +
                    "JOIN users u ON m.receiver_id = u.user_id " +
                    "JOIN user_profiles up ON u.user_id = up.user_id " +
                    "WHERE m.match_id = :matchId ;";

    public static final String GET_FULL_NAME_AND_PROFILE_USER_MATCHED_BY_SENDER_ID =
            "SELECT m.match_id as matchId , m.receiver_id as receiverId, up.full_name as fullName, p.photo_url as photoUrl\n" +
                    "FROM matches m \n" +
                    "left JOIN users u ON m.receiver_id = u.user_id \n" +
                    "Left join photos p on p.user_id =  u.user_id\n" +
                    "left JOIN user_profiles up ON u.user_id = up.user_id \n" +
                    "WHERE m.sender_id = :senderId and p.is_profile_picture = true and p.is_approved = true";
}
