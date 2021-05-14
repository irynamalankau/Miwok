package com.example.miwok;

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
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

    //method to get audio resource ID
    public int getAudioResourceId(){
        return mAudioResourceId;
    }

    //method checks whether or not there is an image provided
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
