package com.bloc.singletons;

import java.util.ArrayList;
import com.bloc.singletons.*;
import com.bloc.singleton.listeners.*;
import com.bloc.singleton.talkers.*;



/************************************************
 *	ASSIGNMENT:
 *	Populate this class with the defined methods.
 *
 *	This is a singleton class which maintains communication
 *	between Talker and Listener interface objects.
/************************************************/

public class Speakerphone extends Object {
    
	/*
	 * get
	 *
	 * @return the singleton instance of Speakerphone (Speakerphone)
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the get method
	/************************************************/
    

        
    private static Speakerphone sSpeakerphone;
    private static ArrayList<Listener> mListener;
    
    public static Speakerphone get(){
        if(sSpeakerphone == null){
            sSpeakerphone = new Speakerphone();
            mListener = new ArrayList<Listener>();
        }
        
        return sSpeakerPhone;
    }
    
    
    

	/*
	 * addListener
	 *
	 * Add a listener to Speakerphone's list
	 *
	 * @param listener an instance of the Listener interface (Listener)
	 * @return nothing
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the addListener method
	/************************************************/
    
    public void addListener (Listener listener){
        mListener.add(listener);
    }

	/*
	 * removeListener
	 *
	 * Remove a Listener from the Speakerphone's list
	 *
	 * @param listener the Listener to remove (Listener)
	 * @return nothing
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the removeListener method
	/************************************************/
    
    public void removeListener (Listener listener){
        mListener.remove(listener);
        
    }

	/*
	 * removeAll
	 *
	 * Removes all Listeners from Speakerphone
	 *
	 * @return nothing
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the removeAll method
	/************************************************/
    
    public void removeAll(Listener listener){
        mListener.clear();
    }
    

	/*
	 * contains
	 *
	 * Checks whether a Listener is found in the Speakerphone's
	 * collection.
	 *
	 * @param listener
	 * @return `true` if the Listener has already been added to
	 *		   the Speakerphone, `false` otherwise (boolean)
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the contains method
	/************************************************/
    
    public void contains(Listener listener){
        boolean Listener = true;
        if(Listener){
            return true;
        }
        else{
            return false;
        }
    }

	/*
	 * shoutMessage
	 *
	 * Sends the message to all of the Listeners tracked by Speakerphone
	 *
	 * @param talker a Talker whose message will be sent (Talker)
	 * @return nothing
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the shoutMessage method
	/************************************************/
    
    public void shoutMessage(Talker talker){
        String message = talker.getMessage();
        for (Listener listener : mListener){
            listener.onMessageReceived(message);
        }
        
    }

	/*
	 * shoutMessage
	 *
	 * Sends the message to all of the Listeners which are instances of
	 * the cls parameter
	 *
	 * @param talker a Talker whose message will be sent (Talker)
	 * @param cls a Class object representing the type which the Listener
	 *			  should extend from in order to receive the message (Class)
	 * @return nothing
	 *
	 * HINT: see Class.isAssignableFrom()
	 *		 http://docs.oracle.com/javase/7/docs/api/java/lang/Class.html#isAssignableFrom(java.lang.Class)
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the shoutMessage method
	/************************************************/
    
    public void shoudMessage(Talker talker, Class cls){
        String message = talker.getMessage();
        for (Listener listener : mListener){
            if(cls.isAssignableFrom(listener.getClass())){
                listener.onMessageReceived(message);
            }
        }
    }
    

}