package com.tharuneniyan.pagination;

import android.content.ClipData;

import java.util.List;

class Item{
    private int reputation;
    private long user_id;
    private String user_type;
    private int accept_rate;
    private String profile_image;
    private String display_name;
    private String link;

}

class Owner{
    private Owner owner;
    private boolean is_accepted;
    private int score;
    private long last_activity_date;
    private long creation_date;
    private long answer_id;
    private long question_id;
}
public class StackApiResponse {
    List<Item> items;

     private boolean has_more;
     private int quota_max;
     private int quota_remaining;
}
