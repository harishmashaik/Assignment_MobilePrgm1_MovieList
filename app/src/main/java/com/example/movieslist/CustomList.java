package com.example.movieslist;

public class CustomList {

    private int mImgId;
    private String mMovieName, mMovieRating, mMovieDescription;

    public CustomList(int imgId,String MovieN,String movieR,String movieD)
    {
        mImgId = imgId;
        mMovieName = MovieN;
        mMovieRating = movieR;
    }

    public int getmImgId()
    {
        return mImgId;
    }
    public String getmMovieName()
    {
        return mMovieName;
    }
    public String getmMovieRating()
    {
        return mMovieRating;
    }
    public String getmMovieDescription()
    {
        return mMovieDescription;
    }
}
