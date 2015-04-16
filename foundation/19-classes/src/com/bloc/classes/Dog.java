package com.bloc.classes;

class Dog {
    // The length of hair which
    final float HAIR_CUT_LENGTH = 0.15f;
    // Minimum weight that any Dog can be
    final float MIN_WEIGHT = 1.25f;
	// Amount of weight to gain after eating
	final float WEIGHT_GAIN = 0.25f;
	// Amount of weight to lose after playing
	final float WEIGHT_LOSS = 0.2f;
	// Hair length
	float mHairLength;
	// Gender, either "male" or "female"
	String mGender;
	// Size, either "tiny", "small", "average", or "large"
	String mSize;
	// Its age
	int mAge;
	// Its weight in pounds
	float mWeight;
	// The color of its coat
	String mColor;
    // Tracks the number of meals the dog ate
    int mFeedCounter;
    // Tracks the number of times the dog played
    int mPlayCounter;

	/************************************************
	 * ADD MEMBER VARIABLES HERE IF NECESSARY	
	/************************************************/
    

    
    
    
    
    
    
    
    float getHairLength(){
        return mHairLength;
    }
    
	/*
	 * getHairLength
	 *
	 * @return this Dog's hair length (float)
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getHairLength method
	/************************************************/

	/*
	 * setHairLength
	 *
	 * Sets the length of the Dog's hair (float)
	 *
	 * @param hairLength the new length of the hair (float)
	 * @return nothing
	 */
    void setHairLength(float length){
        mHairLength = length;
    }
    
    
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setHairLength method
	/************************************************/

	/*
	 * getGender
	 *
	 * @return this Dog's gender (String)
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION
    String getGender(){
        return mGender;
        
    }
    
    
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getGender method
	/************************************************/

	/*
	 * setGender
	 *
	 * Sets this Dog's gender
	 *
	 * @param gender the new gender of the Dog (String)
	 * @return nothing
	 */
    void setGender(String Gender){
        mGender = Gender;
    }
    
    
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setGender method
	/************************************************/

	/*
	 * getSize
	 *
	 * @return the size of the dog (String)
	 */
    
    String getSize(){
        return mSize;
    }
    
    
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getSize method
	/************************************************/

	/*
	 * setSize
	 *
	 * Sets the size of the Dog
	 *
	 * @param size the new size of the Dog (String)
	 * @return nothing
	 */
    
    void setSize(String size){
        mSize = size;
        
    }
    
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setSize method
	/************************************************/

	/*
	 * getAge
	 *
	 * @return this Dog's age (int)
	 */
    
    int getAge(){
        return mAge;
    
    }
    
    
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getAge method
	/************************************************/

	/*
	 * setAge
	 *
	 * Sets the age of the Dog
	 *
	 * @param age the new age of the Dog (int)
	 * @return nothing
	 */
    
    void setAge(int age){
        mAge = age;
    
    }
    
    
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setAge method
	/************************************************/

	/*
	 * getWeight
	 *
	 * @return this Dog's weight (float)
	 */
    float getWeight(){
        
        return mWeight;
    }
    
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getWeight method
	/************************************************/

	/*
	 * setWeight
	 *
	 * Sets the weight of the Dog
	 *
	 * @param weight the new weight of the Dog (float)
	 * @return nothing
	 */
    void setWeight(float weight){
        mWeight = weight;
    }
    
    
    
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setWeight method
	/************************************************/

	/*
	 * getColor
	 *
	 * @return this Dog's color (String)
	 */
    
    String getColor() {
        return mColor;
    }
    
    
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getColor method
	/************************************************/

	/*
	 * setColor
	 *
	 * Sets the color of the Dog
	 *
	 * @param color the new color of the Dog's coat (String)
	 * @return nothing
	 */
    void setColor(String color){
        mColor = color;
    }
    
    
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setColor method
	/************************************************/

	/*
	 * feed
	 *
	 * Feeds the Dog.
	 *
	 * Side-effect: 1. The Dog gains weight, specifically WEIGHT_GAIN
	 *              2. Every 3 meals, the Dog grows to a larger size, if
	 *                 possible
	 *                 i.e. "tiny" (3 meals later ->) "small" (3 meals later ->)
	 *                 "average" (3 meals later ->) "large"
	 *				   the Dog cannot exceed the "large" size or shrink smaller than
	 *				   "tiny"
	 * @return nothing
	 */
    public void feed(){
        mWeight += WEIGHT_GAIN;
        if (++mFeedCounter == 3){
            changeSize(true);
            mFeedCounter = 0;
        }
    }
    
    
    
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the feed method
	/************************************************/

	/*
	 * play
	 *
	 * Let the Dog play.
	 *
	 * Side-effect: 1. The Dog loses weight, specifically WEIGHT_LOSS
	 *				2. Every 6 play invocations, the Dog shrinks to a smaller 
	 *		   		   size, if possible i.e. "large" (6 plays later->) "average" (6 plays later->) 
	 *		   		   "small" -> "tiny"
	 *		   		3. The Dog cannot shrink to a weight smaller than
	 *		  		   MIN_WEIGHT
	 * @return nothing
	 */
    public void play(){
        setWeight(getWeight() - WEIGHT_LOSS);
        if(getWeight() < MIN_WEIGHT){
            setWeight(MIN_WEIGHT);
        }
        if (++mPlayCounter == 6){
            changeSize(false);
            mPlayCounter = 0;
        }
    }
        
    
    
    
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the play method
	/************************************************/

	/*
	 * cutHair
	 *
	 * Cut the Dog's hair.
	 *
	 * Side-effect: the Dog's hair length is reduced by HAIR_CUT_LENGTH
	 * 				The Dog's hair cannot be shorter than 0f
	 *
	 * @return nothing
	 */
     void cutHair(){
         setHairLength(getHairLength() - HAIR_CUT_LENGTH);
         if(getHairLength()< 0f){
             setHairLength(0f);
         }
       
     }
    
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the cutHair method
	/************************************************/
    void changeSize(Boolean grow){
        int sizeIndex = getSizeIndex();
        sizeIndex = sizeIndex + (grow ? 1 : -1);
        if (sizeIndex > 3){
            sizeIndex = 3;
        }
        else if (sizeIndex < 0){
            sizeIndex = 0;
        }
        setSize(fromSizeIndex(sizeIndex));
    }
    
    int getSizeIndex(){
        return getSizeIndex(getSize());
    }
    
    
    int getSizeIndex(String size){
        if (size == null){
            return 2;
        }
        
        if( "tiny".equals(size)){
            return 0;
        } else if("small".equals(size)){
            return 1;
        } else if("average".equals(size)){
            return 2;
        } else if("large".equals(size)){
            return 3;
        } else {
            return 2;
        }
    }
    
    
    String fromSizeIndex(int index){
        switch(index){
            case 0: return "tiny";
            case 1: return "small";
            case 2: return "average";
            case 3:
            default: return "large";
                
        }
        
    }
    

}
