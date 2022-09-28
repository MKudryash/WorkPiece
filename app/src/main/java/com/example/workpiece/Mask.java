package com.example.workpiece;

import android.os.Parcel;
import android.os.Parcelable;

public class Mask implements Parcelable {

    private int ID;
    private String Title;
    private int Count;
    private String Image;

    protected Mask(Parcel in) {
        ID = in.readInt();
        Title = in.readString();
        Count = in.readInt();
        Image = in.readString();
    }

    public static final Creator<Mask> CREATOR = new Creator<Mask>() {
        @Override
        public Mask createFromParcel(Parcel in) {
            return new Mask(in);
        }

        @Override
        public Mask[] newArray(int size) {
            return new Mask[size];
        }
    };

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setCount(int count) {
        Count = count;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getTitle() {
        return Title;
    }

    public int getCount() {
        return Count;
    }

    public String getImage() {
        return Image;
    }

    public Mask(int ID, String title, int count, String image) {
        this.ID = ID;
        Title = title;
        Count = count;
        Image = image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(ID);
        dest.writeString(Title);
        dest.writeInt(Count);
        dest.writeString(Image);
    }
}
