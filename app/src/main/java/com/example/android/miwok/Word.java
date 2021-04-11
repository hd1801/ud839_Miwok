package com.example.android.miwok;

public class Word {
    /** Default Translation of the word**/
    private String mDefaultTranslation;
    /** Miwok Translation of the word**/
    private String mMiwokTranslation;
    /** image id for the word**/
    private int ImageResourceID;
    /** audio id for the word**/
    private int audioResourceID;

    public Word(String mDefaultTranslation, String mMiwokTranslation,int ImageResourceID) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.ImageResourceID=ImageResourceID;
    }
    public Word(String mDefaultTranslation, String mMiwokTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.ImageResourceID = 0;
    }


    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceID() { return ImageResourceID; }
}


