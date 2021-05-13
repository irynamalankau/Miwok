package com.example.miwok;

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    //method to get the default (English) translation
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    //method to get the miwok translation
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    //method to get image resourse ID
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
