package com.google.slashb410.exgroup.model.group;

import java.util.ArrayList;

/**
 * Created by Tacademy on 2017-02-03.
 */

public class ShotRes {

    public class results {

        ArrayList<Data> data = new ArrayList<>();

        public ArrayList<Data> getData() {
            return data;
        }

        public void setData(ArrayList<Data> data) {
            this.data = data;
        }

        public class Data {
            int boardType;
            String profile;
            String dateNtime;
            String summary;
            String content;
            String pic;
            int numLike;
            int numComment;

            public int getBoardType() {
                return boardType;
            }

            public void setBoardType(int boardType) {
                this.boardType = boardType;
            }

            public String getProfile() {
                return profile;
            }

            public void setProfile(String profile) {
                this.profile = profile;
            }

            public String getDateNtime() {
                return dateNtime;
            }

            public void setDateNtime(String dateNtime) {
                this.dateNtime = dateNtime;
            }

            public String getSummary() {
                return summary;
            }

            public void setSummary(String summary) {
                this.summary = summary;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public int getNumLike() {
                return numLike;
            }

            public void setNumLike(int numLike) {
                this.numLike = numLike;
            }

            public int getNumComment() {
                return numComment;
            }

            public void setNumComment(int numComment) {
                this.numComment = numComment;
            }
        }
    }
}
