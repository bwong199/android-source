package com.bloc.objects;

class Song extends Object {
	// The ensemble which produced it
	Ensemble mEnsemble;
	// Title of the song
	String mTitle;
	// The year it was released
	int mYearReleased;

	/*
	 * Song
	 *
	 * Defailt Constructor
	 * Side-effects: Assigns some default ensemble, title and
	 *				 and year of your choosing
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the first Song constructor
	/************************************************/
    
    Song() {
        this(new Ensemble("The Beatles",
                          new Artist[]{new Artist("John", "Lennon"),
                              new Artist("Paul", "McCartney"),
                              new Artist("George", "Harrison"),
                              new Artist("Ringo", "Starr")}),
             "Dear Prudence", 1969);
    }

	/*
	 * Song
	 *
	 * Side-effects: Sets the year of release to 0
	 *
	 * @param ensemble the ensemble responsible (Ensemble)
	 * @param title the song title (String)
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the second Song constructor
	/************************************************/
    
    Song(Ensemble ensemble, String title){
        this.mEnsemble = ensemble;
        this.mTitle = title;
        this.mYearReleased = 0;
        
    }

	/*
	 * Song
	 *
	 * @param ensemble the ensemble responsible (Ensemble)
	 * @param title the song title (String)
	 * @param yearReleased the year the song was released (int)
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the third Song constructor
	/************************************************/
    Song (Ensemble ensemble, String title, int yearReleased){
        this.mEnsemble = ensemble;
        this.mTitle = title;
        this.mYearReleased = yearReleased;
        
    }
    
    
    
}