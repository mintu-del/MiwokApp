package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId=no_ImageResource;
    private static final int no_ImageResource=-1;
    private int mAudioResourceId;


    public Word(String defaultTranslation,String miwokTranslation,int AudioResourceId){
         mDefaultTranslation=defaultTranslation;
         mMiwokTranslation=miwokTranslation;
        mAudioResourceId=AudioResourceId;
    }
    public Word(String defaultTranslation,String miwokTranslation,int imageResource,int AudioResourceId){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourceId = imageResource;
        mAudioResourceId=AudioResourceId;
    }
   public int getImageResourceId(){
        return mImageResourceId;
    }
    public boolean hasImage(){
        return mImageResourceId!=no_ImageResource;
    }
    public String getDefaultTranslation() {
       return mDefaultTranslation;
        }
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int getAudioResourceId(){
        return mAudioResourceId;
    }

}
