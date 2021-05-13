package com.example.miwok;

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

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

    //method checks whether or not there is an image provided

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
